package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

/*Servlet是单例模式，其内实例变量设计线程安全问题，本例演示可能出现的线程安全问题
*/
public class ServletSynchronizedTest001 extends HttpServlet {

	private String userName;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();

		String nameValue=request.getParameter("username");
		
		this.userName=nameValue;

		/*(1)这里模拟断点，因为不是IDE无法设置断点，所以设置用户名长度小于5时，线程休眠5秒
		  (2)这样可让另外一个线程输入大于5个字母的名字就可对实例变量userName重新赋值了，这样休眠的线程就报错了
		  (3)注意，休眠方法需写在赋值后，输出前，因为实际操作中，两个用户同时注册，有可能这个注册完还没输出，另一个用户又重新赋值新名字了
		*/
		if(userName.length() < 5){  
			try{
				Thread.sleep(1000*5);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

		out.print("恭喜"+this.userName+"注册成功");
		out.flush();
		out.close();
	}
}

/*解决方案：
(1)使用局部变量替代实例变量，因为局部变量仅在方法体内，方法在栈内存中执行，一个方法一片栈内存
   栈内存不共享，因此局部变量多线程也不共享
(2)实例变量在堆内存的对象内部，是共享的，如果修改的话，就存在线程安全问题
*/
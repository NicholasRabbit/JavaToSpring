package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/*线程安全问题解决方案
第一种：使用局部变量替代实例变量，局部变量在方法体内部，在栈内存里，一个方法对应一片栈内存，不共享变量
因此可避免线程安全问题
第二种：使用synchronized(){}代码块，把设计更改的语句放到代码块里执行，此方案较少使用，因为会造成用户等待时间过长，体验不好。
第三种，如果必须使用实例变量，可将Servlet对象变为多例的，即多创建几个对象
*/
public class ServletSynchronizedTest002 extends HttpServlet{
    
	//使用synchronized代码块是要放开注释，要用到这里
	//private String userName;  //这里不要用实例变量,实例变量在堆内存的对象里，是多线程共享的,
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();

			//第一种方法，使用局部变量范例
			//两次用户注册就调用两次doPost(..)方法，每次方法在栈内存里是独立的，因此局部变量是不共享的
		
			String name=request.getParameter("username");

			if(name.length() < 5){
				try{
					Thread.sleep(1000*6);   //故意输入名称长度小于5，即可让线程睡眠6S模拟断点
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
			out.print(name+"==>登录成功");
			
			
			
	 //第二种，同步代码块synchronized(){}
	 /*
	    synchronized(this){
			this.userName=request.getParameter("username");
			if(userName.length() < 5){
				try{
					Thread.sleep(1000*6);   
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
		   out.print(userName+"==>登录成功!");	
		}
	 */
	   out.flush();
	   out.close();
	}
}
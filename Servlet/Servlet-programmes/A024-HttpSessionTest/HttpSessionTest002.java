package com.javaweb.http;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;


/*HttpSession常用方法练习
*/
public class HttpSessionTest002 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
	
		//(1)void setAttribute(String name, Object obj)方法，为session对象添加属性
		HttpSession session=request.getSession(true);
		User user01=new User("Tom",8066330);
		session.setAttribute("user01",user01);
		
		System.out.println("session002："+session);  //这里可以得到HttpSessionTest001创建的session，只要浏览器不关闭，利用超链接进行跳转，就是访问的统一个session对象

		//(2)Object getAttribute(String name)获取属性
		Object userObj=session.getAttribute("user01");
		User user=(User)userObj;
		System.out.println(user);

		/*(3)void invalidate();销毁session对象  此方法优先级高于web.xml中时间的设置
			 如果不手动销毁，则系统默认保留30分钟，或者可在web.xml文件中设置服务器保存时间
			 <session-config>
				<session-timeout>60</session-timeout>  单位是分钟
			 </session-config>
		*/
		if(session != null){
			session.invalidate();     
			System.out.println("if execute");    //if语句执行，说明已经执行销毁session命令，即invalidate()方法执行		
		}
		/*if语句执行销毁命令，但是下面session02还是输出session对象，原因分析：
		  (1)访问此程序一次对话中，每次刷新都是不同的session对象，说明已把旧的session对象销毁，新请求会新建session对象
		     第一次登陆：StandardSessionFacade@6f0401f4
			 第二次刷新；StandardSessionFacade@46cf463f
		  (2)说明执行执行invalidate()方法后，是浏览器访问完此servlet程序后马上销毁，每访问一次就是一次请求，则执行一次此servlet程序
			 请求已结束就马上销毁session对象，而不是默认的浏览器关闭之后销毁
		*/
		System.out.println("session: "+session);  

	}
}
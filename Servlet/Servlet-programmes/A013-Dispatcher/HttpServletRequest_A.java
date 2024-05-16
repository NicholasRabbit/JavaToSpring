package com.javaweb.request;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.PrintWriter;
import java.io.IOException;

/*HttpServletRequest中其他方法，以及不同请求对应不同的request对象的代码验证
   
*/
public class HttpServletRequest_A extends HttpServlet { 

	
	//(11)void setAttribute(String name,Object obj)，向本次请求生成的对象中添加属性
	//注意，因为要从别的超链接访问此程序，超链接是发送get请求，所以这里要重写doGet(..)方法
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		String userName="Tom";
		request.setAttribute("userName",userName);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();

	//(12)Object getAttribute(String name),通过名称获取其对应的属性，类似与Map集合中通过key获取value
		Object nameObj=request.getAttribute("userName");
		out.print(nameObj);
	/*这里可以得到属性值"Tom",因为Tom这个属性在请求A对应的HttpServletRequest对象中
	  在另外一个程序中再验证请求B是否能得到
	*/
		
	//(13)void removeAttribute(String name),移除指定名称的值，这里代码做注释，下面还要使用这个属性
	   //request.removeAttribute("userName");
		
	   /*(14)RequestDispatcher getRequestDiapatcher(String path)
	   获取请求转发器，可将一个请求转发到另一个请求里面，本例可从A转到B,使得B输出不为null
	   注意，调用转发器后，还是在一个请求里完成的，即还是在A请求里完成的，如果点HttpServletRequest_B这个超链接，还是显示null
	   */
	   //点HttpServletRequest_A超链接回转向B
		RequestDispatcher dispatcher=request.getRequestDispatcher("/user/request_b");
		dispatcher.forward(request,response);  //调用转发器对象的forward方法，实际参数列表还是A请求生成的request对象

		out.flush();
		out.close();

	}
	

}

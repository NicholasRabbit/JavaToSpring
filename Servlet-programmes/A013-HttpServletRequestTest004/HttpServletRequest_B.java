package com.javaweb.request;

import javax.servlet.Servlet;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

/*在B这里测试是否能获取A请求中加入的属性:userName
*/											
public class HttpServletRequest_B extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		//调用Object getAttribute(String name)方法，看是否能获取request对象中的name属性值
		Object nameObj=request.getAttribute("userName");
		
		/*以下这行代码验证调用请求转发器后，是否是从A转向了B，
		  (1)点击HttpServletRequest_A超链接后，结果输出：“B输出Tom”,说明从A转向了B,即A中代码执行到获取属性值后，转向B代码里进行输出
		  (2)如果点HttpServletRequest_B超链接，则输出：”B输出null“
		  (3)去掉请求转发器代码，点A链接则只输出：”Tom“,说明没有把A的属性值给B
		*/
		out.print("B输出");  
		out.print(nameObj);
		//这里输出：null
		//说明A请求对应一个HttpServletRequest对象，而B请求对应另外一个HttpServletRequest对象，因此不能获取A对象中的nameObj
	}
}
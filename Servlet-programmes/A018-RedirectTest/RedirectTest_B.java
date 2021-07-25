package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;


public class RedirectTest_B extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();

			Object user=request.getAttribute("user");  
			out.print(user);   //输出null,无法获取A里加入的user对象，说明A和B对应不同的请求对象
			 
			out.flush();
			out.close();
	}
}


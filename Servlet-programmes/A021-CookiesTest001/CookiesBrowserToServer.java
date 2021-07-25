package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;

import java.io.IOException;

/*接收Cookie代码范例
*/
public class CookiesBrowserToServer extends HttpServlet {
	
	//注意：接收cookie要用doGet()方法
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
	
		Cookie[] cookies=request.getCookies();

		if(cookies != null){
		    for(Cookie c : cookies){
				String name=c.getName();
				String value=c.getValue();
				System.out.println(name+"="+value);
		   }

		   response.sendRedirect("/A021-CookiesTest001/html/success.html");

		}else{
			System.out.println("cookie is invalid.");
		}
		
	}
}
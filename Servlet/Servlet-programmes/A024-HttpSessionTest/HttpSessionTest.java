package com.javaweb.http;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

/*(1)一次请求对应一个session对象，一次请求就是打开一次浏览器到关闭这个过程
  (2)Http这几个类的范围：ServeltContext > HttpSession > HttpServletRequest	
*/
public class HttpSessionTest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		System.out.println("session: "+session);
	}
}
package com.springmvc.servletAPI;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller       //这里要加Spring的四大注解之一，否则Spring框架无法创建对象
public class ServletAPITest {
	
	/*形参可以直接用Servlet相关接口，不必用String username或User user等方式接收数据
	 *接收方式跟普通servlet写法一样，可以不用Spring框架的转发器，用Servlet的方式也可
	 * */
	@RequestMapping(value="/servlet",method=RequestMethod.POST)
	public void servletAPI(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		System.out.println("request="+request+", "+"response="+response);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username+"="+password);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/done.jsp");
		dispatcher.forward(request,response);    //这里有异常，可直接抛出，Spring框架会处理，但建议try,catch捕捉
	}
	
	
}

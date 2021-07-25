package com.servlet.myjava;   //这里有包名，注意web.xml里<servlet-class>里类名的写法

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletContext;

import javax.servlet.ServletException;

import java.io.IOException;


public class ServletContextTest002 implements Servlet {

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;   //把Tomcat传来的config实参赋值给实例变量，供下面使用
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException {
		
		//本例与001对比测试验证一个webapp下的Servlet是不是共用一个ServletContext
		ServletConfig config=getServletConfig();
		ServletContext application=config.getServletContext();
		System.out.println("ServletContext002: "+application);
		
		
	}

	public ServletConfig getServletConfig(){
		return this.config;
	}

	public String getServletInfo(){
		return null;
	}

	public void destroy(){
	
	}
}
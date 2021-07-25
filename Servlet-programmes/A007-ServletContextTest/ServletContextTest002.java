package com.servlet.myjava;   //�����а�����ע��web.xml��<servlet-class>��������д��

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
		this.config=config;   //��Tomcat������configʵ�θ�ֵ��ʵ��������������ʹ��
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException {
		
		//������001�ԱȲ�����֤һ��webapp�µ�Servlet�ǲ��ǹ���һ��ServletContext
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
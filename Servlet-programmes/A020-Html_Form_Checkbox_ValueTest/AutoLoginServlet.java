package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

import java.io.IOException;

public class AutoLoginServlet extends GenericServlet {

	/*本范例测试验证多选框提交的value值是什么
		(1)如果多选框不设置value,则如果勾选，提交的value默认是on,不勾选是null
		(2)如果手动设置例如value="ok"属性的值,如果勾选则提交ok,不勾选也是null
		String retValue=request.getParameter("autoLogin")得到的是"ok"
	
	*/
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException , IOException {
			
		String value01=request.getParameter("autoLogin");
		System.out.println("value01:"+value01);
	}
}
package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

/*本范例演示web.xml文件中<url-pattern>的多种写法
(1)精确匹配：<url-pattern>/test/a</url-pattern>
(2)扩展匹配：<url-pattern>/test/*</url-pattern>，/test/后面跟任何路径都能访问Servlet
(3)后缀匹配：<url-pattern>*.do</url-pattern>
             <url-pattern>*.execute</url-pattern>
			 注意链接符是点"."，不是斜杠"/"，输入时要加项目名，范例：/A023-UrlPatternTest/xxx.do
(4)全部匹配：<url-pattern>/*</url-pattern>    只要输入项目名就直接访问Servlet，注意至少要输入项目名称
*/
public class UrlPatternTest extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException ,IOException {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.print("Hi Servlet!");
	}
}
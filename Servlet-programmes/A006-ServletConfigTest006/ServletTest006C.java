
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.PrintWriter;
import java.io.IOException;

/*
测试第三个对象对应的ServletConfig,web.xml文件中把<init-param>写在<servlet>外面是否可以？不可以
写在外面不行，006C.java中config.getInitParameter("user_C")返回值为null
因为一个servlet对应一个config,写在外面找不到对应的confing
*/
public class ServletTest006C implements Servlet {

	private ServletConfig config;
	
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("config 006_C+"+this.config);
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String userNameC=config.getInitParameter("user_C");
		System.out.println(userNameC);
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
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletHomepageTest001 implements Servlet {   //����õ�*.class�ļ�Ҫ�ŵ�/WEB-INF/classes�ļ�����

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;   
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException ,IOException {
		//��������������ʽ
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out=response.getWriter();
		out.print("Welcome to vist my customized hompage!");
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
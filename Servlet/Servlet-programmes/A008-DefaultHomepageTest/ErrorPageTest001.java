import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class ErrorPageTest001 implements Servlet {   //����õ�*.class�ļ�Ҫ�ŵ�/WEB-INF/classes�ļ�����

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;   
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException ,IOException {
		
		//ģ���̨Servlet������������500�Ŵ�����룬�����ʾweb.xml�����ļ���500�����Ӧ��ҳ��
		int a=100/0;
		
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
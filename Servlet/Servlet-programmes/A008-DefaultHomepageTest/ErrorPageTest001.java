import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class ErrorPageTest001 implements Servlet {   //编译好的*.class文件要放到/WEB-INF/classes文件夹里

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;   
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException ,IOException {
		
		//模拟后台Servlet程序错误，则出现500号错误代码，则会显示web.xml配置文件中500代码对应的页面
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
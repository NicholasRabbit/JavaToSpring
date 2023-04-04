import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

public class ServletTest005B implements Servlet {

	public ServletTest005B(){
		System.out.println("005B constructor execute.");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("005B init method execute.");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("005B service method execute.");
	}

	public ServletConfig getServletConfig(){
		System.out.println("005B getServletConfig execute.");
		return null;
	}

	public String getServletInfo(){
		System.out.println("005B getServletInfo execute.");
		return null;
	}
	
	public void destroy(){
		System.out.println("005B destroy execute.");
	}

}
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletContext;

import javax.servlet.ServletException;

import java.io.IOException;

//个人仿照SUN的适配器写的本代码，以后用Sun的GenericServlet，这里仅为练习用

public abstract class GenericServletTest002 implements Servlet {

	private ServletConfig config;

	public final void init(ServletConfig config) throws ServletException {
		this.config=config;
		init();
	}

	public void init(){
		/*父类GenericServlet里的用来被子类覆盖，且只执行一次的方法，当子类需要初始化时只执行一次的功能时用
		  此方法放到上面原始的init(..)里调用即可
		*/
	}

	public abstract void service(ServletRequest request, ServletResponse response) throws ServletException,IOException;  //service(..)方法不要实现

	public ServletConfig getServletConfig(){
		return this.config;
	}

	public String getServletInfo(){
		return null;
	}

	public void destroy(){
	
	}

	//以下可写其他自定义方法，这里写个获取ServletContext对象方法
	public ServletContext getServletContext(){
		ServletContext application=getServletConfig().getServletContext();
		return application;  //通过config得到ServletContext
	}
}
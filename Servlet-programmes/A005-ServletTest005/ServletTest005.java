import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;


public class ServletTest005 implements Servlet {
	
	//Servlet对象生命周期中，几个方法的执行顺序及次数
	/*(1)Servlet及其实现类的无参构造方法只执行一次
	  (2)init(..)方法在初始化(即实例化之后才可以由Tomcat调用init())时执行一次，整个生命周期只执行一次；
	     默认输入网址访问项目时实例化Servlet
	  (3)service(..)方法执行多次，每次刷新，用户请求等等均会执行；
	  (4)destroy()方法只执行一次，在准备销毁Servlet对象时执行。
	注意：
	  (1)Servlet类在Web服务器启动时不会实例化，用户用到时才会由Web容器，即服务器Tomcat利用反射机制进行实例化
      (2)可在web.xml文件中添加<load-on-startup>标签进行设置。使得Web服务器启动时Servlet类实例化，
	     Web服务器启动是指Tomcat启动，不是网页浏览器打开或访问到该网址，浏览器打开之前服务器就已经启动了。
	*/

	public ServletTest005(){
		System.out.println("Servlet对象无参构造方法执行。");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method execute.");   
	}

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
		System.out.println("service method execute.");
	}

	public ServletConfig getServletConfig(){
		System.out.println("getServletConfig execute.");
		return null;	
	}

	public String getServletInfo(){
		System.out.println("getServletInof execute.");
		return null;
	}

	public void destroy(){
		System.out.println("destroy execute");
	}

}
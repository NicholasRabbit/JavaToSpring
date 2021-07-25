import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

import java.io.IOException;

//ServletConfig接口常用方法，初步研究ServletConfig对象
//一个Servlet对象对应一个ServletConfig，两个就对应两个ServletConfig
public class ServletTest006 implements Servlet {

	private ServletConfig config;  //这里程序员自己声明一个ServletConfig接口变量，备用
								   //实例变量涉及线程安全问题，尽量不做修改，或者相应改为局部变量
	public ServletTest006(){
		System.out.println("006 constructor execute.");
	}

	public void init(ServletConfig config) throws ServletException {
		
		this.config=config;     //这里只是把Tomcat传进来的config赋予this.config
		System.out.println("init 006's ServletConfig:"+config);  //这个config时Tomcat传进来的,上面不声明变量也不影响
		
		/*输出：org.apache.catalina.core.StandardWrapperFacade@4bd58816，多态语法
		(1)初始化时，Tomcat服务器会调用此方法，并给config传实际参数，即Tomcat写的ServletConfig接口的实现类StandardWrapperFacade.class
		(2)给this.config赋值，即把值赋给了私有的实例变量config，供以后外部可以用getServletConfig()方法调用
		*/
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
		System.out.println(getServletConfig());
	}

	public ServletConfig getServletConfig(){   //此方法供外部调用，获取私有属性config
		
		return this.config;
	}

	public String getServletInfo(){
		return null;
	}

	public void destroy(){
		
	}
}
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletContext;

import javax.servlet.ServletException;

import java.io.IOException;

/*个人模仿JavaEE的GenericServlet抽象类，研究其存在的目的
(1)设计这个抽象类出发点，使其实现Servlet 接口，实现除service(..)以外的所有方法，这样以来，程序员可继承此抽象类
只需实现service()抽象方法就可以了，别的方法用到时在覆盖重写，这样代码简洁了。
(2)注意GenericServletTest里面的实现Servlet接口的init(..)方法不可被个人写的子类覆盖，
如果要实现服务器加载时只执行一次的功能需求，可再重写一个init()方法，在原始init(..)方法里调用
*/
	   //抽象类
public abstract class GenericServletTest implements Servlet {  
	   
	private ServletConfig config;

	//init(..)方法在Servlet对象实例化时执行，默认访问该项目时实例化
	//若在web.xml里设置<load-on-startup>则服务器启动时就实例化
	public final void init(ServletConfig config) throws ServletException {
		this.config=config;
		init();
	}
	/*(1)上面原始的GenericServlet实现的Servlet接口的init(..)方法里，有给config赋值的语句，因此加final修饰，可以被继承，不可被覆盖。 
	  (2)如果程序员有需求，需要一个服务器加载时只执行一次的方法，这里写一个init()无参方法，
	  放到上面原始的init(..)里面调用，即可达到执行一次的目的
	  (3)下面新写的init()方法名字可以是别的例如doSome等没影响，这里写作init方便见文知义。
	*/
	public void init(){  
	   //用来被覆盖,当需要只执行一次的功能时										
	}

	public abstract void service(ServletRequest request, ServletResponse reponse) throws ServletException,IOException;  //service(..)抽象方法在这里不实现，留给子类去实现
	
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
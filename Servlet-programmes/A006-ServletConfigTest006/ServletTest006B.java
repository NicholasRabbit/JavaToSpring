import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;

import java.io.IOException;

import java.util.Enumeration;

/*ServletConfig接口常用方法范例
  (1)getInitParameter(String name);
  (2)Enumeration getInitParameterNames()
  (3)ServletContext getServletContext()
*/
public class ServletTest006B implements Servlet {
	
	private ServletConfig config;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("006B: "+config);
		this.config=config;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException {
	/*(1)String getInitParameter(String name)方法，同过web.xml配置文件类设置好的参数name，获得其对应的value
	  个人分析：Tomcat服务器启动时读取web.xml文件，并把<init-param>里的name,value存进了Map<String,String>集合里，供以后调用
	  用处：可在web.xml文件中设置数据库信息，直接在服务器启动时就存好备用
	*/
	  ServletConfig config=getServletConfig();
	  
	  String driver=config.getInitParameter("driver");   //存的数值都是String类型的
	  String url=config.getInitParameter("url");
	  String user=config.getInitParameter("user");
	  String password=config.getInitParameter("password");
	  System.out.println(driver);
	  System.out.println(url);
	  System.out.println(user);
	  System.out.println(password);

    /*(2)Enumeration getInitParameterNames(),以枚举数组形式返回所有web.xml里的<param-name>
		可调用该类里的hasMoreElements(),nextElement()方法进行遍历
	*/
	  Enumeration<String> enumArr=config.getInitParameterNames(); //Enumeration在java.util包里
	  while(enumArr.hasMoreElements()){  
		 String name=enumArr.nextElement();
		 System.out.println(name);
	  }

    //(3)ServletContext getServletContext()，通过config获取ServletContext对象
	   ServletContext application=config.getServletContext();  //变量名建议写为application，以后使用可见文知义
	   System.out.println("application: "+application);
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
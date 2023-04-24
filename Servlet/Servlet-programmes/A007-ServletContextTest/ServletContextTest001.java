package com.servlet.myjava;   //这里有包名，注意web.xml里<servlet-class>里类名的写法

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletContext;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;
import java.util.Enumeration;
import java.util.Set;
import java.util.Iterator;

/*ServletContext接口分析，及其常用方法
(1)一个webapp,即本例的A007-ServletContextTest项目，只有一个ServletContext,
(2)这里所有的Servlet对象共享一个ServletContext，注意与ServletConfig区分
   本例ServletContextTest001就是一个Servlet对象，因为它实现了其接口
*/
public class ServletContextTest001 implements Servlet {

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;   //把Tomcat传来的config实参赋值给实例变量，供下面使用
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException {
		
		/*首先获取ServletContext接口的实现类对象
		*/
		ServletConfig config=getServletConfig();
		ServletContext application=config.getServletContext();
		System.out.println("ServletContext001: "+application);
		/*结果：ServletContextApplication: org.apache.catalina.core.ApplicationContextFacade@3a5d07c2
		  ServletContext接口由Tomcat写的实现类是：ApplicationContextFacade
		*/

		/*(1)String getInitParameter(String name),由name获取value,
		  与Map集合类似，说明Tomcat服务器把初始化的参数存进了Map集合中
		*/
		String userValue=application.getInitParameter("user");
		String teamValue=application.getInitParameter("team");
		System.out.println("user:"+userValue+", team:"+teamValue);   //结果显示在Tomcat界面

		/*(2)Enumeration getInitParameterNames(),以枚举形式返回所有的name,
		     注意返回值是该枚举接口实现类，不是不是数组
		*/
		Enumeration<String> nameArr=application.getInitParameterNames();
		while(nameArr.hasMoreElements()){
			String name=nameArr.nextElement();
			String value=application.getInitParameter(name);  //这里通过name获取value
			System.out.println(name+"="+value);
		}

		//(3)String getRealPath(String path),获取项目内文件的绝对路径,指在电脑内的绝对路径
	    //注意参数内路径以项目根目录为起点，写时以”/“开头，不以”/结束“
		String absolutePath_1=application.getRealPath("/index.html");
		String absolutePath_2=application.getRealPath("/WEB-INF/web.xml");
		System.out.println("indexl.html路径："+absolutePath_1);
		System.out.println("web.xml路径："+absolutePath_2);

		/*(4)InputStream getResourceAsStream(String path)方法，通过一个路径创建一个IO流对象
		*/
		InputStream in=application.getResourceAsStream("/WEB-INF/lib/info.properties");
		Properties pro=new Properties();
		pro.load(in);  //调用Properties的load(.)方法，把输入流文件内容存进Properties对象中
		
		Set keys=pro.keySet();  //这里返回Object，注意向下转型
		Iterator it=keys.iterator();
		while(it.hasNext()){
			String key=(String)it.next();   //向下转型
			String value=pro.getProperty(key);
			System.out.println(key+"="+value);
		}

		/*(5)void setAttribute(..)，向SerlvetContext添加属性
		     Object getAttribute(String name),获取属性值
			 void removeAttribute(String name),移除属性
	    */
		User u=new User();
		u.setName("Tom");
		u.setAge(20);
		application.setAttribute("user02",u);  //与Map集合的put(key,value)类似，这里整个User对象u相当于一个value

		application.setAttribute("user03","Jerry");  //测试另一个Servlet能否获取

		Object userObj=application.getAttribute("user02");
		System.out.println(userObj);

		application.removeAttribute("user02");
		userObj=application.getAttribute("user02");  //再次获取，看是否移除成功
		System.out.println(userObj);
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
package com.javaweb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;

import java.io.PrintWriter;
import java.io.IOException;

import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Enumeration;

/*浏览器表单发送的请求是封装到HttpServletRequest接口实现类的对象里面的
*/

//这里就直接继承Sun公司写好的模板类HttpServlet,不再继承个人仿写的HttpServletMock.java
public class HttpServletRequestTest003 extends HttpServlet {

	//这里只重写doPost(..)方法，一般表单提交数据都是post方式
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.print("request:"+request);
		
		/*浏览器表单发送的请求是封装到接口HttpServletRequest实现类的对象里面的,类似于Map<String,String>集合
		  Tomcat实现这个接口类的名称request:org.apache.catalina.connector.RequestFacade@238d439f
		*/

		/*(1)String getParameter(String name),在提交的信息中，通过名称获取参数值value，与Map集合类似
		     这个name值就是html表单<input>标签name属性的值
		*/
		String userName=request.getParameter("username");
		String password=request.getParameter("passwd");
		String gender=request.getParameter("gender");

		String hobby=request.getParameter("hobby");  //因为hobby爱好多选，这里只返回所选的第一个值   
                                                     //有多个值的应当使用返回数组的方法
		String degree=request.getParameter("degree");
		String selfIntro=request.getParameter("selfIntro");

		System.out.println("userName="+userName);
		System.out.println("password="+password);
		System.out.println("gender="+gender);
		System.out.println("hobby="+hobby);
		System.out.println("degree="+degree);
		System.out.println("selfIntro="+selfIntro);

		/*(2)String[] getParameterValues(String name),以数组形式返回各项请求的值
			 只有一个值的话，那么数组中就只有一个元素
		*/
		String[] names=request.getParameterValues("username");
		for(String name : names){
			System.out.println(name);	
		}
		
		String[] hobbies=request.getParameterValues("hobby");
		for(int i=0;i<hobbies.length;i++){
			System.out.println(hobbies[i]);
		}
		
		System.out.println("=======================");

		/*(3)Map<String,String[]> getParameterMap(); 获取一个含有请求数据的Map集合
			注意通过Tomcat实现类RequestFacade.java可知，返回值泛型是Map<String,Sring[]>，value是String[]数组
		*/
		Map<String,String[]> formMap=request.getParameterMap();
		Set<String> keySet=formMap.keySet();
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()){
			String key=it.next();
			String[] values=formMap.get(key);
			for(String value : values){
				System.out.println(key+"="+value);
			}
		}

		System.out.println("========================");
		/*(4)Enumeration getParameterNames(),以枚举形式返回请求的名称name
		*/
		Enumeration<String> enums=request.getParameterNames(); //注意Enumeration<String>加泛型，否则返回的是Object对象
		while(enums.hasMoreElements()){
			String name=enums.nextElement();
			System.out.println(name);
		}

		//(5)String getContextPath();获取SerlvletContext的路径
		String contextPath=request.getContextPath();
		System.out.println("ServletContextPath="+contextPath);

		//(6)String getMethod();获取浏览器请求的方式
		String method=request.getMethod();
		System.out.println("requestMethod="+method);

		//(7)String getRequestURI(),获取URI，文件路径
		String uri=request.getRequestURI();
		System.out.println("URI="+uri);

		//(8)StringBuffer getRequestURL(),获取URL
		StringBuffer url=request.getRequestURL();
		System.out.println("URL="+url);

		//(9)String getServletPath(),获取项子目路径，即web.xml里<url-pattern>标签对应的路径
		String urlPattern=request.getServletPath();
		System.out.println("urlPattern="+urlPattern);

		//(10)String getRemoteAddr();获取用户的IP地址
		String userIP=request.getRemoteAddr();
		System.out.println("IP="+userIP);

		/*ServletContextPath=/A012-HttpServletRequestTest003
		  requestMethod=POST
		  URI=/A012-HttpServletRequestTest003/user/login
		  URL=http://localhost:8080/A012-HttpServletRequestTest003/user/login
		  urlPattern=/user/login
		  IP=127.0.0.1
		*/

	}
}
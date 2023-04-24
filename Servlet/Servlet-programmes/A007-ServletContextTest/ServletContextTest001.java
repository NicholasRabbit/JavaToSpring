package com.servlet.myjava;   //�����а�����ע��web.xml��<servlet-class>��������д��

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

/*ServletContext�ӿڷ��������䳣�÷���
(1)һ��webapp,��������A007-ServletContextTest��Ŀ��ֻ��һ��ServletContext,
(2)�������е�Servlet������һ��ServletContext��ע����ServletConfig����
   ����ServletContextTest001����һ��Servlet������Ϊ��ʵ������ӿ�
*/
public class ServletContextTest001 implements Servlet {

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;   //��Tomcat������configʵ�θ�ֵ��ʵ��������������ʹ��
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException {
		
		/*���Ȼ�ȡServletContext�ӿڵ�ʵ�������
		*/
		ServletConfig config=getServletConfig();
		ServletContext application=config.getServletContext();
		System.out.println("ServletContext001: "+application);
		/*�����ServletContextApplication: org.apache.catalina.core.ApplicationContextFacade@3a5d07c2
		  ServletContext�ӿ���Tomcatд��ʵ�����ǣ�ApplicationContextFacade
		*/

		/*(1)String getInitParameter(String name),��name��ȡvalue,
		  ��Map�������ƣ�˵��Tomcat�������ѳ�ʼ���Ĳ��������Map������
		*/
		String userValue=application.getInitParameter("user");
		String teamValue=application.getInitParameter("team");
		System.out.println("user:"+userValue+", team:"+teamValue);   //�����ʾ��Tomcat����

		/*(2)Enumeration getInitParameterNames(),��ö����ʽ�������е�name,
		     ע�ⷵ��ֵ�Ǹ�ö�ٽӿ�ʵ���࣬���ǲ�������
		*/
		Enumeration<String> nameArr=application.getInitParameterNames();
		while(nameArr.hasMoreElements()){
			String name=nameArr.nextElement();
			String value=application.getInitParameter(name);  //����ͨ��name��ȡvalue
			System.out.println(name+"="+value);
		}

		//(3)String getRealPath(String path),��ȡ��Ŀ���ļ��ľ���·��,ָ�ڵ����ڵľ���·��
	    //ע�������·������Ŀ��Ŀ¼Ϊ��㣬дʱ�ԡ�/����ͷ�����ԡ�/������
		String absolutePath_1=application.getRealPath("/index.html");
		String absolutePath_2=application.getRealPath("/WEB-INF/web.xml");
		System.out.println("indexl.html·����"+absolutePath_1);
		System.out.println("web.xml·����"+absolutePath_2);

		/*(4)InputStream getResourceAsStream(String path)������ͨ��һ��·������һ��IO������
		*/
		InputStream in=application.getResourceAsStream("/WEB-INF/lib/info.properties");
		Properties pro=new Properties();
		pro.load(in);  //����Properties��load(.)���������������ļ����ݴ��Properties������
		
		Set keys=pro.keySet();  //���ﷵ��Object��ע������ת��
		Iterator it=keys.iterator();
		while(it.hasNext()){
			String key=(String)it.next();   //����ת��
			String value=pro.getProperty(key);
			System.out.println(key+"="+value);
		}

		/*(5)void setAttribute(..)����SerlvetContext�������
		     Object getAttribute(String name),��ȡ����ֵ
			 void removeAttribute(String name),�Ƴ�����
	    */
		User u=new User();
		u.setName("Tom");
		u.setAge(20);
		application.setAttribute("user02",u);  //��Map���ϵ�put(key,value)���ƣ���������User����u�൱��һ��value

		application.setAttribute("user03","Jerry");  //������һ��Servlet�ܷ��ȡ

		Object userObj=application.getAttribute("user02");
		System.out.println(userObj);

		application.removeAttribute("user02");
		userObj=application.getAttribute("user02");  //�ٴλ�ȡ�����Ƿ��Ƴ��ɹ�
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
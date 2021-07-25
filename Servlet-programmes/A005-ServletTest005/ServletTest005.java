import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;


public class ServletTest005 implements Servlet {
	
	//Servlet�������������У�����������ִ��˳�򼰴���
	/*(1)Servlet����ʵ������޲ι��췽��ִֻ��һ��
	  (2)init(..)�����ڳ�ʼ��(��ʵ����֮��ſ�����Tomcat����init())ʱִ��һ�Σ�������������ִֻ��һ�Σ�
	     Ĭ��������ַ������Ŀʱʵ����Servlet
	  (3)service(..)����ִ�ж�Σ�ÿ��ˢ�£��û�����ȵȾ���ִ�У�
	  (4)destroy()����ִֻ��һ�Σ���׼������Servlet����ʱִ�С�
	ע�⣺
	  (1)Servlet����Web����������ʱ����ʵ�������û��õ�ʱ�Ż���Web��������������Tomcat���÷�����ƽ���ʵ����
      (2)����web.xml�ļ������<load-on-startup>��ǩ�������á�ʹ��Web����������ʱServlet��ʵ������
	     Web������������ָTomcat������������ҳ������򿪻���ʵ�����ַ���������֮ǰ���������Ѿ������ˡ�
	*/

	public ServletTest005(){
		System.out.println("Servlet�����޲ι��췽��ִ�С�");
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
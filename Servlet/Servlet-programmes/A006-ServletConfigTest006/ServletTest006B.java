import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;

import java.io.IOException;

import java.util.Enumeration;

/*ServletConfig�ӿڳ��÷�������
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
	/*(1)String getInitParameter(String name)������ͬ��web.xml�����ļ������úõĲ���name��������Ӧ��value
	  ���˷�����Tomcat����������ʱ��ȡweb.xml�ļ�������<init-param>���name,value�����Map<String,String>��������Ժ����
	  �ô�������web.xml�ļ����������ݿ���Ϣ��ֱ���ڷ���������ʱ�ʹ�ñ���
	*/
	  ServletConfig config=getServletConfig();
	  
	  String driver=config.getInitParameter("driver");   //�����ֵ����String���͵�
	  String url=config.getInitParameter("url");
	  String user=config.getInitParameter("user");
	  String password=config.getInitParameter("password");
	  System.out.println(driver);
	  System.out.println(url);
	  System.out.println(user);
	  System.out.println(password);

    /*(2)Enumeration getInitParameterNames(),��ö��������ʽ��������web.xml���<param-name>
		�ɵ��ø������hasMoreElements(),nextElement()�������б���
	*/
	  Enumeration<String> enumArr=config.getInitParameterNames(); //Enumeration��java.util����
	  while(enumArr.hasMoreElements()){  
		 String name=enumArr.nextElement();
		 System.out.println(name);
	  }

    //(3)ServletContext getServletContext()��ͨ��config��ȡServletContext����
	   ServletContext application=config.getServletContext();  //����������дΪapplication���Ժ�ʹ�ÿɼ���֪��
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
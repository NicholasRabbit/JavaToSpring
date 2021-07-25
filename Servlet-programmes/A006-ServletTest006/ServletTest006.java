import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

import java.io.IOException;

//ServletConfig�ӿڳ��÷����������о�ServletConfig����
//һ��Servlet�����Ӧһ��ServletConfig�������Ͷ�Ӧ����ServletConfig
public class ServletTest006 implements Servlet {

	private ServletConfig config;  //�������Ա�Լ�����һ��ServletConfig�ӿڱ���������
								   //ʵ�������漰�̰߳�ȫ���⣬���������޸ģ�������Ӧ��Ϊ�ֲ�����
	public ServletTest006(){
		System.out.println("006 constructor execute.");
	}

	public void init(ServletConfig config) throws ServletException {
		
		this.config=config;     //����ֻ�ǰ�Tomcat��������config����this.config
		System.out.println("init 006's ServletConfig:"+config);  //���configʱTomcat��������,���治��������Ҳ��Ӱ��
		
		/*�����org.apache.catalina.core.StandardWrapperFacade@4bd58816����̬�﷨
		(1)��ʼ��ʱ��Tomcat����������ô˷���������config��ʵ�ʲ�������Tomcatд��ServletConfig�ӿڵ�ʵ����StandardWrapperFacade.class
		(2)��this.config��ֵ������ֵ������˽�е�ʵ������config�����Ժ��ⲿ������getServletConfig()��������
		*/
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
		System.out.println(getServletConfig());
	}

	public ServletConfig getServletConfig(){   //�˷������ⲿ���ã���ȡ˽������config
		
		return this.config;
	}

	public String getServletInfo(){
		return null;
	}

	public void destroy(){
		
	}
}
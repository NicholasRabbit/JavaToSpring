import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import java.io.IOException;

public class ServletTest003 implements Servlet {

	public void init(ServletConfig config) throws ServletException {
	
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		/*������Ӧ��������ı����ʽ����ΪTomcatĬ����ISO-8591-1��֧�ֺ��֣�
		  ����ServletResponse�ӿ���ķ���setContentType(String type)��
		  Tomcat����service(..)����ʱ���Ѿ�Ϊ�ýӿ�д��ʵ����,����ʱ��̬�÷�
		*/
		res.setContentType("text/html;charset=UTF8");  //��getWriter()����֮ǰ���ñ����ʽ�����򲻹���

		/*���ǵ���ServletResponse�ӿ���ķ���getWriter(..)����һ��PrintWriter����
		  ��������ʱ����ı�,������ɰ��ı����б��룬ע�������ֻ�ɱ���html,css,js
		*/
		PrintWriter out=res.getWriter();
        //����PrintWriter������ķ����������������ı���Ҳ������Ӧ(response)
		out.print("<html>");
		out.print("<head>");
		out.print("<title>");
		out.print("Hi earth");
		out.print("</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("��õ���");
		out.print("</body>");
		out.print("</html>");
	}

	public ServletConfig getServletConfig(){
		return null;
	}

	public String getServletInfo(){
		return null;
	}

	public void destroy(){
	
	}
}
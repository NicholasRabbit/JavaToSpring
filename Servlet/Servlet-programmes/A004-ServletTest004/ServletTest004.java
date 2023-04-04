import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

/*����ʾ��Servlet,JDBC,MySQL���ʹ�ã�ͨ������Աд�ĳ��򣬽����ݿ��ѯ����Ӧ����γɱ������������
  �ص�ע�⣬������Ŀ����mysql���ݿ�ʱ��Ҫ��MySQL��װ���µ�mysql-connector-java-5.1.23-bin.jar
  �ŵ�WEB-INF���libĿ¼�����Tomcat�޷�����MySQL��ʵ����
*/
//ע���ⲿ������Ŀ��ҳʱ��ip��ַ����дlocalhost��127.0.0.1�����ԣ�Ӧдip��ַ
public class ServletTest004 implements Servlet {

	public void init(ServletConfig config) throws ServletException {
	
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
		
		//������ҳ�����ʽΪUTF-8���ɼ�������
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();

		//��������������html����
		out.print("<!DOCTYPE html>");
		out.print("<meta charset=��UTF-8��>");  //˫�����ڲ�Ƕ�ף��ڲ���д�ɵ�����''�����ת��� \""
		out.print("<html>");
		out.print("<head>");
		out.print("<title>���ɵı�</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<table align=\"center\" border=\"2px\" width=\"20%\">");
		out.print("<th>name</th><th>sal</th><th>job</th>");   //��ͷ
		
		
		//��������service(..)������д
		//(1)����ҪʹJDBC�������ݿ⣬����������
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
		    //һ��ע����������һ�ַ�ʽ��,����jvmҪ���ӵ��������͵����ݿ�
		    Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			//������ȡ����
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);
			
			//������ȡ�������ݿ����
			String sql="select ename,sal,job from emp";
			ps=connect.prepareStatement(sql);

			//�ģ�ִ�в�ѯ
			ps.executeQuery();

			//�壬��ȡ��ѯ�����,�����б���
			rs=ps.getResultSet();
			while(rs.next()){
				String name=rs.getString("ename");
				double salary=rs.getDouble("sal");
				String job=rs.getString("job");      //����������ÿһ�б��
				out.print("<tr>");
				out.print("<td>"+name+"</td>"+"<td>"+salary+"</td>"+"<td>"+job+"</td>");
				out.print("</tr>");
			}

			

		}catch(SQLException e){
			e.printStackTrace();
		}

		//дʣ�µ�html����
		out.print("</table>");
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
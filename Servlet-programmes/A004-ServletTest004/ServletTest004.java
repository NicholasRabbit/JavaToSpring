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

/*本例示范Servlet,JDBC,MySQL结合使用，通过程序员写的程序，将数据库查询的响应结果形成表格输出到浏览器
  重点注意，部署项目链接mysql数据库时，要把MySQL安装包下的mysql-connector-java-5.1.23-bin.jar
  放到WEB-INF里的lib目录里，否则Tomcat无法调用MySQL的实现类
*/
//注意外部访问项目主页时，ip地址不可写localhost或127.0.0.1，不对，应写ip地址
public class ServletTest004 implements Servlet {

	public void init(ServletConfig config) throws ServletException {
	
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
		
		//设置网页编码格式为UTF-8，可兼容中文
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out=res.getWriter();

		//以下向浏览器输出html代码
		out.print("<!DOCTYPE html>");
		out.print("<meta charset=‘UTF-8’>");  //双引号内部嵌套，内部的写成单引号''，或加转义符 \""
		out.print("<html>");
		out.print("<head>");
		out.print("<title>生成的表单</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<table align=\"center\" border=\"2px\" width=\"20%\">");
		out.print("<th>name</th><th>sal</th><th>job</th>");   //表头
		
		
		//操作都在service(..)方法里写
		//(1)首先要使JDBC链接数据库，这里有六步
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
		    //一，注册驱动（第一种方式）,告诉jvm要连接的哪种类型的数据库
		    Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			//二，获取链接
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String password="nicholas1200";
			connect=DriverManager.getConnection(url,user,password);
			
			//三，获取操作数据库对象
			String sql="select ename,sal,job from emp";
			ps=connect.prepareStatement(sql);

			//四，执行查询
			ps.executeQuery();

			//五，获取查询结果集,并进行遍历
			rs=ps.getResultSet();
			while(rs.next()){
				String name=rs.getString("ename");
				double salary=rs.getDouble("sal");
				String job=rs.getString("job");      //这里遍历输出每一行表格
				out.print("<tr>");
				out.print("<td>"+name+"</td>"+"<td>"+salary+"</td>"+"<td>"+job+"</td>");
				out.print("</tr>");
			}

			

		}catch(SQLException e){
			e.printStackTrace();
		}

		//写剩下的html代码
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
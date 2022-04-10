package com.javaweb.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

/*本例实现用户在网页注册功能，并把用户名，密码放到数据库
  并演示重定向如何解决用户刷新页面后，重复向数据库提交信息的问题
*/
public class ServletRegisterTest001 extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("passwd");

		//以下JDBC链接数据库操作
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int count=0;  
		try{
			//第一步，注册驱动
			Class c=Class.forName("com.mysql.jdbc.Driver");   //Tomcat链接数据库要把“mysql-connector-java-5.1.23-bin.jar”包，即mysql驱动(实现类)放到/WEB-INF/lib文件夹下,注意这个jar包的mysql版本号要与使用的一致
			//第二步，获取链接
			String url="jdbc:mysql://localhost:3306/user";
			String user="root";
			String passwd="nicholas1200";
			connect=DriverManager.getConnection(url,user,passwd);
			connect.setAutoCommit(false);    //取消自动提交，开始sql事务机制手动提交，防止数据出现修改错误
			//第三步，获取操纵数据库对象
			ps=connect.prepareStatement("insert into t_user(userName,password) values (?,?)");
			ps.setString(1,userName);
			ps.setString(2,password);
			//第四步，执行操作
			count+=ps.executeUpdate();   //executeUpdate()返回的是操作成功的行数，这里返回1，即成功执行一行操作
			//第五步，不用
            
			connect.commit();  //注意别忘了手动提交
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				connect.rollback();    //防止出现异常，这里执行回滚，原因参照JDBC个人银行相关代码范例 
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			
			//第六步，关闭资源，从小到大关闭
			if(rs != null){
				try{
					rs.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}

			if(ps != null){
				try{
					ps.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}

			if(connect != null){
				try{
					connect.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}

			/*重定向操作，重定向是两次请求，当转到registerSucceeded.html注册成功页面之后，无论用户如何刷新，只是刷新的这个成功提示页面
			  也不会重复发送第一次的请求
			  如果是转发disapatcher的话，就是一次请求，一旦用户刷新就又会重复发送请求，添加数据
			*/
			if(count==1){  //如果数据库更改成功，则执行跳转的成功提示页面
			  //request.getRequestDispatcher("/html/registerSucceeded.html").forward(request,response);  //这行是转发，使用错误，用户一旦刷新就重复添加
			  response.sendRedirect(request.getContextPath()+"/html/registerSucceeded.html");
			}                       //getContextPath()返回值是项目名称:"/A019-MySql_JDBC_Servlet_LoginTest"
			
		}
		
		out.flush();
		out.close();

	}
}
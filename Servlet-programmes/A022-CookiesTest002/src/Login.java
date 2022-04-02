package com.javaweb.cookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import java.io.*;
import java.util.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

/*本代码实现功能：
  用户登录成功，并且用户勾选"十天内免登录"时，服务器发送cookie(包含当前用户名密码)给浏览器。
*/
public class Login extends HttpServlet {

	//获取浏览器表单发来的登录数据，与数据库进行验证
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("pw");

		//Servlet后台对浏览器传来的数据进行万能方式的分解，编码，解码过程
		byte[] bytes01=userName.getBytes("ISO-8859-1");
		byte[] bytes02=password.getBytes("ISO-8859-1");
		userName=new String(bytes01,"UTF-8");
		password=new String(bytes02,"UTF-8");
		System.out.println(userName+"="+password);

		//使用IO流结合Properties.java获取数据库配置文件数据
		FileInputStream in = new FileInputStream("config/jdbc.properties");   //路径写成“config\\jdbc.properties”报错，原因未知 
		Properties properties = new Properties();
		properties.load(in);
		String jdbcDriver = properties.getProperty("driver");
		String jdbcUrl = properties.getProperty("url");
		String jdbcUser = properties.getProperty("user");
		String jdbcPassword = properties.getProperty("password");

		//把浏览器传来的数据与数据库进行验证
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean loginSuccess=false;
		String realName=null;
		try{
			//第一步			
			Class c=Class.forName(jdbcDriver);
			//第二步
			connect=DriverManager.getConnection(jdbcUrl,jdbcUser,jdbcPassword);
			connect.setAutoCommit(false);  //事务开启手动提交
			
			//第三步
			String sqlQuery="select * from user where user_name=? and password=?";
			ps=connect.prepareStatement(sqlQuery);
			ps.setString(1,userName);
			ps.setString(2,password);
			//第四步
			ps.executeQuery();
			//第五步
			rs=ps.getResultSet();
			if(rs.next()){   
				realName=rs.getString("real_name");
				System.out.println(rs.getString("user_name")+"="+rs.getString("password"));
				loginSuccess=true;
			}

			connect.commit();  //别忘了手动提交，以及回滚

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			//回滚
		    if(connect != null){
				try{
					connect.rollback();	
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			//关闭资源
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
			}if(connect != null){
				try{
					connect.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}

		//如果登陆验证成功，跳转到欢迎页面
		if(loginSuccess){
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.print("<html>");
			writer.print("<head>");
			writer.print("<title>");
			writer.print("登陆成功");
			writer.print("</title>");
			writer.print("<body>");
			writer.print("欢迎：{");
			writer.print(realName);
			writer.print("}登陆");
			writer.print("</body>");
			writer.print("</head>");
			writer.print("</html>");
		}else{
			//如果cookie内信息错误则跳转到失败页面
			response.sendRedirect("/A022-CookiesTest002/html/loginError.html");
		}

		 //创建cookie，并发给浏览器
		 /*重点：给浏览器发送cookie写在这里CookieAutoLogin.java登录程序中，不是写在注册程序NewUserRegister.java中,
		   当用户选中“十天免登录”时，进行传送cookie,因为用户不一定都要求十天内免登录。
		   把信息存到cookie对象中，再返回浏览器，同时设置好保存时间为十天
	     */
		//如果用户选中“十天免登录”时，isYes为"yes",ok为"true"。
		String isYes=request.getParameter("autoLogin");
		boolean ok="yes".equals(isYes);   
		//先判断是否登录成功
		if(loginSuccess){
		   //再判断用户是否勾选“十天免登录”,如果成立，则创建并发送Cookie
		   if(ok){
			   Cookie nameCookie=new Cookie("userName",userName);
			   Cookie pwCookie=new Cookie("password",password);
			   
			   nameCookie.setPath(request.getContextPath());  //设置浏览器可获取cookie的路径范围
			   pwCookie.setPath(request.getContextPath());
			   
			   nameCookie.setMaxAge(60*60*24*10); //设置cookie保存期限为十天
			   pwCookie.setMaxAge(60*60*24*10);

			   response.addCookie(nameCookie);
			   response.addCookie(pwCookie);	
		   }
		   
		}else{  //如果登录失败则重定向到失败提示页面
			response.sendRedirect("/A022-CookiesTest002/html/loginError.html");
		}

		
	}
}



 
	 
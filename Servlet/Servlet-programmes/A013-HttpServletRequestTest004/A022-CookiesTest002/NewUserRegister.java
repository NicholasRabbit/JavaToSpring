package com.javaweb.cookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;


public class NewUserRegister extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
	   //获取注册信息
	   String userName=request.getParameter("userName");
	   String password=request.getParameter("pw");
	   //进行编码，解码，防止中文乱码，注意解码格式"UTF-8"与浏览器编码格式一致。
	   byte[] bytes01=userName.getBytes("ISO-8859-1");
	   byte[] bytes02=password.getBytes("ISO-8859-1");
	   userName=new String(bytes01,"UTF-8");
	   password=new String(bytes02,"UTF-8");


	   //把注册信息添加进后端数据库
	   Connection connect=null;
	   PreparedStatement ps=null;
	   ResultSet rs=null;
	   try{
			//第一步，获取驱动
			Class c=Class.forName("com.mysql.jdbc.Driver");
			//第二部，获取链接
			String url="jdbc:mysql://127.0.0.1:3306/user";
			String user="root";
			String sqlPassword="nicholas1200";
			connect=DriverManager.getConnection(url,user,sqlPassword);
			
			connect.setAutoCommit(false);   //开始sql事务，设置手动提交，防止程序出异常，造成数据库数据错误。

			//第三步，获取操作数据库对象
			String sqlCode="insert into t_user (userName,password) values (?,?)";   //注意：mysql中已经设置userName列为“unique”，所以这里添加新用户时不需再程序里验证用户是否已存在，否则需验证
			ps=connect.prepareStatement(sqlCode);
			ps.setString(1,userName);  //注意jdbc中问号“？”从下标从1开始
			ps.setString(2,password);
			
			//第四步，执行操作
			ps.executeUpdate();
			
			//第五步，获取查询结果集，这里不用

			connect.commit();

	   }catch(ClassNotFoundException e){
			e.printStackTrace();
	   }catch(SQLException e){
	        e.printStackTrace();
	   }finally{
			
			if(connect != null){
				try{
					connect.rollback();   //如果出异常这里回滚，即最后一句connect.commit()执行不到时，因为finally语句一定会执行。	
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			

			//第六步，关闭资源，注意从小到大关闭
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
	   }
		   
	}
}
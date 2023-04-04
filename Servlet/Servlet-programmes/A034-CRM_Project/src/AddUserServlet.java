package com.javaweb.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.util.List;
import java.util.ArrayList;
import java.util.Properties;

import com.javaweb.util.DBUtil;

//添加用户Servlet程序
public class AddUserServlet extends HttpServlet {

	//表单提交，method="post"，所以这里用doPost(..)方法
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		//获取表单提交的数据
		//String id=request.getParameter("id");  //错误！！html表单里就没有"id"这一项，MySql中设置的是auto_increment
		String userName=request.getParameter("userName");
		String gender=request.getParameter("gender");
		String tel=request.getParameter("tel");
		String addr=request.getParameter("addr");    //可以用String[] getParameters()方法，更省事些
		
		//把请求中用户提交的数据加到数据库中
		//第一步，注册驱动，在DBUtil.java静态代码块中执行，DBUtil类加载时已执行	
		//第二步，获取链接
		Properties pro=DBUtil.getInfo();
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String password=pro.getProperty("password");
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			connect=DBUtil.getConnect(url,user,password);
		}catch(SQLException e){
			e.printStackTrace();
		}

		DBUtil.isAutoCommit(connect, false);  //开启事务机制，取消自动提交

		//第三步，获取操作数据库对象
		try{
			ps=connect.prepareStatement("insert into t_user (name,gender,tel,addr) values (?,?,?,?)");
			ps.setString(1,userName);
			ps.setString(2,gender);
			ps.setString(3,tel);
			ps.setString(4,addr);
		}catch(SQLException e){
			e.printStackTrace();
		}
		

		//第四步，执行操作
		try{
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}

		DBUtil.commitAndRollback(connect);

		//第五步，
		
		//第六步，关闭资源
		DBUtil.close(rs,ps,connect);

		//转发到员工显示页面，显示效果
		//request.getRequestDispatcher("/userList").forward(request,response);

	}


}
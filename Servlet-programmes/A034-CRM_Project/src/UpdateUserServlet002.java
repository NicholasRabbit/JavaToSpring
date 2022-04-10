package com.javaweb.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

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
import com.javaweb.entity.User;

public class UpdateUserServlet002 extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		String id=request.getParameter("idNum");
		int idNum=Integer.parseInt(id);
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String tel=request.getParameter("tel");
		String address=request.getParameter("addr");

		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Properties pro=null;
		
		//第一步，注册驱动。 DBUtil内静态代码块已注册
		//第二步，获取链接
		pro=DBUtil.getInfo();
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String pw=pro.getProperty("password");
		try{
			connect=DBUtil.getConnect(url,user,pw);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		DBUtil.isAutoCommit(connect,false);   //开启事务机制，手动提交

		//第三步，获取数据库操作对象
		try{
			ps=connect.prepareStatement("update t_user set name=?,gender=?,tel=?,addr=? where id=?");
			ps.setString(1,name);
			ps.setString(2,gender);
			ps.setString(3,tel);
			ps.setString(4,address);
			ps.setInt(5,idNum);
			
			//第四步，执行操作
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}

		DBUtil.commitAndRollback(connect);  //手动提交

		DBUtil.close(rs,ps,connect);

		System.out.println("update execute!");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/html/UpdateSucceded.html"); //转发不用写项目名
		dispatcher.forward(request,response);
	}
}
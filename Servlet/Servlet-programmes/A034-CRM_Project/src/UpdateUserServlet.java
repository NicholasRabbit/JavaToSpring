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

//本代码实现功能，用户点击修改后，通过表单展示原内容，转发到UserUpdateInfo.jsp进行展示
public class UpdateUserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		int idNum=Integer.parseInt(id);
		
		System.out.println("UpdateUser execute!");

		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		User u=new User();
		List<User> myList=new ArrayList<>();
		//第一步注册驱动，DBUtil.java类加载时已执行
		//第二步获取数据库链接
		Properties pro=DBUtil.getInfo();
		String url=pro.getProperty("url");
		String userName=pro.getProperty("user");
		String password=pro.getProperty("password");
		try{
			connect=DBUtil.getConnect(url,userName,password);
		}catch(SQLException e){
			e.printStackTrace();
		}
		DBUtil.isAutoCommit(connect,false);  //开启事务机制，手动提交
		
		//第三步，获取数据库操作对象
		try{
			ps=connect.prepareStatement("select name,gender,tel,addr from t_user where id=?");
			ps.setInt(1,idNum);

			//第四步，执行查询操作
			ps.executeQuery();
		}catch(SQLException e){
			e.printStackTrace();
		}
		

		

		//第五步，获取结果集,遍历
		try{
			rs=ps.getResultSet();
			while(rs.next()){
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String tel=rs.getString("tel");
				String addr=rs.getString("addr");
				u.setId(idNum);
				u.setName(name);
				u.setGender(gender);
				u.setTel(tel);
				u.setAddr(addr);
				myList.add(u);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

		DBUtil.commitAndRollback(connect);   //手动提交及回滚

		//第六步，关闭资源
		DBUtil.close(rs,ps,connect);


		request.setAttribute("u01",myList);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/UserUpdateInfo.jsp");
		try{
			dispatcher.forward(request,response);  //这里不捕捉异常也可以，Tomcat会处理
		}catch(ServletException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
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

import com.javaweb.util.DBUtil;   //注意导入这里个人写的包机制文件,这几个类在不同的包里
import com.javaweb.entity.User;

//删除用户操作执行程序
public class DeleteUserServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		int idNum=Integer.parseInt(id);   //请求里得到的是String类型的数字，要转换为int类型，因为数据库中id是int类型

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
			ps=connect.prepareStatement("delete from t_user where id=?");
			ps.setInt(1,idNum);
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

		//最后删完用户之后要跳转到用户列表页面，显示删除的效果,
		//注意，这里转发到展示全部用户的Servlet程序，不是UserList.jsp,
		//直接转到UserList.jsp则无法获取List对象，因为当前代码没有封装结果到List集合
		request.getRequestDispatcher("/userList").forward(request,response);
	}
}
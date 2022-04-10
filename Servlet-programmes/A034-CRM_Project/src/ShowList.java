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

/*本Servlet代码实现展示全部功能
*/
public class ShowList extends HttpServlet{
	
	//超链接默认发来的是get请求
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
		//第一步，注册驱动，DBUtil类加载时已注册
		
		//第二步，获取链接
		Properties pro=DBUtil.getInfo();   //先获取存信息的集合对象
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String password=pro.getProperty("password");
		System.out.println(url+":"+user+":"+password);
		
		List<User> myList=new ArrayList<User>();
		ResultSet rs=null;
		PreparedStatement ps=null;
		Connection connect=null;
		try{
			connect=DBUtil.getConnect(url,user,password);
		}catch(SQLException e){
			e.printStackTrace();
		}

		//开启事务机制，关闭自动，手动提交
		DBUtil.isAutoCommit(connect,false);

		//第三步，
		
		try{
			ps=connect.prepareStatement("select * from t_user");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		//第四步，执行查询，
		try{
			ps.executeQuery();
		}catch(SQLException e){
			e.printStackTrace();
		}

		//第五步，获取查询结果集
		try{
			rs=ps.getResultSet();
		    while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String tel=rs.getString("tel");
				String addr=rs.getString("addr");
				System.out.println(id+"="+name+"="+gender);
				
				User u=new User(id,name,gender,tel,addr);
				myList.add(u);
		    }
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.commitAndRollback(connect);
		}

		//第六步，关闭资源
		DBUtil.close(rs,ps,connect);

		request.setAttribute("UserInfo",myList);
		request.getRequestDispatcher("/jsp/UserList.jsp").forward(request,response);
	}
}


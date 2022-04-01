package com.javaweb.cookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import javax.servlet.ServletException;

import java.io.PrintWriter;
import java.io.IOException;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

/*(1)本程序接收浏览器保存的cookie,并进行验证登录;
  (2)重点：本程序对应的<url-pattern>被设置为默认欢迎页面，无论浏览器是否由cookie都先访问该页面
     如果没有cookie则在代码中进行判断，并重定向到正常的登陆页面:login.html
*/
public class CookieLogin extends HttpServlet{

	//接收cookie对象要用deoGet()方法
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
		
		//后面数据库要判断名字密码，所以这里声明写for循环外边
		String userName=null;
		String password=null;
		boolean hasCookie=false;    //后面跳转判断要用到hasCookie
		
		Cookie[] cookies=request.getCookies();
		if(cookies != null){
			for(int i=0; i<cookies.length; i++){
				userName=cookies[i].getName();
				password=cookies[i].getValue();
				System.out.println(userName+"="+password);
			}
		} else {
			//这里缺少没有cookie时的跳转代码
		}

		//链接数据库，进行判断
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			//第一步,获取驱动
			Class c=Class.forName("com.mysql.jdbc.Driver");
			//第二步，获取链接
			String url="jdbc:mysql://127.0.0.1:3306/user";
			String user="root";
			String sqlPassword="nicholas1200";
			connect=DriverManager.getConnection(url,user,sqlPassword);
			connect.setAutoCommit(false);  //开启事务机制，取消自动提交，设置手动提交
			//第三步，获取操作数据库对象
			String sqlCode="select userName,password from t_user where userName=? and password=?";
			ps=connect.prepareStatement(sqlCode);
			//第四步，执行操作
			ps.setString(1,userName);
			ps.setString(2,password);
			ps.executeQuery();    //注意不要忘了执行查询操作
			//第五步，获取查询结果集,并进行判断
			rs=ps.getResultSet();
			if(rs != null || rs.next()){
				hasCookie=true;   //后面跳转判断要用到hasCookie
				System.out.println(rs.getString("userName")+"="+rs.getString("password"));  //输出验证一下
			}else{
				System.out.println("there isn't any ResultSet.");
			}

			connect.commit();

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
		
	}
}
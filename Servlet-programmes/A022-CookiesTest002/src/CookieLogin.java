package com.javaweb.cookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import javax.servlet.ServletException;

import java.io.*;
import java.util.*;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

/*(1)本程序接收浏览器保存的cookie,并进行验证登录;
  (2)重点：本程序对应的<url-pattern>被设置为默认"欢迎页面"(即输入项目根路径默认走本servlet进行处理请求)，有cookie且用户名密码验证通过则登陆，
     否则跳转到错误页面
	 没cookie则跳转到登陆页面
*/
public class CookieLogin extends HttpServlet{

	//接收cookie对象要用deoGet()方法
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
		
		//后面数据库要判断名字密码，所以这里声明写for循环外边
		String userName=null;
		String password=null;
		
		Cookie[] cookies=request.getCookies();
		if(cookies != null){
			for(int i=0; i<cookies.length; i++){
				String cookieName = cookies[i].getName();
				if("userName".equals(cookieName)){
					userName = cookies[i].getValue();
				}else if("password".equals(cookieName)){
					password = cookies[i].getValue();
				}	
			}
		}

		//使用IO流结合Properties.java获取数据库配置文件数据
		FileInputStream in = new FileInputStream("config/jdbc.properties");   //路径写成“config\\jdbc.properties”报错，原因未知
		Properties properties = new Properties();
		properties.load(in);
		String jdbcDriver = properties.getProperty("driver");
		String jdbcUrl = properties.getProperty("url");
		String jdbcUser = properties.getProperty("user");
		String jdbcPassword = properties.getProperty("password");

		//链接数据库，进行判断
		Connection connect=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String realName = null;
		boolean hasCookie=false;    //后面跳转判断要用到hasCookie
		if(userName != null && password != null){
			try{
				//第一步,获取驱动
				Class c=Class.forName(jdbcDriver);
				//第二步，获取链接
				connect=DriverManager.getConnection(jdbcUrl,jdbcUser,jdbcPassword);
				connect.setAutoCommit(false);  //开启事务机制，取消自动提交，设置手动提交
				//第三步，获取操作数据库对象
				String sqlCode="select user_name,password,real_name from user where user_name=? and password=?";
				ps=connect.prepareStatement(sqlCode);
				//第四步，执行操作
				ps.setString(1,userName);
				ps.setString(2,password);
				ps.executeQuery();    //注意不要忘了执行查询操作
				//第五步，获取查询结果集,并进行判断
				rs=ps.getResultSet();
				if(rs.next()){
					hasCookie=true;   //后面跳转判断要用到hasCookie
					realName = rs.getString("real_name");
					System.out.println(rs.getString("user_name")+"="+rs.getString("password"));  //输出验证一下
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

			//如果成功，跳转到欢迎页面
			if(hasCookie){
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
	
		}else {  //Cookie信息不全则跳转到登陆页面
            response.sendRedirect("/A022-CookiesTest002/html/login.html");
        }

	}
	
}
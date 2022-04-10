package com.javaweb.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.util.Properties;

import com.javaweb.util.DBUtil;


public class CrudTest001{

	public static void main(String[] args){
		crud();
	}

	public static void crud(){
		
		//第一步，注册驱动，DBUtil类加载时已注册
		
		//第二步，获取链接
		Properties pro=DBUtil.getInfo();   //先获取存信息的集合对象
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String password=pro.getProperty("password");
		
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
			System.out.println(id+"="+name+"="+gender);
		   }
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.commitAndRollback(connect);
		}

		//第六步，关闭资源
		DBUtil.close(rs,ps,connect);
	}
}
package com.javaweb.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.util.Properties;


public class CrmJdbcTest{

	public static void main(String[] args){
		crud();
	}

	public static void crud(){
		
		//第一步，注册驱动，DBUtil类加载时已注册
		
		//第二步，获取链接
		DBUtil ut=new DBUtil();
		ut.getInfo();  
		Connection connect=ut.getConnect();

		ut.isAutoCommit(connect,false);  //取消自动提交，改为手动

		//第三步，
		PreparedStatement ps=null;
		try{
			ps=connect.prepareStatement("select * from t_user");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		//第四步，执行查询，第五步在封装类里
		ut.executeQuery(ps);

		//第六步，关闭资源
		ut.close();
	}
}
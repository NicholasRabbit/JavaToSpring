/*手写数据库操作工具，目的是为了减少代码重复，实际开发中可直接调用此类中的方法

建议写成工具类，即方法是静态的，类级别的，构造方法是私有化的（无法实例化）
调用是直接：类名.方法名 调用
*/

package com.javaweb.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.util.Properties;

public class DBUtil {
	
	

	static{
		try{
			//第一步，注册驱动
			Driver driver=new com.mysql.jdbc.Driver();  //多态语法
			DriverManager.registerDriver(driver);       //把mysql写的子类driver对象注册进去，告诉jvm，使用的是mysql类型的数据库
		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("static block execute!");
	}
	private DBUtil(){
		//构造方法私有化，使之无法实例化
	}
	
	
	public static Properties getInfo(){
		FileInputStream in=null;
		Properties pro=null;
		try{
			in=new FileInputStream("com\\javaweb\\servlet\\info.properties");  //也可以web.xml替代properties文件
			pro=new Properties();
			pro.load(in);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(in != null){
				try{
					in.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

		return pro;
	}

	//获取数据库链接方法
	public static Connection getConnect(String url,String user,String password) throws SQLException {
		
		Connection connect;

		//第二步，获取链接,作为返回值返回
		connect=DriverManager.getConnection(url,user,password);   //这里异常上抛
		return connect;
	}

	//设置开始transaction，事务机制，开始手动提交
	public static void isAutoCommit(Connection connect,boolean autoCommit){
		try{
			connect.setAutoCommit(autoCommit);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	//手动提交,及回滚
	public static void commitAndRollback(Connection connect){
		try{
			connect.commit();	
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(connect != null){
				try{
					connect.rollback();	  //如果手动提交出异常，这里回滚，防止数据错误		
				}
				catch (SQLException e){
					e.printStackTrace();	
				}
			}
			
		}
		
	}

	
	

	
	

	//第六步，关闭资源
	public static void close(ResultSet rs,PreparedStatement ps,Connection connect){
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
/*手写数据库操作工具，目的是为了减少代码重复，实际开发中可直接调用此类中的方法
个人版DBUtil，可以用
实例化对象用法，不是工具类，
建议写成工具类，即方法是静态的，类级别的，构造方法是私有化的（无法实例化）
调用是直接：类名.方法名 调用
*/

package com.javaweb.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.util.Properties;

public class My_DBUtil {
	
	private String url;
	private String user;
	private String password;

	private Connection connect;
	private PreparedStatement  ps;
	private ResultSet rs;

	static{
		try{
			//第一步，注册驱动
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("static block execute!");
	}
	public DBUtil(){
		//先手写个无参构造备用
	}
	
	
	public  void getInfo(){
		FileInputStream in=null;
		try{
			in=new FileInputStream("com\\javaweb\\servlet\\web.xml");  //也可以xml文件
			Properties pro=new Properties();
			pro.load(in);
			this.url=pro.getProperty("url");
			this.user=pro.getProperty("user");
			this.password=pro.getProperty("password");

			System.out.println(url+"="+user+"="+password);

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
	}

	//获取数据库链接方法
	public Connection getConnect(){
		
		try{
			//第二步，获取链接
			this.connect=DriverManager.getConnection(url,user,password);
		}catch(SQLException e){
			e.printStackTrace();
		}

		return connect;
	}

	//设置开始transaction，事务机制，开始手动提交
	public void isAutoCommit(Connection connect,boolean autoCommit){
		try{
			connect.setAutoCommit(autoCommit);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	//手动提交,及回滚
	public void commitAndRollback(Connection connect){
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

	//第三步，获取操作数据库对象,要写sql语句，放在主程序里
	

	
	public ResultSet executeQuery(PreparedStatement ps){
		try{
			//第四步，执行操作
			ps.executeQuery();
			//第五步，获取操作结果集
			this.rs=ps.getResultSet();
			while(rs.next()){
			int id=rs.getInt("id");
			String name=rs.getString("userName");
			String passwd=rs.getString("password");
			System.out.println(id+":"+name+":"+passwd);
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return rs;
	}

	//第六步，关闭资源
	public void close(){
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
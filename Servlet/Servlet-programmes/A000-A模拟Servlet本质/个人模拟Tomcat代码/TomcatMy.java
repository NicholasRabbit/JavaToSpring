package com.javax.tomcat;

import java.util.Scanner;
import java.util.*;
import java.io.*;

import com.javax.controller.LoginController;


//模拟Tomcat服务器
public class TomcatMy {

	public static void main(String[] args){
	
		System.out.println("Tomcat服务器启动......");
		System.out.println("开始接收浏览器请求.....");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入路径：");
		String  requestPath = scan.next();
		FileReader reader = null;
		Properties pro = null;
		try{
			/*
			* 1,Tomcat服务器负责解析web.xml文件
			* 2,Tomcat服务器已经把所有处理流程代码写完了，就等程序员写好业务代码，配置文件等
			* 3,web.xml头部内容是Servlet规范，不能修改。自定义配置信息，得按照格式，由程序员编写。
			* 
			*/
			reader = new FileReader("web.xml");  //读取配置文件
			pro = new Properties();        
			pro.load(reader);		//把配置文件加载到Properties对象里
			
			//用户在客户端输入/login,  对应的 value是LoginController
			String className = pro.getProperty(requestPath);
			System.out.println("className==>" + className);
			//利用反射机制，通过用户输入的请求来找对应的处理类
			Class controllerCalss = Class.forName("com.javax.controller." + className);
			//实例化反射的对象
			LoginController  controller = (LoginController)controllerCalss.newInstance();
			controller.service();  //调用LoginController对象的方法service(),即进行处理浏览器端的请求

		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}finally{
			if(reader != null){
				try{
					reader.close();  //关闭IO流
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

	}
}
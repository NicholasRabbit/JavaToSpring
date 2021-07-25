package com.javaweb.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

//测试info.properties属性文件路径，因为部署服务器后总出现文件路径不对，这里测试路径没问题，可以读取到
public class Test {

	public static void main(String[] args){
		FileInputStream in=null;
		Properties pro=null;
		try{
			in=new FileInputStream("com\\javaweb\\servlet\\info.properties");  //也可以web.xml替代properties文件
			pro=new Properties();
			pro.load(in);
			System.out.println(pro.getProperty("url"));
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
}
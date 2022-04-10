package com.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CopyTest003 {

	public static void main(String[] args){
	
		File srcFile=new File("F:\\DY-works\\勤龙\\SDM7360\\3D\\SKM7360-1001D-7360立柱硬轨.prt");
		File destFile=new File("F:\\DY-works\\勤龙\\SDM7360\\热丝量\\SKM7360-1001D-7360立柱硬轨-热丝量.prt");
		
		
		copy(srcFile,destFile);
	}

	
	public static void copy(File srcFile,File destFile){
		
		//检查目的路径是否存在，不存在则创建
		File destParentFile=destFile.getParentFile();
		System.out.println(destParentFile);
		boolean isExists=destParentFile.exists();
		if(!isExists){  //注意，这里要用exists() 方法检查，不要用destParentFile==null判断，即使destParentFile不存在也不是null
			destParentFile.mkdirs();
			
		}
		System.out.println("destFile="+destFile.getAbsolutePath());
		
		
		FileInputStream in=null;
		FileOutputStream out=null;
		try{
			in=new FileInputStream(srcFile);
			out=new FileOutputStream(destFile);
			byte[] bytes=new byte[1024*2];  //一次读2kb
			int count=0;
			while((count=in.read(bytes)) != -1){
				out.write(bytes,0,count);
			}

			out.flush();

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

			if(out != null){
				try{
					out.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

		
	}
	
}
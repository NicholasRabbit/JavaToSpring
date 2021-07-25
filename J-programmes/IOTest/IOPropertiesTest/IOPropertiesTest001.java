package com.io.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


//集合类 Properties和IO流结合使用
/*用处及其优点：
  属性配置文件和java的class文件是动态绑定的，以后改动信息在配置属性文件里修改就可以了，不必修改程序，不必重新编译，减少工作量
  此类文件命名规范
  Java一般以.properties结尾，但不是硬性规定，其他的也可以，例如web.xml
*/
/*
properties文件注释标志是星号“*”
键值对和等号之间不要有空格，后期Spring可能会读取错误
键值对的对应符号建议用等号，用其他的例如冒号“：”也可以，但不建议
name=Jerry
age=20
password=123
*/
public class IOPropertiesTest001 {

    public static void main(String[] args){
	
	   FileInputStream fis=null;
	   Properties pro=null;
	   try{
		  /*(1)文件名要加后缀*.properties
		    (2)可写绝对路径如:D：\\javase\\...\\userInfo.properties
			(3)这里是相对路径，如果程序采用了包机制，相对路径以.class文件的根目录为起点写,即com所在目录
			   注意:相对路径"com\\..."最前面不要加“\\”,否则报错
		  */                         
		  fis=new FileInputStream("com\\io\\properties\\userInfo.properties") ;  
		  pro=new Properties();                         //这里可改为 web.xml
		  pro.load(fis);   //把IO流对象加载到Properties对象当中，调用相应方法即可获取文件内信息
		  
		  //Properties内部键值对都是String类型
		  String name=pro.getProperty("name");
		  String age=pro.getProperty("age");
		  String password=pro.getProperty("password");
		  System.out.println(name+"="+age+"="+password);
	   }catch(FileNotFoundException e){
	      e.printStackTrace();
	   }catch(IOException e){
	      e.printStackTrace();
	   }finally{
		  if(fis != null){
			try{
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		  }
	   }
	
	}    

}
package com.javase.reflect;

import java.io.File;

public class ReflectTest004 {

	public static void main(String[] args){
		
		//User u=new User();

		try{
			/* 这里加入了包机制，编译后User.class放在了从当前cmd启动目录下开始com/javase/reflece/下
			   一般cmd在src目录（这里ReflectTest004文件下相当于src）下启动，因此forName(..)括号里参数是类加载路径，
			   类加载路径即从src根目录开始:com.javase.reflect.ReflectTest004
               注意在src目录下运行java命令后面代码是写全包名，即：java  com.javase.reflect.ReflectTest004，否则报错			
			*/
			
			//forName()方法调用是User静态代码块会执行,而无参构造方法不会执行
			//因此如果只想执行一个类的静态代码块可使用forName()这种方法，通过得到一个字节码的方式只让static静态代码块执行
			Class c1=Class.forName("com.javase.reflect.User");

			Object obj=c1.newInstance();  //Class类里的newInstance()方法执行却会调用类User的无参构造方法，因为这里创建了新对象
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		}

		
	}
	
	

}
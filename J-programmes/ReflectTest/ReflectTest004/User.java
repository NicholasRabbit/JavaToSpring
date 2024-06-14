package com.javase.reflect;

public class User {

	static{
		System.out.println("静态代码块执行");
	}

	public User(){
		System.out.println("无参构造方法执行");
	}
}
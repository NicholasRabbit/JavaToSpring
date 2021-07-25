package com.javase.reflect;

public class User {

	int age;

	private String name;

	//静态方法
	public static void doSome(){   
	   System.out.println("doSome execute!");	
	}

	public static int doOther(int i, int b){
	    System.out.println("doOther execute!");	
		System.out.println("i+b:"+(i+b));
		return i+b;
	}
	
	
	//实例方法
	public String method01(String name, double weight){
		System.out.println("实例方法method01执行： "+name+weight);
		return name;
	}
	
	public final long method02(long l, Integer i){
		return l;
	}

	
	//非公开方法
	protected byte protectedMethod(byte bt){
		System.out.println("protectedMethod execute");
		return bt;
	}
	void defalutMethod(){
	
	}
	
	private int privateMethod(int i){
		return i;
	} 

}
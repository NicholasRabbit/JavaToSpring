package com.javase.reflect;

public class User {

	int age;

	private String name;

	//��̬����
	public static void doSome(){   
	   System.out.println("doSome execute!");	
	}

	public static int doOther(int i, int b){
	    System.out.println("doOther execute!");	
		System.out.println("i+b:"+(i+b));
		return i+b;
	}
	
	
	//ʵ������
	public String method01(String name, double weight){
		System.out.println("ʵ������method01ִ�У� "+name+weight);
		return name;
	}
	
	public final long method02(long l, Integer i){
		return l;
	}

	
	//�ǹ�������
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
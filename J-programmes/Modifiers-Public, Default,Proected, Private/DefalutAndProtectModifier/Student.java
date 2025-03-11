
//This class is in the same pacakge with Test..java
package com.javase.test;

public class Student {
	
	//protected
	protected String name;
	
	//default
	int age;

	public Student(){}

	public Student(String name, int age){
		this.age = age;
		this.name = name;
	}

	protected String protectedMethod(){
		System.out.println("stu proteceted method");
		return name;
	}

	int defaultMethod(){
		System.out.println("stu default method");
		return age;
	}


}

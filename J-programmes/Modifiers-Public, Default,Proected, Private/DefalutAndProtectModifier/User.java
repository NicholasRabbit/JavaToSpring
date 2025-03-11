
package com.javase.entity;

public class User {
	
	//protected
	protected String name;
	
	//default
	int age;

	protected String protectedMethod(){
		System.out.println("User's proteceted method");
		return name;
	}

	int defaultMethod(){
		System.out.println("User's default method");
		return age;
	}



	
}

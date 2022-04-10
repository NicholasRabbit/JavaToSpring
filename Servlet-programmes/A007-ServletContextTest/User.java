package com.servlet.myjava;

public class User {

	private String name;
	private int age;

	public User(){
	
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}

	public String toString(){
		return this.name+"="+this.age;
	}

}
package com.javaweb.http;

public class User {

	private String name;
	private int id;

	public User(){
	}
	public User(String name,int id){
		this.name=name;
		this.id=id;
	}

	public boolean equals(Object obj){
		if(obj==null || !(obj instanceof User)){
			return false;
		}else if(this==obj){
			return true;
		}

		User u=(User)obj;
		if(this.name.equals(u.getName()) & this.id==u.getId()){
			return true;
		}

		return false;
	}

	public String toString(){
		return this.name+"="+this.id;
	}

	//set,get方法
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
}
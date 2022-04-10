package com.javaweb.entity;

public class User {

	private int id;
	private String name;
	private String gender;
	private String tel;
	private String addr;

	public User(){
	
	}
	public User(int id,String name,String gender,String tel,String addr){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.tel=tel;
		this.addr=addr;
	}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return this.gender;
	}

	public void setTel(String tel){
		this.tel=tel;
	}
	public String getTel(){
		return this.tel;
	}

	public void setAddr(String addr){
		this.addr=addr;
	}
	public String getAddr(){
		return this.addr;
	}

	public String toString(){
		return "User ["+this.name+":"+this.gender+"]";
	}

	
}
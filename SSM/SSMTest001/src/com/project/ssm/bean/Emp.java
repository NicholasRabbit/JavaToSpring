package com.project.ssm.bean;

import java.io.Serializable;

public class Emp implements Serializable {
	
	private Integer id;
	private String ename;
	private String gender;
	private Integer age;
	private Integer did;
	
	public Emp() {
	
	}
	
	
	
	public Emp(Integer id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}



	public Emp(Integer id, String ename, String gender, Integer age, Integer did) {
		super();
		this.id = id;
		this.ename = ename;
		this.gender = gender;
		this.age = age;
		this.did = did;
	}


	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", gender=" + gender + ", age=" + age + ", did=" + did + "]";
	}

	

	

	
	
	
}

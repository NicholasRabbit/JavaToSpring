package com.mybatis.multiple.bean;

public class Emp {
	private Integer id;
	private String ename;
	private String gender;
	private Integer age;
	private Dept dept;
	
	public Emp() {
	
	}
	


	public Emp(Integer id, String ename, String gender, Integer age, Dept dept) {
		this.id = id;
		this.ename = ename;
		this.gender = gender;
		this.age = age;
		this.dept = dept;
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


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Dept getDept() {
		return dept;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", gender=" + gender + ", age=" + age + ", dept=" + dept + "]";
	}
	
	
	
	
	
}

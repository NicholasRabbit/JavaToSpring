package com.springframe.mvcJson.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	private Integer id;
	private String name;
	private Integer gender;
	
	@Autowired
	private Department dept;
	
	public Employee() {

	}
	
	public Employee(Integer id, String name, Integer gender, Department dept) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + "]";
	}
	
	
}

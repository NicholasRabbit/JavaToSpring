package com.springmvc.ss.bean;

import org.springframework.stereotype.Service;

@Service
public class User {
	
	private Integer id;
	private String name;
	
	public User() {
		System.out.println("User 无参构造执行！");
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}

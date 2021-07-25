package com.springframe.test01;

public class Teacher {
	
	private String name;
	private Integer id;
	private String subject;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, Integer id, String subject) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + ", subject=" + subject + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}

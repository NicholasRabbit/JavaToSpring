package com.springframe.scope;

public class Customer {
	private Integer id;
	private String name;
	
	static {
		System.out.println("Customer 静态代码块执行！");
	}
	
	{
		System.out.println("Customer 实例代码块执行！");
	}


	public Customer() {
		System.out.println("Customer 无参构造执行！");
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
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

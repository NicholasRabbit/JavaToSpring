package com.javaframe.beanprocessor;

public class User02 {
	
	private Integer id;
	private String name;
	
	public User02() {
		System.out.println("First step：user non-arguement constructor execute!");
	}
	
	public void setId(Integer id) {
		System.out.println("Second step: setter execute");
		this.id = id;
	}
	
	public Integer getId() {
		System.out.println("? step: getter execute");   //此行无输出？后期分析原因
		return id;										//在bean后处理程序中的方法 postProcessBeforeInitialization(..)前执行
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void init() {
		System.out.println("Third step:init method execute!");
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void destroy() {
		System.out.println("Fifth step: destroy method execute!");
	}
	
	
}

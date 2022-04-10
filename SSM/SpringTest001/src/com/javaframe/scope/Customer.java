package com.javaframe.scope;

public class Customer {
	
	private int age;	//变量类型不建议使用基本数据类型，这里仅作自我提示
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Customer [age=" + age + ", name=" + name + "]";
	}
    
	
}

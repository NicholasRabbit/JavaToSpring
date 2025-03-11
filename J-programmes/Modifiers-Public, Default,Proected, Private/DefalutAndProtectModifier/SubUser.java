
//SubUser和TestDefaultProtect.java在同一个包下，和User不在
package com.javase.test;

import com.javase.entity.User;

public class SubUser extends User {

	public void setName(String name){
		this.name = name;  //这里不报错，因为name是prtected修饰的
	}

	public void setAge(int age){
		//this.age = age;  // 此行报错，因为age在父类User中由default修饰，不可被继承
	}

	public void publicMethod(){
		System.out.println(this.name);
	}

	public void callProtected(){
		System.out.println("SubUser's call");
		protectedMethod();
	}

	public void callDefault(){
		System.out.println("SubUser's call");
		//defaultMethod();   //报错，因为无法继承不同包的父类的defalut修饰的方法
	}

}


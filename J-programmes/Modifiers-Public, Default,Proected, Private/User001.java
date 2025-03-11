package com.javase.file02;

import com.javase.file01.User;
public class User001 extends User {
    
    public void method(){
	
	   System.out.println("User001的method方法输出");
	   this.protectedData=100;    //protected修饰的属性，方法等，不同包的子类可以访问。
	   System.out.println(this.protectedData); 

	   //以下两句编译报错
	   this.defaultData=20;     //default修饰的成员变量无法被其异包子类继承，因此也不可以在不同包下访问。
	   //this.privateData=23;     //private修饰的只能在本类中访问。
	}
	
}

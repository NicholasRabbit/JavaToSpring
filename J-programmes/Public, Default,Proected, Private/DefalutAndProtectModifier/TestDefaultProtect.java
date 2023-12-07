/*
 * 1, protected,default修饰的变量，方法不可被异包下的类访问
 *   本例中在TestDefaultProtect中new一个User对象，由于它们不同包，
 *   所以无法访问user中的protected,default修饰的属性和方法。
 * 2, Student和本测试类同包，则这两个属性修饰的都可以访问。  
 *
 * 3, 总结：
 *   同包下：protected,default修饰的变量，方法可以被子类继承。也可以被外部类访问。
 *   不同包：protected修饰的属性和方法可以被子类继承，default的不可以。
 *           不同包下这两个修饰符修饰的属性，方法都不可以被外部的非子类访问。
 * */

package com.javase.test;

import com.javase.entity.User;

public class TestDefaultProtect{

	public static void main(String[] args){

		//Student is in the same package.
		//同包下都可以访问
		Student s = new Student("Tom",100);
		System.out.println(s.name);
		System.out.println(s.age);
		s.protectedMethod();	
		s.defaultMethod();
		

		//User跟本测试类不在同一包下,以下代码编译报错。
		User u = new User();
		//Compilation fails 
		//String userName = u.name;
		//u.protectedMethod();
		//u.defaultMethod();
	
		/*
		 * 3, 不同包的子类可以继承protected修饰的属性，不可继承default修饰的属性
		 * 详见SubUser代码解释。同包下则都可以继承。
		 * 注意：虽然protected的属性被继承下来了，但是在这里不能直接调用，还得通过public方法，
		 * */
		SubUser su = new SubUser();
		su.setName("Jerry");
		su.publicMethod();

		//name是protected修饰，不能像上面Student的对象那样直接调用，原因可能跟继承机制有关，继承的父类和本测试类不在同一个包下
		//String suName = su.name;  //错误: name 在 User 中是 protected 访问控制

		//default修饰的则直接无法被异包子类继承
		//String suAge = su.age;   //错误: age在User中不是公共的; 无法从外部程序包中对其进行访问   

		//su.protectedMethod(); 
		su.callProtected();
		//su.defaultMethod(); 


	}


}

package com.javase.reflect.test;

import java.util.Date;
import com.javase.reflect.entity.User;


//反射机制就是操作字节码，获取字节码内容有三种方式
public class ReflectTest201 {

	public static void main(String[] args){
		//第一种
		Class c1,c2,c3,i1;
		c1=null;
		c2=null;
		c3=null;
		i1=null;
		try{
			c1=Class.forName("java.util.Date");                  
			c2=Class.forName("com.javase.reflect.entity.User");  //参数是包名加类名全部，跨包的不需要import语句导入，因为已经写全了
			System.out.println(c1);
			System.out.println(c2);

			c3=Class.forName("java.lang.String");
			
			i1=Class.forName("java.lang.Integer");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		//第二种,调用父类final修饰的方法getClass()
		String str=new String("tom");
		Class c4=str.getClass();
		boolean b1=(c3==c4);
		System.out.println(b1);  //这里结果为true

		//测试Integer是否和String一样,一样
		Integer itg=new Integer(2);
		Class i2=itg.getClass();
		System.out.println(i1==i2);  //也为true
		//个人自建类也可以调用getClass()方法，因为它们的父类都是Object
		User u=new User();
		Class uClass=u.getClass();
		System.out.println(uClass);

		//第三种
		Class c5=String.class;
		Class c6=Integer.class;
		Class c7=User.class;
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		
		//错误情况,基本数据类型不可这样写
		/*
		int i=10;
		Class c8=i.class;
		Class c9=20.class;
		*/
		//基本数据类型获取class对象正确写法
		Class c8=int.class;
		Class c9=byte.class;
		System.out.println(c8);
		System.out.println(c9);

	}
}
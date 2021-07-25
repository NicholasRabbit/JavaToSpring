package com.javaframe.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaframe.annotation.controller.ControllerLayer;
import com.javaframe.annotation.dao.DaoLayer;

public class SpringAnnotationTest002 {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("annotation02.xml");  //默认单例模式，只要初始化，就把对象实例化了，因此对象中的无参构造内方法会输出
		
		/*(1)通过注解创建的对象有id，其默认的id名称是把类名首字母改为小写
		 *(2)注意如果类名是DAOLayer.java，无法通过默认id:dAOLayer获取对象，spring框架内部把这种开头几个都大写的类的id改为了别的名字，无法获取，建议改为DaoLayer.java
		 *就像int sList；这个属性Eclipse自动生成的set方法是setsList(),并没有首字母大写，错误
		 * */
		ControllerLayer  cl=app.getBean("controllerLayer", ControllerLayer.class);  
		DaoLayer dl=app.getBean("daoLayer",DaoLayer.class);  
		System.out.println("ControLayer对象 ==> "+cl);
		System.out.println("DAOLayer对象 ==> "+dl);
	}
}

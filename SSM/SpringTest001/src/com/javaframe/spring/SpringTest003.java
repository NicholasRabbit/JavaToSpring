package com.javaframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest003 {
	public static void main(String[] args) {
		
		
		ApplicationContext app=new ClassPathXmlApplicationContext("beansTest.xml");
		
		//不嵌套时的情况
		Student stu07=app.getBean("stu07",Student.class);
		System.out.println("stu07==>"+stu07);
		
		//xml文件<bean>标签嵌套<bean>范例，嵌套在内部的<bean>所表示的对象只能在内部使用，外部无法调用，参照xml文件内注释
		Student stu08=app.getBean("stu08",Student.class);
		System.out.println("stu08==>"+stu08);
		
		/*外部引用嵌套的<bean>表示的teacher对象，无法调用，报错
		//Student stu09=app.getBean("stu09",Student.class);    // 异常：org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 't02' is defined
		*/
	}
}

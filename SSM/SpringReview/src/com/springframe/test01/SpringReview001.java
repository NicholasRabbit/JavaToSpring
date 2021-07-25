package com.springframe.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringReview001 {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext201.xml");
		Student stu01=app.getBean("stu01",Student.class);
		System.out.println("stu01==>"+stu01);
		Student stu02=app.getBean("stu02",Student.class);
		System.out.println("stu02==>"+stu02);
		
		Student stu03=app.getBean("stu03",Student.class);
		System.out.println("stu03==>"+stu03);
		
		Student stu04=app.getBean("stu04",Student.class);
		System.out.println("stu04==>"+stu04);
		
		Student stu05=app.getBean("stu05",Student.class);
		System.out.println("stu05==>"+stu05);
		
		Student stu06=app.getBean("stu06",Student.class);
		System.out.println("stu06==>"+stu06);
	}
}

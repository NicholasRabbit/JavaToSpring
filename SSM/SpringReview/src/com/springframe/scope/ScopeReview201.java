package com.springframe.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeReview201 {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("scopeReview.xml");
		Customer c01=app.getBean("c01",Customer.class);
		c01.setId(1006);  //int自动打包为Integer
		c01.setName("Mark");
		System.out.println(c01+"c01 hashCode:==>"+c01.hashCode());
		
		Customer c02=app.getBean("c02",Customer.class);
		System.out.println(c02.hashCode());
		
	}
}

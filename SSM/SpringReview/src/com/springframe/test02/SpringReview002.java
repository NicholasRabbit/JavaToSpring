package com.springframe.test02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringReview002 {
	
    public static void main(String[] args) {
    	ApplicationContext  app=new ClassPathXmlApplicationContext("list.xml");
    	User u01=app.getBean("u01",User.class);
    	System.out.println("u01==>"+u01);
    	
    	List<Car> cars=u01.getCars();
    	System.out.println(cars instanceof ArrayList);
    	
    	User u02=app.getBean("u02",User.class);
    	System.out.println("u02==>"+u02);
	}
	
	

}

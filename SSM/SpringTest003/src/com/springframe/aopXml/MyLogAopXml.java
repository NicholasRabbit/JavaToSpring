package com.springframe.aopXml;

import org.springframework.stereotype.Component;

@Component   
public class MyLogAopXml {
	
	//前置通知
	public void beforeHandler() {
		System.out.println("MyLogAopXml==>前置通知");
	}
	
	//后置通知
	public void afterHandler() {
		System.out.println("MyLogAopXml==>后置通知");
	}
	
	//返回通知
	public void afterReturning() {
		System.out.println("MyLogAopXml==>返回通知");
	}
	
	
}

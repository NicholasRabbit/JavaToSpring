package com.javaframe.annotation_autowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javaframe.annotation_autowired.dao.DaoInterface;
import com.javaframe.annotation_autowired.dao.Dao_B;

@Service
public class Service_B implements ServiceInterface{
		
	/*三，@Autowired(required="false/true")，
	    当值为true时，找不到自动赋值对象，报错：则报错：Could not instantiate bean class Exception
	  required="false"时表示@Autowired所在的属性Car car上，即使Car.java这个类上没有这四个注解@Component,@Controller,@Repository,@Service，也不报错
	     不写required时，默认值为true
	 */
	@Autowired(required=true)    //如果这里为false，spring框架不报异常，但是下面还是会把NullPointerException,因为没有自动赋值
	@Qualifier("myDao")
	private DaoInterface db;
	
	
	
	public Service_B() {
		System.out.println("Service_B 无参构造执行！");
	}



	@Override
	public void add() {
		db.add();    
	}
}

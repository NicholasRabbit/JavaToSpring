package com.javaframe.annotation_autowired.dao;

import org.springframework.stereotype.Repository;

@Repository(value="myDao")   //四大注解内只有一个属性value();可省略
public class Dao_B implements DaoInterface {
	
	
	
	public Dao_B() {
		System.out.println("Dao_B 无参构造执行!");
	}

	@Override
	public void add() {
		System.out.println("Dao_B add() method execute!");
	}
}

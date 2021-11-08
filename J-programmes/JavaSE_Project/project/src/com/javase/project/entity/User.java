package com.javase.project.entity;

import org.apache.log4j.Logger;
import java.util.Date;

public class User {

	static Logger logger = Logger.getLogger(User.class);

	public static void main(String[] args){
		logger.info("printing log==>" + new Date());
		System.out.println("user main execute!");
	}
}
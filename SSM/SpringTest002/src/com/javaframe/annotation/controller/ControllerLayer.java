package com.javaframe.annotation.controller;

import org.springframework.stereotype.Controller;  //使用注解要导入相关的注解类

@Controller    
public class ControllerLayer {
	
	public ControllerLayer() {
		System.out.println("ControllerLayer execute!");
	}
}

package com.javaweb.controller;

import org.apache.log4j.Logger;
import java.util.Date;

//使用JavaSE命令创建Web项目
public class WebController {
	
	static Logger logger = Logger.getLogger(WebController.class);

	public static void main(String[] args){
		logger.info("日志打印==>" + new Date());
		System.out.println("WebController main execute!");
	}
}
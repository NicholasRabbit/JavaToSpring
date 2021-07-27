package com.springmvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")     //这里有路径，要加上
public class ExceptionTest {
	
	@RequestMapping(value="/testException")
	public String testException() {
		String str=null;
		str.toCharArray();      //NullPointerException
		return "done";
	}
}

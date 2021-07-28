package com.springmvc.ss.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.ss.bean.Student;


//controller对应的时SpringMVC,因此这里写SpringMVC相关操作的代码，处理的请求方法等

@Controller
public class ControllerLayer {
	
	@RequestMapping(value="/listener",method=RequestMethod.GET)
	public String testListener() {       
		return "done";              // 这里有返回值，正常转发到/jsp/done.jsp
	}
	
	@RequestMapping(value="/listener_b",method=RequestMethod.GET)
	public void testListenerB() {   //如果返回值为空void,框架底层还是会生成MoldAndView对象，默认转发的视图名是：请求路径名+.jsp,即listener_b.jsp        
		
	}
	
	
	//Spring是父容器，SpringMVC是子容器
	//子可访问父中的bean对象，反之不可
	@RequestMapping(value="/testcontext",method=RequestMethod.GET)
	public String testContext(HttpSession session) {       
		ServletContext context=session.getServletContext();
		Student stu=(Student)context.getAttribute("stu");       //SpringMVC的控制层获取Spring中的对象
		System.out.println("SpringMVC:Controller:stu==>"+stu);
		return "done";              
	}
	
}

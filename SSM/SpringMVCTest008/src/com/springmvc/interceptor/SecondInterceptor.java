package com.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



//@Component     //使用第二种，注解方式配置拦截器是加此注解
public class SecondInterceptor implements HandlerInterceptor {
	
	

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("SecondInterceptor==>  preHandler execute!");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		System.out.println("SecondInterceptor==>  postHandler execute!");
	}


	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

		System.out.println("SecondInterceptor==>  afterCompletion execute!");
	}
}

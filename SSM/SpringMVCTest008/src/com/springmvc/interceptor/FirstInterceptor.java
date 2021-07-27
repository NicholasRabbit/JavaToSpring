package com.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*拦截器的作用：拦截器位置是在DispatcherServlet和服务器之间，用于拦截不合理的请求，非法用户名等
 * 自定义拦截器拦截器步骤
 *(1)个人自定义拦截器可以实现HandlerInterceptor接口，也可以继承其实现类HandlerInterceptorAdaptor
 *(2)还要在interceptor-mvc.xml配置文件中加上<mvc:interceptors>标签
 * */


//@Component     //使用第二种，注解方式配置拦截器是加此注解
public class FirstInterceptor implements HandlerInterceptor {
	
	
	/*1,preHandler(..)方法，在请求之前执行
	 * 返回值true：表示放行请求。
	 * 返回值false：表示拦截请求，另外两个方法都不执行。
	 *2,postHandler(..)方法，在请求之后执行，即生成MoldAndView之后
	 *  (1)如果preHandler(..)返回值是false，则postHandler(..),不执行
	 *  (2)如果preHandler(..)返回值是true,但是InteceptorTest001处理请求的方法testInterceptor()有异常，则postHandler(..),不执行
	 *  (3)如果preHandler(..)返回值是true，且testInterceptor()无异常，那postHandler(..)才执行
	 *3，afterCompletion(..)方法，在请求之后执行，也是生成MoldAndView之后
	 *类似于finally，当preHander(..)返回值是true时，无论处理请求的方法testInterceptor()有无异常都执行。返回false就不执行。
	 **/
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("FirstInterceptor==>  preHandler execute!");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		System.out.println("FirstInterceptor==>  postHandler execute!");
	}


	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

		System.out.println("FirstInterceptor==>  afterCompletion execute!");
	}
}

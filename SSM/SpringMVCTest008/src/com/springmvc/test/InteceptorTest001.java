package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//个人笔记在FirstInterceptor.java里，多研究DispatcherServlet源码，拦截器执行相关的都在里面
/*两个拦截器的执行顺序，多个拦截器也是照此规律
 *preHandler(..)返回值:  第一个拦截器FirstInterceptor, 第二个SecondInterceptor
 *第一个	 第二个
 *false  ...    ：无论第二个拦截器返回什么，只执行第一个的preHandler(..)方法
 *true	false   :第一个的三个方法全执行，第二个只执行preHandler(..)	
 *true  true    :两个拦截器所有方法都执行，注意执行顺序如下，只有preHandler()方法按顺序执行，其它两个方法按倒序执行，跟底层代码for循环有关
 *  FirstInterceptor==>  preHandler execute!
	SecondInterceptor==>  preHandler execute!
	SecondInterceptor==>  postHandler execute!
	FirstInterceptor==>  postHandler execute!
	SecondInterceptor==>  afterCompletion execute!
	FirstInterceptor==>  afterCompletion execute!
 * */
@Controller
@RequestMapping(value="/test")
public class InteceptorTest001 {
	
	@RequestMapping(value="/interceptor")    //注意类上有路径，请求路径要加上
	public String testInterceptor() {
		//int i=6/0;         //发生byZero异常，测试postHandler(..)和 afterCompletion(..)方法哪个执行
		return "done";
	}
	
	/*@RequestMapping(value="/interceptor02")   //测试自定义拦截方式用
	public String testInterceptor02() {
		System.out.println("interceptor02");
		return "done";
	}*/
	
}

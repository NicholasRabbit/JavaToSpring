package com.springmvc.parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*这次范例再WEB-INF/lib下导入了jsp标签库JSTL的两个包jstl.jar,standard.jar。
 * JSTL有四个包只用这一组的两个就行，也可以用另外一组的两个taglib...jar包，或者四个都用，但是两组各取一个就不行。
 * */

/*用于形参的注解@RequestParam，@RequestHeader，@CookieValue等属性练习
 *注意这类注解于其锁修饰的形参之间不要加逗号“，”，只用空格隔开
     以及HttpServletRequest,HttpServletResponse作为处理请求的方法的形参的用法
 * */

@Controller
public class AboutParameterTest {
	
	/*一，@RequestParam注解，应用范围：可自定义方法形参变量名，可与表单不一致，实际案例中程序员遇到浏览器传来的名称与原有程序中的有冲突时，可用此注解，自定义变量名
	 * 常用属性：
	 * (1)value="username",属性的值要与浏览器表单内的name属性值一致,注意!
	 * (2)required=true/false,默认为true,表示本例中必须有含有这项标签<input type="text" name="username">，否则报错:Required String parameter 'username' is not present，
	 *    注意如果有这个标签，但是不写值食不报错的
	 *    false则表示非必须
	 * (3)defaultValue=“tom”,仅在required=false时使用，即没有标签<input type="text" name="username">时，可按默认值
	 * */
	@RequestMapping(value="/param",method=RequestMethod.POST)
	public String testParam(@RequestParam(value="username",required=true) String customerName, @RequestParam("password") String customerPwd) {
		System.out.println("testParam==>"+customerName+"="+customerPwd);
		return "done";
	}
	
	/*二，@RequestHeaders注解，用法与@ReqeustParam一样，两者内含属性也一致。即属性value,required,defaultValue用法一样
	 * 可接收浏览器传来的表头信息,value值要与浏览器的名称对应一致，否则无法接收
	 * */
	@RequestMapping(value="header",method=RequestMethod.POST)
	public String testHeader(@RequestHeader(value="Content-Type") String cache_Control,@RequestHeader("Cookie") String cookieValue) {
		System.out.println("header:Content-Type==>"+cache_Control+", Cookie==>"+cookieValue);
		return "done";
	}
	
	/*三，@CookieValue注解，专门用来接收请求头中的Cookie值，即JSESSIONID，是session对象，因为session是依赖于cookie存在的，用法也与@RequestParam一样
	 * 属性value的值是"JSESSIONID"要与浏览器中的名称一致
	 * 与上面@RequestHeader("Cookie")接收到的值一样
	 * */
	@RequestMapping(value="cookie",method=RequestMethod.POST)
	public String testCookie(@CookieValue("JSESSIONID") String cookieValue) {
		System.out.println("CookieValue==>"+cookieValue);
		return "done";
	}
}

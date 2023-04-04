package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*1，Eclipse集成Tomcat以后，个人项目主页可访问，但是Tomcat主页不可访问
 * 原因：Eclipse只是使用Tomcat的相关组件，并不会直接把他们复制到Eclipse里，同时也不会对原有的Tomcat文件做任何修改
 * 而Tomcat的主页在webapps的ROOT目录写，自然不可访问
 *2，Eclipse环境下的web项目，生成的class文件在build文件夹下，但是不可见，需手动找到文件夹，即可看到
 */

/*Eclipse的web项目的目录和手动创建web项目的对应关系
 *(1)Eclipse的WebContent目录相当于MyEclipse里的WebRoot
 *(2)WebContent代表的时项目根目录，实际项目名时SpringMVCTest001,将来布置项目时要把WebContent名字改为相应的项目名
 * */

//使用SpringMVC时，普通的java对象POJO要加相应的注解@Controller等等，目的是让Spring框架识别并自动创建对象
@Controller
public class SpringMVCTest001 {
	
	/*一，@RequestMapping注解
	 *(1)value="test",表示地址栏中uri的值，输入这个地址即可访问注解所在方法，跟Servlet中<url-pattern>和servlet对象对应关系类似
	 *(2)方法名不需和value的值一致，但建议写成一致或相关的方法名
	 *(3)用户通过请求访问此方法后，在Spring框架本身的xml文件中创建<bean>对象InternalResourceViewResolver.java即可跳转到指定页面，跳转规则见xml配置文件
	 * */
	@RequestMapping(value="/test")
	public String testMethod() {    
		System.out.println("done");
		return "done";    //返回值是视图名称,即跳转到页面的名称是done.jsp，如果返回值是空则不跳转
	}
	
	/*二，如果在地址uri后输入.../test02?username=Tom&password=456,可写个有参方法接收
	 *(1)可以用String类型，注意形参的变量名要和网址上问号"?"后的名称一致
	 *(2)也可用对象接收，对象内的属性变量名也要和问号后的名称一致
	 * */
	@RequestMapping("test02")  //按照注解规则，如果括号内只需给一个属性赋值，且属性民为value,同时其它属性定义了默认值的情况下，则不需写属性名，
	public String test02Method(String username,String password) {
		System.out.println(username+"="+password);   //输出：Tom=456
		return "done";
	}
	
	@RequestMapping("test03")
	public String test03Method(User user) {
		System.out.println(user.getUsername()+"="+user.getPassword());  //输出：Rose=333
		return "done";
	}
}

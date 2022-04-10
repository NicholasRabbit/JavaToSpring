package com.springmvc.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*(1)html中<form>表单<input>标签的 method属性只有两个，即get和post,而@RequsetMapping注解中的method属性有八个，实际操作数据库也要用到八个
       因此需要把这前面两个属性转化为八个属性，Spring框架底层用到了HiddenHttpMethodFilter.java这个类进行转换，实际是把另外六个先转换为post再提交
  (2)不能用超链接加问号的形式发送put，delete等请求，因为这个请求要转换为post再提交，而超链接默认是发送get请求
      例：<a href="../test?method=DELETE&id=1001">删除</a>，是错误的
  (3)把put,delete等请求转换为post实际是用到了<input>标签里的一种赋值方式，name="_method" value="put",注意"_method"是固定写法，不可更改，
        真正提交时，HiddenHttpMethodFilter实际把post替换为了_method的值put,这就实现了转换，这些须在web.xml文件中进行配置
*/
//本代码就是Rest风格的增删改查
@Controller
public class SpringMVCTest003 {
	
	//处理get请求，注解中属性method有对应的值GET，可直接访问，get请求一般用于查询
	@RequestMapping(value="testGet", method=RequestMethod.GET)
	public String queryUser(String username,String password) {
		System.out.println("testGet==>"+username+"="+password);
		return "done";
	}
	
	//post请求，一般用于增加用户数据
	@RequestMapping(value="testPost", method=RequestMethod.POST)
	public String addUser(User user) {
		System.out.println("testPost==>"+user.getUsername()+"="+user.getPassword());
		return "done";
	}
	
	//put请求，一般用于更改数据
	@RequestMapping(value="testPut", method=RequestMethod.PUT)
	public String updateUser(User user) {
		System.out.println("testPut==>"+user.getUsername()+"="+user.getPassword());
		return "done";
	}
	
	//delete请求，删除数据
	@RequestMapping(value="testDelete", method=RequestMethod.DELETE)
	public String deleteUser(User user) {
		System.out.println("testDelete==>"+user.getUsername()+"="+user.getPassword());
		return "done";
	}
	
	/*Rest风格写法验证，
	(1)使用Rest风格的路径时，必须在形参加@PathVariable，它的元注解是@Target(value=PARAMETER)，就是规定加在形参上的
	(2)@PathVariable中value的属性值必须和浏览器传来的一致，但它所标注的形参变量名可以是别的名字，以后浏览器传来的属性名与原有程序变量冲突时，
	   可把形参里变量名改为别的。
	*/
	@RequestMapping(value="testRest/{id}", method= {RequestMethod.DELETE})
	public String testRest(@PathVariable(value="id") Integer idValue,HttpServletRequest request) {
		System.out.println("request==>"+request);        //输出：org.springframework.web.filter.HiddenHttpMethodFilter$HttpMethodRequestWrapper@5d049b29
		System.out.println("testRest==> id="+idValue);   //说明底层还是用到了Servlet中的ServletRequest
		return "done";
	}
	
	
}

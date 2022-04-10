package com.springframe.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*(1)@RequestMapping中属性value值加斜线和不加斜线的区别
 *   "test":不加“/”表示访问当前目录下的请求路径
 *   “/test”:加“/”表示访问项目目录下的请求路径，以后写项目建议加上，定位精确
 *   因为项目的根目录是WebContent，所以加不加没什么区别
 *(2)@RequestMapping注解同时加在类上和方法上，路径uri 如何写？
 *在类上加该注解后，并且制定了uri路径，那么访问请求对应的方法的路径要加上类上写的路径
 *例如：本例是  /SpringMVCTest002/mvc/test
 *(3)@RequestMapping其它属性含义
    *              一，method属性，
 *       RequestMethod.GET:表示只有get请求才会被程序处理
 *       RequestMethod.POSt:表示只有post请求才会被处理
 *       method的其它属性值同理
 *                二，params属性：对浏览器传来的数据进行限制，其值是String[]数组，数组内元素支持表达式
 *       params={"username","password"} :可接收浏览器传来属性名为username,password的值的请求
 *       {"!username"}:不接收以username为名字的值
 *       {"username != jerry"}:不接收uername是jerry的请求
 *       {"username=tom","password=333"}：只接收用户名为tom,密码为333的请求
 *                三，headers属性，设置好要接收的请求头信息，只有浏览器发来的请求与设置的一致时才会被接收，属性值是String[]数组
 *       headers={"Accept-Language=zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2"},设置接收的语言设置
 *                        也有其它的设置Accept-Encoding等等
 *                四，value属性，赋值支持Ant的方式
 *       *：表示匹配任意字符
 *                        ？：  表示匹配任意单个字符
 *       **：匹配任意多层目录
 *                五，Rest风格的路径名，结合注解@PathVariable定义占位符使用，使路径风格变简洁了，见下面代码
 * */ 

@RequestMapping("/mvc")
@Controller
public class SpringMVCTest002 {
	
	@RequestMapping("/test")    
	public String testMethod() {    
		System.out.println("testMethod execute!");
		return "achieved";   //返回值是要跳转到的视图名称，即跳转目标jsp页面的名称，如果返回值是空则不跳转
	}
	
	//method属性
	@RequestMapping(value="/testGetPost",method=RequestMethod.POST)   //超链接请求默认是get,如果这里是POST，则访问不到
	public String testGetPost(String username,String password) {      //这里String类型的形参列表可接收用户表单传来的数据，也可使用java对象来接收
		System.out.println(username+"="+password);
		System.out.println("post?get?");
		return "achieved";
	}
	
	//params属性
	@RequestMapping(value="/testParams",method=RequestMethod.GET, params= {"username=jack","password=333"})  //只有请求中username=jack，password=333时才会被方法处理
	public String testParams(User user) {                          
		System.out.println(user.getUsername()+"="+user.getPassword());
		return "achieved";
	}
	
	//headers属性，浏览器设置的语言顺序要与这里的顺序一致，否则不接收浏览器的任何请求，请求头headers的其它属性设置同理
	@RequestMapping(value="testHeaders", headers= {"Accept-Language=zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2"})
	public String testHeaders() {
		System.out.println("testHeaders execute!");
		return "achieved";
	}
	
	// value属性，Ant方式赋值
	// (1)"/*/testAnt": 请求路径uri是 ../mvc/任意/testAnt
	// (2)"/?/testAnt" : 请求路径范例：../mvc/x/testAnt,x代表单个字母
	// (3)"/**/testAnt" :请求路径范例：../mvc/abc/xyz/testAnt,多重路径，实际是也包含了（1）（2）两种情况
	@RequestMapping(value="/**/testAnt")  //请求路径uri是 ../mvc/任意/testAnt,注意类名上定义的路径要加上，这里通配符只是定义方法的访问路径
	public String testAnt() {
		System.out.println("testAnt execute!");
		return "achieved";
	}
	
	/*Rest风格的路径名
	 * 正常的路径名：localhost:8080/SpringMVCTest002/mvc/test/?username=tom&password=333
	 *Rest风格的路径：localhost:8080/SpringMVCTest002/mvc/testRest/tom/333
	    *实际是定好了占位符{username}，uri中的路径用"/"隔开，依次对应
	 *使用Rest风格的路径时，必须在形参加@PathVariable，它的元注解是@Target(value=PARAMETER)，就是规定加在形参上的
	 */
	@RequestMapping("/testRest/{username}/{password}")
	public String testRest(@PathVariable("username") String username, @PathVariable("password") String password) {
		System.out.println("testRest==>"+username+"="+password);
		return "achieved";
	}
	
	
	
	
	
}

package com.springmvc.modelAndView;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.User;

/*(1)SpringMVC内置类ModelAndView的用法
 *(2)向作用域中放值，即向request请求种添加值有三种方式，即获得浏览器请求值的三种方式，这三种方式最终底层都是用到了ModelAndView.java这个类，因此它们层原理一样
 * */

@Controller
public class ModelAndViewTest {

	Map<String,Object>  myMap;
	/*第一种方式，即ModelAndView的用法，直接使用ModelAndView
	 *这个类包含了保存请求数据和转发视图这两个功能，即model模型和view视图
	 * */
	@RequestMapping(value="/mav",method=RequestMethod.POST)
	public ModelAndView mavTest(User user) {       //想要被Spring框架调取到个人创建的ModelAndView对象，这里返回值不可写为空void,需写ModelAndView, 否则无法实现后续的跳转等功能
		ModelAndView mav=new ModelAndView();      
		mav.addObject("age",new Integer(25));      //向request作用域种放值，可以在转发到的目的页面用<%=request.getAttribute(user01)%>得到
		mav.addObject("user01",user);              //也可把含有浏览器数据的User对象添加进去
		mav.setViewName("done");                   //设置视图的名称，会被视图转发器DispatcherServlet识别，并转到这个名字“done”的页面
		System.out.println("mav==>"+mav);                                                           // 这里是浏览器用户输入的数据
		//输出：mav==>ModelAndView: reference to view with name 'done'; model is {age=25, user01=User [username=Luna, password=333]}
		
		return mav;     //返回值是ModelAndView对象，   在浏览器页面可通过request.getAttribute(..)获取数据 
	}					//因此使用Model可向浏览器响应数据。
	
	/*第二种方式，向Map集合种放值，即实现了向作用域中放值的效果
	 * */
	@RequestMapping(value="/map",method=RequestMethod.POST)
	public String mapTest(Map<String,Object> map) {        //这里在形参里加上User user等，接收浏览器传来的数据，然后把user对象添加到Map集合里
		
		map.put("age", new Integer("40"));      //向request作用域中放值
		
		//遍历Map集合，看值是否放入了进去，是否得到了原来浏览器数据
		Set<Map.Entry<String,Object>>  entrySet=map.entrySet();
		Iterator<Map.Entry<String, Object>> it=entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Object> entry=it.next();
			String key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+"="+value);   //输出age=40,并没有自动接收浏览器传来的数据
		}
		return "done";
	}
	
	/*第三种方式，使用Model.java类，向作用域中放值
	 * */
	@RequestMapping(value="/model", method=RequestMethod.POST)
	public String modelTest(Model model,User user) {      //这里形参可只写一个Model model,也可加上之前接收浏览器数据参数的形参，如User user或String username,String password
		model.addAttribute("user",user);				  //然后就可以把接收到的数据添加到Model对象中
		model.addAttribute("age",new Integer(35));
		System.out.println("model==>"+model);            //Model.java重写了toString()
		return "done";
	}
	
	
	
}

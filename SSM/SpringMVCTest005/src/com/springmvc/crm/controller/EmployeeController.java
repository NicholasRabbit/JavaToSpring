package com.springmvc.crm.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.crm.bean.Department;
import com.springmvc.crm.bean.Employee;
import com.springmvc.crm.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	//一，显示用户列表
	/*(1)使用ModelAndView可向浏览器响应数据
	 *(2)首先向请求对象HttpServletRequest中添加数据：mav.addObject("empList",emps);
	 *(3)返回值必须是ModelAndView对象
	 * */
	@RequestMapping(value="/showList" ,method=RequestMethod.GET)
	public ModelAndView showList() {
		ModelAndView mav=new ModelAndView(); 
		Collection<Employee> emps=employeeService.getEmps();   
		mav.addObject("empList",emps);    //关键步骤，向请求对象HttpServletRequest中添加数据，可在jsp页面使用内置对象request。getAttribute("empList")获取这个数据
		mav.setViewName("list");
		return mav;
	}
	
	//二，1，再添加用户页面循环输出部门选项
	/*(1)在同一个程序中@RequestMapping的value值可相同，如本例中两个"/add",method的值必须不同，靠method的请求值来区分；
	 *(2)如果是超链接发来的请求，是get请求，由toAdd()方法来处理，如果是表单的post请求，则由addEmp()方法处理；
	 *(3)下面这个方法的作用是处理list.jsp页面的增加请求，在add_page.jsp页面把depts部门集合循环输出，这样部门名称就不必写死了。
	 *(4)直接用HttpServletRequest传递数据到add_page.jsp页面也行，但不建议，这样写了框架就没用了
	 * */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String toAdd(HttpServletRequest request) {   
		Collection<Department>  depts=employeeService.getDepts();
		request.setAttribute("depts", depts);
		return "add_page";   //这里转发到add_page.jsp页面，该页面有表单提交post请求，由下面路径value="/add"一样的方法addEmp()处理
	}
	
	//二，2，添加用户
	/*添加用户时出现问题,解决办法：
	 *(1)Http400错误，原因：浏览器部门选项最开始是<input type="text">空白框用户自己输入的是字面量，而请求方法的形参emp对象内部门属性是Department dept，是个引用，类型不一致
	 *(2)解决方案：把<input>改为<select name="dept.did">多选框，注意name的值写法，属于级联属性写法，dept与Employee中部门属性名一致，did与部门的属性一致，这样Spring框架会自动找到对应的参数接收浏览器数据
	 *<option value="11">中value值是部门编号，见add_page.jsp中代码
	 *(3)总结，以后客户端尽可能让用户做选择，不要自己输入，避免数据格式错误
	 * */
	@RequestMapping(value="/add",method=RequestMethod.POST)    //添加完员工之后要回显，即显示整个列表，方法见下方return语句
	public String addEmp(Employee emp) {
		Integer did=emp.getDept().getDid();
		System.out.println("did==>"+did);
		System.out.println("add method==>"+emp.getName()+","+emp.getGender()+","+emp.getDept());
		employeeService.addEmp(emp);

		//return: "redirect:/jsp/list.jsp";   //错误，这里不要直接转到list.jsp静态页面，新加的数据无法传到浏览器，要访问“/showList”把最新用户数据展示出来
		return "redirect:/showList";           //这里就实现了添加完用户回显的功能,注意要用重定向，用转发的话如果用户刷新页面会重复添加数据
	}
	
	//三，删除用户，这里接收路径的是Rest风格的写法的请求
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String deleteEmp(@PathVariable("id") Integer id) {
		
		System.out.println("deleteEmp==>"+id);
		employeeService.deleteEmp(id);
		return "redirect:/showList";      //这里删除完，要回显，重定向路径要加斜线"/",表示项目路径下的，不加斜线则是相对路径，会在原有的路径后面累加，即../delete/showlist，是错误的
	}                                    //不加斜线“/”会出异常：HTTP状态 405 - 方法不允许， Request method 'GET' not supported
	
	
	/*四，更改用户数据
		第一步，首先在更改页面展示原信息，使用ModelAndView类来向浏览器传递数据
	*/
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView toUpdate(@PathVariable(value="id") Integer id) {
		Employee emp=employeeService.getEmployee(id);
		Collection<Department> depts=employeeService.getDepts();
		ModelAndView mav=new ModelAndView();
		mav.addObject("emp",emp);
		mav.addObject("depts",depts);
		mav.setViewName("update_page");    //转发到修改信息页面
		return  mav;
	}
	//第二步，在修改信息页面进行修改
	@RequestMapping(value="/update", method=RequestMethod.PUT)  //PUT方法是表示修改，即对应数据库的update
	public String updateEmp(Employee emp) {    //这里要用Employee对象来接收修改表格提交的数据，因为属性和表格的name值是一 一对应的
		//修改员工信息跟添加是一样的原理，只不过修改是覆盖原有信息
		employeeService.addEmp(emp);
		return "redirect:/showList";
	}
	
}

package com.project.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.ssm.bean.Dept;
import com.project.ssm.bean.Emp;
import com.project.ssm.service.ServiceInterface;

/*SSM整合范例
 *(1)注意DAO层，即EmpMapper.java别忘了加注解@Repository
 * */


@Controller
public class EmpController {
	
	@Autowired
	ServiceInterface si;
	
	//1，获取所有员工，展示员工列表。
	@RequestMapping(value="/all_emps", method=RequestMethod.GET)
	public String getAllEmps(Map<String,Object> empMap) {          //使用Map集合的形式向浏览器页面传送数据  
		List<Emp> empList=si.getAllEmpsByList();
		empMap.put("empList", empList);            //把从数据库获取的用户信息放进Map集合里，响应到jsp页面
		System.out.println("empMap==>"+empMap);
		return "showList";
	}
	
	//2，展示单个员工详情，包括部门信息，要两表联查
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public ModelAndView getEmpById(Integer id) {          //使用ModelAndView向 浏览器页面传送信息
		Emp emp01=si.getEmpById(id);
		ModelAndView mav=new ModelAndView();
		mav.addObject("emp", emp01);
		mav.setViewName("empInfo");
		return mav;
	}
	
	
	
	//3，删除单个员工,Rest风格写法，注意@PathVariable("id")中value值要和占位符{id}一致，这里的名称“id”可自定义，但建议与对象属性一致
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET )
	public String deleteEmpById(@PathVariable("id") Integer id) {   
		Integer count=si.deleteEmpById(id);
		System.out.println("删除条数==>"+count);
		return "redirect:/all_emps";       //删除完进行回显
	}
	
	/*4，增加单个员工
	 * 员工id数据库设置的是自动递增，所以add.jsp页面不用输入，但是有个问题，原先表格删除员工的id也累加进来，因此下面在程序中写代码进行覆盖*/
	@RequestMapping(value="/addSingle", method=RequestMethod.POST)
	public String addEmp(Emp emp) {
		Integer maxId=si.getMaxId();
		emp.setId(++maxId);            //获取最大id，然后自加1，再添加员工。javase基础知识回顾，maxId++先赋值后自加1，因此不能用maxId++。
		Integer count=si.addEmp(emp);
		System.out.println("添加成功数量==>"+count);
		return"redirect:/all_emps";       //增加完员工进行回显，注意要用重定向，两次请求，不可用转发
	}
	
	//5，修改员工信息，分两步，这两步，请求地址都是“/update”,但是请求方式不同，因此浏览器发过来请求后可区分
	//第一步：先显示原有的信息，做对比提示
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String beforeUpdateEmp(@PathVariable("id") Integer id,Map<String,Object> empDeptMap) {
		Emp emp=si.getEmpById(id);
		List<Dept> deptList=si.getAllDeptAsList();    //获取所有部门信息，添加页面供选择
		empDeptMap.put("emp", emp);
		empDeptMap.put("deptList", deptList);
		return "updatePage";
	}
	//第二步：提交修改
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateEmp(Emp emp) {
		//浏览器传过来dept.did,通过did获取dname,再给emp对象赋值
		Integer did=emp.getDept().getDid();
		Dept dept=si.getDeptByDid(did);
		emp.setDept(dept);         //只更新MySql的emp表，有did就行了，不用dname,这里仅作练习
		
		//更新员工信息
		Integer count=si.updateEmp(emp);
		System.out.println("更新成功条数==>"+count);
		return "redirect:/all_emps";
	}
	
}

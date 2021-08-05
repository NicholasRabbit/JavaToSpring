package com.project.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.ssm.bean.Emp;
import com.project.ssm.service.ServiceInterface;

/*SSM整合范例
 *(1)注意DAO层，即EmpMapper.java别忘了加注解@Repository
 * */


@Controller
public class EmpController {
	
	@Autowired
	ServiceInterface si;
	
	//展示员工列表
	@RequestMapping(value="/all_emps", method=RequestMethod.GET)
	public String getAllEmps(Map<String,Object> empMap) {    
		List<Emp> empList=si.getAllEmpsByList();
		empMap.put("empList", empList);            //把从数据库获取的用户信息放进Map集合里，响应到jsp页面
		System.out.println("empMap==>"+empMap);
		return "showList";
	}
}

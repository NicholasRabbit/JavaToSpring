package com.project.ssm.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.ssm.bean.Emp;
import com.project.ssm.service.ServiceInterface;
import com.project.ssm.util.PageUtil;

//使用PageHelper工具类进行分页展示

@Controller
public class EmpControllerPageHelper {
	
	@Autowired
	ServiceInterface  si;
	
	@RequestMapping(value="/page_helper/{pageNo}", method=RequestMethod.GET)
	public String pageHelper(@PathVariable("pageNo") Integer pageNo, Map<String, Object> empMap, HttpServletRequest request) {
		
		//1，在获取查询数据之前先设定好起始页及页数,其中pageNo需要从浏览器获取，由用户指定
		PageHelper.startPage(pageNo, 2);    
		//2，查询并获取员工信息。
		List<Emp>  empList=si.getAllEmpsByList();
		//3，设定最下行页码数量为4，即1-4或2-5，注意这里的PageInfo(List<T> list, int navigatePages)，参数navigagePages是下面的页码范围数量
		PageInfo<Emp> pageInfo=new PageInfo<Emp>(empList,4);   
		//4，获取要展示的页码
		String pages=PageUtil.getPageInfo(pageInfo, request);
		//5，放进 Map集合，传到浏览器
		empMap.put("empList", empList);
		empMap.put("pageInfo", pages);
		
		return "showList_with_pages";
	}
	
}

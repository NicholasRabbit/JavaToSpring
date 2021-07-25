package com.springmvc.crm.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springmvc.crm.bean.Department;

@Repository
public class DepartmentDao {
	
	private static Map<Integer,Department>  depts;
	
	static {
		depts=new HashMap<>();    //泛型的钻石型写法，回顾
		depts.put(11, new Department(11,"销售部"));
		depts.put(22, new Department(22,"人事部"));
		depts.put(33, new Department(33,"生产部"));
		depts.put(44, new Department(44,"财务部"));
		depts.put(55, new Department(55,"后勤部"));
	}
	
	//获取所有部门，返回值值一个集合
	public Collection<Department> getDepts(){
		return depts.values();
	}
	
	//获取单个部门
	public Department getDept(Integer did) {
		Department dept=depts.get(did);
		return dept;
	}
}

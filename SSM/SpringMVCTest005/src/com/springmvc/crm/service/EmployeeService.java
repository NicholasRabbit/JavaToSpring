package com.springmvc.crm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.crm.bean.Department;
import com.springmvc.crm.bean.Employee;
import com.springmvc.crm.dao.DepartmentDao;
import com.springmvc.crm.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao  employeeDao;
	
	@Autowired
	DepartmentDao departmentDao;
	
	
	//获取所有员工的集合
	public Collection<Employee> getEmps() {
		Collection<Employee> emps=employeeDao.getEmps();
		return emps;
	}
	
	//获取单个员工
	public Employee getEmployee(Integer id) {
		return employeeDao.getEmployee(id);
	}
	
	//添加员工
	public void addEmp(Employee emp) {
		employeeDao.addEmp(emp);
	}
	
	//获取所有部门的集合
	public Collection<Department> getDepts(){
		return departmentDao.getDepts();
	}
	
	//获取单个部门
	public Department getDept(Integer did) {
		return departmentDao.getDept(did);
	}
	
	//删除员工
	public Employee deleteEmp(Integer id) {
		Employee emp=employeeDao.deleteEmp(id);    //返回值是被删除的value,即Employee对象
		return emp;
	}
	
	
}

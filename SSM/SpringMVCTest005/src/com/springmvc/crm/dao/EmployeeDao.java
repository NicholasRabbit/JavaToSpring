package com.springmvc.crm.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.crm.bean.Department;
import com.springmvc.crm.bean.Employee;

@Repository
public class EmployeeDao {
	
	private static Map<Integer, Employee> employees;
	private static Integer id=1005;    //这里不可设置成实例变量，因为实例变量在创建对象的时候会初始化，即每次创建EmployeeDao对象时都变为1005，如果之前添加过1005，则会重复添加。静态变量是类层面的，不会发生此情况。
	
	@Autowired
	DepartmentDao deptDao;
	static {
		System.out.println("empDao static execute!");
		employees=new HashMap<>();
		employees.put(1001, new Employee(1001,"Tom",1,new Department(11,"销售部")));
		employees.put(1002, new Employee(1002,"Jerry",0,new Department(22,"人事部")));
		employees.put(1003, new Employee(1003,"Leon",1,new Department(33,"生产部")));
		employees.put(1004, new Employee(1004,"Kate",0,new Department(44,"财务部")));
		employees.put(1005, new Employee(1005,"Nash",1,new Department(55,"后勤部")));
	}
	//注意服务器重启之后，原先添加的会清除，因为重新加载类了，静态代码块重新执行了
	
	
	
	//获取全部员工数据
	public Collection<Employee> getEmps() {
		Collection<Employee> emps=employees.values();
		System.out.println("emps==>"+emps);
		return emps;
	}
	
	//获取单个员工数据
	public Employee getEmployee(Integer id) {
		return employees.get(id);
	}
	
	//添加新员工
	public void addEmp(Employee emp) {
		if(emp.getId() == null) {
			emp.setId(id+=1);
		}
		Department dept=deptDao.getDept(emp.getDept().getDid());
		emp.setDept(dept);
		employees.put(emp.getId(), emp);
	}
	
	//删除员工
	public Employee deleteEmp(Integer id) {
		Employee emp=employees.remove(id);    //返回值是被删除的value,即Employee对象
		return emp;
	}
	
	
	
	
}

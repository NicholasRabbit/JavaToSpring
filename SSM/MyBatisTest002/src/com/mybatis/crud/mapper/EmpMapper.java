package com.mybatis.crud.mapper;

import java.util.List;

import com.mybatis.crud.bean.Emp;

public interface EmpMapper {

	//查询单个员工
	public abstract Emp getEmpById(Integer id);
	
	//查询全部员工信息
	public abstract List<Emp> getAllEmps();
	
	//增加员工信息
	public abstract void addEmp(Emp emp);
	
	//删除员工
	public abstract Integer deleteEmp(Integer id);   //返回值是Integer,则返回删除结果的条数，不成功则返回0
	
	//修改员工信息
	public abstract Boolean updateEmp(Emp emp);
	
}

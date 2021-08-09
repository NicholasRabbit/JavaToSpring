package com.project.ssm.service;

import java.util.List;

import com.project.ssm.bean.Dept;
import com.project.ssm.bean.Emp;


public interface ServiceInterface {
	   
	//获取所有员工
	public abstract List<Emp>  getAllEmpsByList();
	
	//展示单个员工信息详情
	public abstract Emp getEmpById(Integer id);
	
	//删除单个员工
	public abstract Integer deleteEmpById(Integer id);
	
	//增加单个员工
	public abstract Integer addEmp(Emp emp);
	
	//获取当前员工最大编号
	public abstract Integer getMaxId();
	
	//获取部门信息
	public abstract Dept getDeptByDid(Integer did);
	
	//获取所有部门信息
	public abstract List<Dept> getAllDeptAsList();
	
	//更新员工信息
	public abstract Integer updateEmp(Emp emp);
	
}

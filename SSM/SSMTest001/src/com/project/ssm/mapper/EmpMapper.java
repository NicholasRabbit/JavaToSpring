package com.project.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.ssm.bean.Emp;

//EmpMapper.java就相当于DAO层的EmpDao.java
@Repository
public interface EmpMapper {
	
	//获取所有员工
	public abstract List<Emp>  getAllEmpsByList();
	
	//展示单个员工信息详情,两表联查
	public abstract Emp getEmpById(Integer id);
	
	//删除单个员工
	public abstract Integer deleteEmpById(Integer id);
	
	//增加单个员工
	public abstract Integer addEmp(Emp emp);
	
	//获取当前员工最大编号
	public abstract Integer getMaxId();
	
	//更新员工信息
	public abstract Integer updateEmp(Emp emp);
	
	
}

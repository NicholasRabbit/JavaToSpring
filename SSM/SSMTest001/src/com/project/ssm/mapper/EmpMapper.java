package com.project.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.ssm.bean.Emp;

//EmpMapper.java就相当于DAO层的EmpDao
@Repository
public interface EmpMapper {
	
	//获取所有员工
	public abstract List<Emp>  getAllEmpsByList();
}

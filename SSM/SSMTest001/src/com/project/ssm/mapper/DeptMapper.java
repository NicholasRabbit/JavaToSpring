package com.project.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.ssm.bean.Dept;

@Repository
public interface DeptMapper {
	
	//获取单个部门信息
	public abstract Dept getDeptByDid(Integer did);
	
	//获取所有部门信息
	public abstract List<Dept> getAllDeptAsList();
}

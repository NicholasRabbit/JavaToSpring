package com.mybatis.cache.mapper;

import com.mybatis.cache.bean.Emp;

public interface EmpMapper {
	
	//根据id查询员工
	public abstract Emp getEmpById(Integer id);
	
	//删除员工
	public abstract Integer deleteEmpById(Integer[] ids);
}

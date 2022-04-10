package com.mybatis.cache.mapper;

import com.mybatis.cache.bean.Emp;


public interface EmpMapper {

	//测试二级缓存，第三方的
	public abstract Emp getEmpById(Integer id);
	
	//删除
	public abstract Integer deleteEmpById(Integer id);
	
}

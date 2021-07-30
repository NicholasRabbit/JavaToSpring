package com.mybatis.dynamic.mapper;

import java.util.List;

import com.mybatis.dynamic.bean.Emp;


public interface EmpMapper {

	//多条件查询，静态sql：  因为如果按名字查询可能会有重名的人，所以这个返回值用List
	public abstract List<Emp> getEmp(Emp emp);
	
	//多条件查询，动态sql
	public abstract List<Emp> getEmpDynamic(Emp emp);
	
	//多条件查询之<trim>的用法
	public abstract List<Emp>  getEmpDynamic02(Emp emp);
	
	//测试
	Emp getEmpById(Integer id);
	
	
}

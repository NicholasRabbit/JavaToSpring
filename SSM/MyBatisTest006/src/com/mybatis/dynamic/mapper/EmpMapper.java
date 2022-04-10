package com.mybatis.dynamic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.dynamic.bean.Emp;

public interface EmpMapper {
	
	
	//一，批量增加员工
	public abstract Integer addEmpsByList(List<Emp> empList);
	
	//二，批量更新员工,用@Param自定义数组名称，赋值与映射文件中的collection,不用默认的"array"了。
	public abstract Integer updateEmpsByArray(@Param("empArray") Emp[] empArray);
	
	//三，<sql>标签用法测试
	public abstract Emp selectEmpById(Integer id);
}

package com.mybatis.param.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mybatis.param.bean.Emp;


public interface EmpParamMapper {

	//1，增加单个员工
	void addEmp(Emp emp);
	
	//2，只根据一个id查询单个员工
	Emp getEmpById(Integer id);

	//3，根据多个变量查询员工
	Emp getEmpByArgs(Integer id,String ename);

	//4，根据Map集合查询单个员工信息,把查询条件封装进Map集合，返回查询结果Emp对象
	Emp getEmpByMap(Map<Object,Object> map);
	
	//5，注解@Param自定义Map集合的key名字，不用4中的声明Map集合了,@Param的value就是自定义的key名称
	Emp getEmpByAtParam(@Param("myId") Integer id, @Param("myEname")String ename);
}

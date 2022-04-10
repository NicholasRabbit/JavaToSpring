package com.mybatis.dynamic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.dynamic.bean.Emp;


public interface EmpMapper {

	//多条件查询，静态sql：  因为如果按名字查询可能会有重名的人，所以这个返回值用List
	public abstract List<Emp> getEmp(Emp emp);
	
	//多条件查询，动态sql
	public abstract List<Emp> getEmpDynamic(Emp emp);
	
	//多条件查询之<trim>的用法
	public abstract List<Emp>  getEmpDynamic02(Emp emp);
	
	//<choose>用法，根据id,ename,gender,age,did的其中一个条件查询员工，结果可能为多个，所以用List
	public abstract List<Emp> getEmpByChoose(Emp emp);
	//choose>用法，添加员工，通过<choose>进行判断转换数字为单词 
	public abstract Integer insertEmpByChoose(Emp emp);  
	
	//批量删除，数组方式
	public abstract void deleteEmpsByArray(Integer[] ids);
	
	//批量删除，集合方式,也可写返回值，表示删除成功条数，但是emp-mapper02.xml文件中对应的<delete>不用写resultType
	public abstract Integer deleteEmpsByList(List<Integer> idList);
	
	//批量删除，集合方式使用@Param注解自定义集合名字，赋值与emp-mapper02.xml中的<foreach collection="">
	public abstract Integer deleteEmpsByListParam(@Param("myIds") List<Integer> idList);
	
	
	
}

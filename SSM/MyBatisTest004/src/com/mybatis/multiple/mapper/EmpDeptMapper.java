package com.mybatis.multiple.mapper;

import java.util.List;

import com.mybatis.multiple.bean.Dept;
import com.mybatis.multiple.bean.Emp;

public interface EmpDeptMapper {
	
	//两表联查获取员工及其部门名称信息，即多（员工）对一(部门)
	public abstract List<Emp> getAllEmpAsList();
	
	//多对一分步查询，和DeptMapper.java中的结合使用
	public abstract Emp getEmpByStep(Integer id);
	
	//一对多映射，即一个部门对多个员工。两表联查的方式。注意要在实体类Dept.java中加属性List<Emp> empList,表示这个部门中的员工。
	public abstract Dept getEmpsAsListByDept(Integer did);      //注意这里返回值是Dept,因为是一对多，以Dept为主来两表联查的
	
	//一对多分布查询,用一下两个方法
	public abstract List<Emp> getEmpsByDid(Integer did);    // 获取一个部门的多个员工，放进List集合
	public abstract Dept getDeptOnlyByDid(Integer did);		//获取单个部门
}

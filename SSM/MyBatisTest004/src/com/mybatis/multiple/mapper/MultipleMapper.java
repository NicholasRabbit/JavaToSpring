package com.mybatis.multiple.mapper;

import java.util.List;

import com.mybatis.multiple.bean.Emp;

public interface MultipleMapper {
	
	//两表联查获取员工及其部门名称信息，即多（员工）对一(部门)
	public abstract List<Emp> getAllEmpAsList();
}

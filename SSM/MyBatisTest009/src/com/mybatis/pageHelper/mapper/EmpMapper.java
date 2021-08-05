package com.mybatis.pageHelper.mapper;

import java.util.List;

import com.mybatis.pageHelper.bean.Emp;

public interface EmpMapper {

	//分页测试，获取所员工
	public abstract List<Emp>  getAllEmpsByList();
	
}

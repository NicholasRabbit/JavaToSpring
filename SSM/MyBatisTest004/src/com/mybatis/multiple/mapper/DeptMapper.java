package com.mybatis.multiple.mapper;

import com.mybatis.multiple.bean.Dept;

public interface DeptMapper {

	//查询单个部门
	Dept getDeptByDid(Integer did);
}

package com.project.ssm.service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ssm.bean.Emp;
import com.project.ssm.mapper.EmpMapper;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	EmpMapper  empMapper;
	
	@Override
	public List<Emp> getAllEmpsByList() {
		List<Emp> empList=empMapper.getAllEmpsByList();
		return empList;
	}

	
	
	
}

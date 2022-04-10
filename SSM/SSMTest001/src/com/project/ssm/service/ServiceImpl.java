package com.project.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ssm.bean.Dept;
import com.project.ssm.bean.Emp;
import com.project.ssm.mapper.DeptMapper;
import com.project.ssm.mapper.EmpMapper;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	EmpMapper  empMapper;
	
	@Autowired
	DeptMapper deptMapper;
	
	@Override
	public List<Emp> getAllEmpsByList() {
		List<Emp> empList=empMapper.getAllEmpsByList();
		return empList;
	}

	@Override
	public Integer deleteEmpById(Integer id) {
		Integer count=empMapper.deleteEmpById(id);
		return count;
	}

	@Override
	public Integer addEmp(Emp emp) {
		Integer count=empMapper.addEmp(emp);
		return count;
	}

	@Override
	public Integer getMaxId() {
		return empMapper.getMaxId();
	}

	@Override
	public Emp getEmpById(Integer id) {
		Emp emp=empMapper.getEmpById(id);
		return emp;
	}

	@Override
	public Dept getDeptByDid(Integer did) {
		Dept dept=deptMapper.getDeptByDid(did);
		return dept;
	}

	@Override
	public List<Dept> getAllDeptAsList() {
		List<Dept> deptList=deptMapper.getAllDeptAsList();
		return deptList;
	}

	@Override
	public Integer updateEmp(Emp emp) {
		Integer count=empMapper.updateEmp(emp);
		return count;
	}
	
	
	

	
	
	
}

package com.project.ssm.service;

import java.util.List;


import com.project.ssm.bean.Emp;


public interface ServiceInterface {
	   
	//获取所有员工
	public abstract List<Emp>  getAllEmpsByList();
}

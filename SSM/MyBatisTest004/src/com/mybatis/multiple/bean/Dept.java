package com.mybatis.multiple.bean;

import java.util.List;

public class Dept {
	
	private Integer did;
	private String dname;
	private List<Emp> empList;
	
	

	public Dept() {
		
	}
	
	public Dept(Integer did, String dname, List<Emp> empList) {
		this.did = did;
		this.dname = dname;
		this.empList = empList;
	}

	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", empList=" + empList + "]";
	}

	
	
	
	
}

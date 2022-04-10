package com.springframe.jdbcTemplate;

public class User {
	private Integer id;        //设计到数据库的操作，数据库没有值时默认null,因此一般不用基本数据类型，用其包装类
	private String name;
	private String gender;
	private String tel;
	private String addr;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
}

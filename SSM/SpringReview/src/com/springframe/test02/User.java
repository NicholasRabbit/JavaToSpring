package com.springframe.test02;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class User {
	
	private Integer id;
	private String name;
	private List<Car> cars;
	private List<Integer> num;
	private Map<Integer,String> myMap;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	public List<Integer> getNum() {
		return num;
	}
	public void setNum(List<Integer> num) {
		this.num = num;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Map<Integer, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cars=" + cars + ", num=" + num + ", myMap=" + myMap + "]";
	}
	
	
	
	
}

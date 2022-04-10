package com.javaframe.spring002;

import java.util.List;
import java.util.Map;

import com.javaframe.spring.Teacher;

public class Student002 {
	private int num;     
	private String name;
	private List<String> myList;
	private List<Teacher> teachers;     //List集合内元素是对象
	private Map<Integer,String> maps;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	
	
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	

	public Map<Integer, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<Integer, String> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "Student002 [num=" + num + ", name=" + name + ", myList=" + myList + ", teachers=" + teachers + ", maps="
				+ maps + "]";
	}

	

	
}

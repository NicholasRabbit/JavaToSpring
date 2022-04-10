package com.springframe.mvcJson.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springframe.mvcJson.bean.User;

@Repository
public class UserDao {
	
	User u;
	List<User> myList;
	
	public void addUser() {
		myList=new ArrayList<>();
		myList.add(new User(1001,"Tom"));
	}
	
	public List<User> getMyList(){
		return this.myList;
	}
}

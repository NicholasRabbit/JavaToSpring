package com.javaframe.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoLayer {
	
	public DaoLayer() {
		System.out.println("DAOLayer execute!");
	}
}

package com.mybatis.mapper;

import com.mybatis.bean.User;

public interface UserMapper {
	public abstract User getUserById(Integer id);    //这里写String类型的形参也可以，因为浏览器接收数据的方法getParameter(..)返回值是String类型
}

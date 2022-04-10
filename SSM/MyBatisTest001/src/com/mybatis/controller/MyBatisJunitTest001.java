package com.mybatis.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.bean.User;
import com.mybatis.mapper.UserMapper;

//使用JUnit测试单元测试，不用写main方法了，注意使用JUnit时要引入 相关jar包，并在方法上加 注解@Test
public class MyBatisJunitTest001 {

	@Test
	public void test() {
			
	    	InputStream  in=null;
	    	try {
				//这里使用mybatis-config-02.xml全局配置文件
			    in=Resources.getResourceAsStream("mybatis-config-02.xml");
				SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
				SqlSession sqlSession=sqlSessionFactory.openSession();
						
				
				UserMapper  userMapper=sqlSession.getMapper(UserMapper.class);  
				System.out.println(userMapper.getClass().getName());       //输出：com.sun.proxy.$Proxy0，说明是个代理实现类
				User user=userMapper.getUserById(1);
						
				/*以下输出：User [id=1, name=null, gender=male, age=30]，
				*原因是User对象中的属性名要与对应的数据库中的列名一致，否则无法赋值
				*User属性是name,而MySql中列名是user_name,所以name-null
				* */
				System.out.println(user);      
													
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}

package com.mybatis.controller;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.bean.User;
import com.mybatis.mapper.UserMapper;

public class MyBatisTest001 {
	
	/*
	 MyBatis项目搭建步骤，共四步
	  第一步，导入相关jar包，注意使用log4j.jar需要用到log4j.xml,最后AddToBuildPath
	  第二步，配置MyBatis的全局配置文件，名称可自定义，一般后缀都带"-config",但建议一般都写作mybatis-config.xml，便于识别
	  第三步，创建映射文件，实现两个绑定：
		1，给namespace赋值，把接口UserMapper.java的全类名赋给它 ；
		2，标签<select>中的id属性值要与接口UserMapper.java中的方法名一致。
	 第四步，创建mapper接口，如本例中UserMapper.java供其绑定
	 第五步，获取操作mysql数据库的会话对象sqlSession
	 第六步，测试
	  */
	
	//如果使用JUnit测试就不必写main方法，写个普通方法即可，这里先不用
	public static void main(String[] args) {
		
		//第五步，获取sqlSession对象，操作数据库
		InputStream  in=null;
	
			try {
				//首先获取sqlSession对象，SqlSessionFactory是个接口，这里用多态
				in=Resources.getResourceAsStream("mybatis-config.xml");
				SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
				SqlSession sqlSession=sqlSessionFactory.openSession();     //这里openSession()如果是无参的，则是JDBC事务机制开启，需手动提交和回滚，如果参数为true,openSession(true),则是自动提交
				
				//进行操作
				//首先这个是使用getMapper(..)方法，通过动态代理创建了UserMapper.java接口的代理实现类
				UserMapper  userMapper=sqlSession.getMapper(UserMapper.class);  
				System.out.println(userMapper.getClass().getName());       //输出：com.sun.proxy.$Proxy0，说明是个代理实现类
				User user=userMapper.getUserById(1);

				sqlSession.commit();
				
				/*以下输出：User [id=1, name=null, gender=male, age=30]，
				 *(1)原因是User对象中的属性名要与对应的数据库中的列名一致，否则无法赋值
				 *User属性是name,而MySql中列名是user_name,所以name=null
				 *解决办法：在UserMapper.xml映射文件改spl语句，把user_name改个别名为name,与User中一致即可
				 *(2)实际开发中尽量把属性名和数据库列名写一致
				 **/
				System.out.println(user);        
											
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(in !=null) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		
	}
}

package com.mybatis.dynamic.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.dynamic.bean.Emp;
import com.mybatis.dynamic.mapper.EmpMapper;

public class DynamicSelectTest001 {
	
	@Test
	public void testDynamic() {
		
		InputStream in=null;
		try {
			in=Resources.getResourceAsStream("dynamic-select-config.xml");
			SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			
			EmpMapper  empMapper=sqlSession.getMapper(EmpMapper.class);
			
			/*//一，多条件查询，普通静态写法，把条件都写上，一旦有一个不对或为空就查不出来。
			Emp emp=new Emp(1,"Jack","male",30,11);*/
			
			//Emp emp=new Emp(null,"Mike","male",null,22);    //这里id=null,映射文件<if>语句有缺陷
			Emp emp=new Emp(2,"Mike","male",null,22);
			
			List<Emp> empRetValue=empMapper.getEmp(emp);     //因为如果按名字查询可能会有重名的人，所以这个返回值用List
			/*SQL语句中，Emp对象属性名对应select查询结果，如果sql里没查did,则emp对象中did=null。
			不要写sout(emp)，这样输出的是emp对象，无法验证是否查询到结果 。要写保存查询结果empRetValue*/
			System.out.println("empRetValue==>"+empRetValue);         
			
			//二，多条件动态查询，动态sql用法，以及弥补第一条(2)中的缺陷，即<where><if>用法
			Emp emp02=new Emp(null,"Jane","",40,null);        //注意，String类型的数据除了为null之外，还有是空“”情况。
			List<Emp> empRetValue02=empMapper.getEmpDynamic(emp02);
			System.out.println("empRetValue02==>"+empRetValue02);
			
			
			//三，多条件动态查询，<trim>用法
			Emp emp03=new Emp(4,null,"male",20,22);
			List<Emp> empRetValue03=empMapper.getEmpDynamic02(emp03);
			System.out.println("empRetValue03==>"+empRetValue03);
			
			//测试emp-mapper02.xml
			Emp emp04=empMapper.getEmpById(1);
			System.out.println(emp04);
			
			
		}catch(IOException e) {
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
	
	@Test
	public void testDynamic02() {
		
		
	}
	
	
}

package com.mybatis.dynamic;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dynamic.bean.Emp;
import com.mybatis.dynamic.mapper.EmpMapper;

public class DynamicMultipleTest {
	
	public static void main(String[] args) {
		
		InputStream in=null;
		try {
		
			in=Resources.getResourceAsStream("multiple-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession(true);
			EmpMapper  mapper=sqlSession.getMapper(EmpMapper.class);
			
			//一，批量增加用户，注意映射配置文件中小括号的位置不要写错
			List<Emp> empList=new ArrayList<>();
			Emp emp6,emp7,emp8;
			emp6=new Emp(6,"Ben","male",40);
			emp7=new Emp(7,"Luna","female",30);
			emp8=new Emp(8,"Hanks","male",60);
			empList.add(emp6);
			empList.add(emp7);
			empList.add(emp8);
			Integer addCount=mapper.addEmpsByList(empList);
			System.out.println("The number of rows which have been add is==>"+addCount);
			
			/*二，批量更新用户，
			     因为这里是循环多个sql语句，所以要在配置文件jdbc.properties中url行加../ssm?allowMultiQueries=true,否则报sql语法错误*/
			emp6.setDid(11);emp6.setEname("BenAfleck");
			emp7.setDid(22);emp7.setEname("Melena");
			emp8.setDid(33);emp8.setEname("Marcus");
			Emp[] empArray=new Emp[] {emp6,emp7,emp8};
			Integer updateCount=mapper.updateEmpsByArray(empArray);
			System.out.println("updateCount==>"+updateCount);    //输出：1，因为每个update语句单独执行一次
			
			//三，<sql>标签用法测试
			Emp empSql=mapper.selectEmpById(2);
			System.out.println("empSql==>"+empSql);
			
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

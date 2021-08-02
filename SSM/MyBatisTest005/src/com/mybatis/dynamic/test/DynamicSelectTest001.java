package com.mybatis.dynamic.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
	
	//测试<choose><foreach>标签
	@Test
	public void testDynamic02() {
		
		InputStream  in=null; 
		try {
			in=Resources.getResourceAsStream("dynamic-select-config.xml");
			SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();      //事务机制开启，要手动提交
			EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
			
			//四，1，测试<choose>，根据id,ename,gender,age,did的其中一个条件查询员工
			Emp emp04=new Emp();
			emp04.setId(1);           //这三个条件在mapper.xml映射文件中只会有一个执行，类似if..else if..else
			emp04.setEname("Mike");
			emp04.setDid(22);
			List<Emp>  empList04=empMapper.getEmpByChoose(emp04);
			System.out.println("empList==>"+empList04);
			
			//四，2，测试<choose>，判断数字，使用<when>转换为单词进行添加
			Emp emp05=new Emp();
			emp05.setId(6);
			emp05.setEname("Catalina");
			emp05.setGender("1");        //这里输入数字型字符串，为了测试<choose>的判断输入功能
			emp05.setAge(40);
			empMapper.insertEmpByChoose(emp05);
			sqlSession.commit();  //JDBC事务机制开启，要手动提交    
			
			/*五，批量删除，
			 *第一种方式： 如果id为Stirng类型(这里个人声明的是Integer类型，所以不合适)，可声明 String ids="1,2,3",然后放到deleteManyEmps(String ids)中，xxxMapper.xml文件中用${value/_parameter}接收可批量删除。
			 *不能用#{ids}，因为#{}的方式只能删除一个。结合JDBCTemplate章节代码理解。
			  第二种方式，传数组，在xxxMapper.xml文件中用<foreach>标签 。*/
			Integer[] ids= {1,2,3};
			empMapper.deleteEmpsByArray(ids);      //这里报错Duplicate是因为四，2中重复添加6
			sqlSession.commit();
			
			//第三种方式，传集合，批量删除            //先在mysql中手动添加
			List<Integer> idList=new ArrayList<>();   //注意集合内元素是Integer，存的是id,不是Emp对象
			idList.add(7);
			idList.add(8);
			idList.add(9);
			empMapper.deleteEmpsByList(idList);
			sqlSession.commit();
			
			//第三种方式加@Param注解，自定义集合的名称
			List<Integer> idList02=new ArrayList<Integer>();
			idList02.add(4);
			idList02.add(5);
			Integer count=empMapper.deleteEmpsByListParam(idList02);
			sqlSession.commit();
			System.out.println("rows have been deleted==>"+count);
			
			
			
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

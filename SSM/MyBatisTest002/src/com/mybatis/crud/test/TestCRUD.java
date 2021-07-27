package com.mybatis.crud.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;   
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.crud.bean.Emp;
import com.mybatis.crud.mapper.EmpMapper;

/*
MyBatis项目搭建步骤，共四步
 第一步，导入相关jar包，注意使用log4j.jar需要用到log4j.xml
 第二步，配置MyBatis的全局配置文件，名称可自定义，一般后缀都带"-config",但建议一般都写作mybatis-config.xml，便于识别
 第三步，创建映射文件，实现两个绑定：
	1，给namespace赋值，把接口UserMapper.java的全类名赋给它 ；
	2，标签<select>中的id属性值要与接口UserMapper.java中的方法名一致。
第四步，创建mapper接口，如本例中UserMapper.java供其绑定
第五步，获取操作mysql数据库的会话对象sqlSession
第六步，测试
 */

//注意Emp内属性要和数据库列名 一  一 对应
public class TestCRUD {
	
	public static void main(String[] args) {
		
		InputStream in=null;
		try {
			
			in=Resources.getResourceAsStream("mybatis-crud-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();       
			//SqlSession sqlSession=sqlSessionFactory.openSession(true);    //这里openSession(true)参数为true的话，则开启自动提交，下面的手动提交sqlSession.commit()就不用写了
			
			EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);   //底层是通过动态代理生成了EmpMapper接口的一个代理类
			System.out.println("empMapper==>"+empMapper);  //输出：empMapper==>org.apache.ibatis.binding.MapperProxy@6f7fd0e6
			
			//实际在底层，MyBatis把方法内实参解析转化成了sql语句，把查询结果又封装进了Emp对象里
			//查询单个员工信息:select
			Emp emp=empMapper.getEmpById(2);
			System.out.println("emp==>"+emp);
			
			//查询全部员工信息:select
		    List<Emp> empList=empMapper.getAllEmps();
		    for(int i=0; i<empList.size();i++) {
		    	Emp e=empList.get(i);
		    	System.out.println("empList==>"+e);
		    }
		    
		    /*增加员工信息，add,
		     *(1) 这里id可以为null,因为MySql数据库该列设置了自动递增
		     *(2)因为全局配置文件中<transactionManager type="JDBC">， 使用的是JDBC最原始的事务机制，即手动提交和回滚，因此这里添加后还需要手动提交才可，否则无法添加进去
		     */
		   Emp tom=new Emp(null,"Tom","male",30,44);
		   empMapper.addEmp(tom);    
		   //sqlSession.commit();      //手动提交 
		    
		    //删除员工信息delete
		    Integer i=empMapper.deleteEmp(4);
		    System.out.println("删除条数i==>"+i);
		    //sqlSession.commit(); 
		    
		    //更新员工信息update
		    Emp emp01=new Emp(1, "Catherine", "female", 30, 22);
		    empMapper.updateEmp(emp01);
		    sqlSession.commit();        //这里只写一个commit()方法就行了，前边那俩不用写也可以    
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
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

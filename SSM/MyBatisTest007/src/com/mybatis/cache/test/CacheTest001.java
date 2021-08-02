package com.mybatis.cache.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.cache.bean.Emp;
import com.mybatis.cache.mapper.EmpMapper;

//测试MyBatis一级缓存
public class CacheTest001 {
	
	public static void main (String[] args) {
		
		//缓存机制一般多用与查询操作中
		/*一，测试MyBatis一级缓存
		 * (1)一级缓存是SqlSession级别的，即通过同一个SqlSession对象获取的EmpMapper.java对象，查询同一个条件时，不会在重复生成sql 语句。
		 * 例如下面都通过id=3来获取，控制台不会重复输出sql语句；
		 * (2)一级缓存失效的四种情况,有四个
		 *    [1]获取不同的SqlSession对象，则对应不同的缓存，sqlSession2就不能用sqlSession1缓存中的数据；
		 *    [2]两次查询之间有增，删，改的操作，则缓存失效；
		 *    [3]sqlSession.commit()执行提交操作，缓存失效；
		 *    [4]sqlSession.cleatCache()执行清楚缓存操作，缓存失效，注意此方法只能清除一级缓存。
		 * */
		
		SqlSession sqlSession01=SqlSessionUtil.getSqlSession();
		
		EmpMapper mapper01=sqlSession01.getMapper(EmpMapper.class);
		Emp emp1=mapper01.getEmpById(3);
		System.out.println("emp1==>"+emp1);
		
		/*Integer[] ids= {6,7,8};
		Integer count=mapper01.deleteEmpById(ids);
		sqlSession01.commit();  */      //两次查询之间有删除操作，缓存失效，即使这里不手动提交也失效。
		
		//sqlSession01.commit();           //执行提交，缓存失效
		//sqlSession01.clearCache();       //清空缓存，缓存失效，此方法只能清除一级缓存。
		
		Emp emp2=mapper01.getEmpById(3);
		System.out.println("emp2==>"+emp2);
		
		System.out.println("两个sqlSession=====================");
		SqlSession sqlSession02=SqlSessionUtil.getSqlSession();
		EmpMapper mapper02=sqlSession02.getMapper(EmpMapper.class);
		Emp emp03=mapper02.getEmpById(3);
		System.out.println("emp03==>"+emp03);
			
	}
	
	
}

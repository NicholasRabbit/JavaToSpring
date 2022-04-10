package com.mybatis.cache.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.cache.bean.Emp;
import com.mybatis.cache.mapper.EmpMapper;

/*MyBatis使用第三方的二级缓存机制,配置步骤
 *1，导入四个jar包：ehcache-core.jar/mybatis-ehcache.jar/slf4j-api.jar/slf4j-log4j.jar
 *2,配置conf/ehcache.xml文件
 *3，使用二级缓存时bean对象Emp.java一定要实现Serializable接口
 *4，跟使用MyBatis本身的二级缓存一样，全局配置文件xxx-config.xml中设置：<setting name="cacheEnabled"  value="true">
 *注意事项：
 *1，SqlSession提交或关闭之后，二级缓存才有效
 *2，POJO即java普通bean对象一定要实现Serializable接口！！
 *3，sqlSession.clearCache()只能用来清除一级缓存。
 */
public class CacheTest003 {
	
	public static void main(String[] args) {
		
		InputStream in=null;
		try {
			
			in=Resources.getResourceAsStream("mybatis-cache-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
			Emp emp01=mapper.getEmpById(1);
			sqlSession.commit();                    //SqlSession提交或关闭之后，二级缓存才有效
			System.out.println("emp01==>"+emp01);
			
			//Integer count=mapper.deleteEmpById(8);  //两次查询之间有删除操作，缓存失效，不管这次查询提交与否。
			
			Emp emp02=mapper.getEmpById(1);         //重复查询时控制台输出：Cache Hit Ratio [com.mybatis.cache.mapper.EmpMapper]: 0.5。说明使用了二级缓存。
			sqlSession.commit();
			System.out.println("emp02==>"+emp02);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

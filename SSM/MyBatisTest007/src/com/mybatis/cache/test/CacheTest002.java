package com.mybatis.cache.test;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.cache.bean.Emp;
import com.mybatis.cache.mapper.EmpMapper;

/*测试二级缓存，MyBatis自带的。
 *注意事项:
 *(1)二级缓存默认不开启，需手动开启;
 *(2)只有一级缓存提交或关闭后，二级缓存才会启用;
 *(3)二级缓存是映射文件层面的，即二级缓存只在当前EmpMapper.xml的范围内有效。
 *配置步骤:
 *(1)MyBatis提供二级缓存接口及其实现类，要求POJO,即普通java对象，如本例中Emp.java实现Serializable接口,为了向硬盘存数据必须如此。
 *(2)需在MyBatis全局配置文件中<settings>配置<setting name="cacheEnabled" value="true"/>
 *(3)映射文件中配置<cache/>
 * */
public class CacheTest002 {
	
	public static void main(String[] args) {
		SqlSession  sqlSession=SqlSessionUtil.getSqlSession();
		EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
		
		Emp emp01=mapper.getEmpById(2);
		sqlSession.commit();                   //sqlSession必须提交或关闭才会开启二级缓存
		System.out.println("emp01==>"+emp01);
		Emp emp02=mapper.getEmpById(2);
		sqlSession.commit();
		System.out.println("emp02==>"+emp02);
		
	}
}

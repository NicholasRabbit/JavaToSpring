package com.mybatis.pageHelper.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.pageHelper.bean.Emp;
import com.mybatis.pageHelper.mapper.EmpMapper;

/*PageHelper的用处，数据库中查询结果太多时，可把查询结果在后台分页，然后根据客户请求看第几页，在网页端进行分页展示。
 * 使用PageHelper步骤
 *1，导入相关的jar包，有两个，jsqlparser-0.9.5.jar，pagehelper-5.0.0.jar
 *2，在全局配置文件mybatis-pagehepler-config.xml中配置<plugins>标签，引入PageInterceptor类。*/
public class PageHelperTest001 {
	
	@Test
	public void pageHelperTest001() {
		
		InputStream  in=null;
		try {
			
			in=Resources.getResourceAsStream("mybatis-pagehepler-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
			
			//(1)使用PageHelper进行分页，注意一定要在EmpMapper.java对象调用方法之前。
			PageHelper.startPage(1, 2);   //startPage(int pageNum, int pageSize)：第一个参数表示要展示的页码，第二个是设定每页的条数
			
			List<Emp>  empList=mapper.getAllEmpsByList();     //上面设置好之后，每次向集合就存两条，有多个集合，每页就是一个集合对象。
			System.out.println("empList长度==>"+empList.size());  //empList长度==>2
			
 			for(Emp emp : empList) {
 				System.out.println(emp);     //这里集合对象里就只存了两个第1页的2个查询结果，sout可看作在模拟页面展示。
 			}
			
		} catch (IOException e) {
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
	
	
	/*(2)PageHelper和PageInfo配合使用，PageInfo.java的用法
	 * */
	@Test
	public void pageHelperTest002() {
		
		InputStream  in=null;
		try {
			
			in=Resources.getResourceAsStream("mybatis-pagehepler-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
			PageHelper.startPage(4, 2);   
			
			List<Emp>  empList02=mapper.getAllEmpsByList();   
			
			/*PageInfo.java的用法，
			 * 这里使用PageInfo的有参构造public PageInfo(List<T> list, int navigatePages)
			 * navigatePages指在上面startPage(4,2)设定显示第4页，每页2条的基础上，改为每页展示4条，即前后各加1条表示过渡，方便用户阅读。*/
			PageInfo<Emp>  pageInfo=new PageInfo<Emp>(empList02,4);  
			System.out.println("navigatepageNums==>"+Arrays.toString(pageInfo.getNavigatepageNums()));
			
 			for(Emp emp : empList02) {
 				System.out.println(emp);     
 			}
			
		} catch (IOException e) {
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

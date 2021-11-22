package com.mybatis.pageHelper.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.pageHelper.bean.Emp;
import com.mybatis.pageHelper.mapper.EmpMapper;
import com.mybatis.pageHelper.util.PageUtil;


//1,自定义PageUtil的用法，PageUtil.java是一个工具类，PageInfo对象可调用其内的方法打印页码显示
public class PageHelperTest002 {

	public static void main(String[] args) {
		testPageHelper();
	}
	
	public static void testPageHelper() {
		
		InputStream  in=null;
		try {
			
			in=Resources.getResourceAsStream("mybatis-pagehepler-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
			PageHelper.startPage(4, 2);     //当前页是第4页，每页显示2行
			
			List<Emp>  empList02=mapper.getAllEmpsByList();   
			
			PageInfo<Emp>  pageInfo=new PageInfo<Emp>(empList02,4);   //参数4对应navigatePages,即在网页可视范围内，底部页码条总共有多少页码，例，从1-10，或2-11
			System.out.println(pageInfo.getPageNum());
			String buffer=PageUtil.getPageInfo(pageInfo, null);
			System.out.println("buffer页数拼接==>"+buffer);
 			
			
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

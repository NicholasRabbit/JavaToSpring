package com.mybatis.multiple.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.multiple.bean.Emp;
import com.mybatis.multiple.mapper.MultipleMapper;



/*多对一映射，多对一分步查询范例
 * */
public class MultipleToOneTest {
		
	public static void main(String[] args) {
		
		//1，多对一映射
		InputStream in=null;
		try {
			in=Resources.getResourceAsStream("multiple-select-config.xml");
			SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();      //下面需手动提交，查询select不用
			MultipleMapper  mapper=sqlSession.getMapper(MultipleMapper.class);
			List<Emp>  empList=mapper.getAllEmpAsList();
			Iterator<Emp> it=empList.iterator();
			while(true) {
				if(!it.hasNext()) {
					break;
				}
				Emp emp=it.next();
				System.out.println(emp);
			}
		}catch(FileNotFoundException e) {
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

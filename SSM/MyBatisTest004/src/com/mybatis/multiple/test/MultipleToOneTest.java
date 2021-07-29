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

import com.mybatis.multiple.bean.Dept;
import com.mybatis.multiple.bean.Emp;
import com.mybatis.multiple.mapper.DeptMapper;
import com.mybatis.multiple.mapper.EmpDeptMapper;



/*多对一映射，多对一分步查询范例
 * */
public class MultipleToOneTest {
		
	public static void main(String[] args) {
		
	
		InputStream in=null;
		try {
			in=Resources.getResourceAsStream("multiple-select-config.xml");
			SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=sqlSessionFactory.openSession();      //下面需手动提交，查询select不用
			EmpDeptMapper  empDeptMapper=sqlSession.getMapper(EmpDeptMapper.class);
			
			//一，多对一映射，即两表联查
			List<Emp>  empList=empDeptMapper.getAllEmpAsList();
			Iterator<Emp> it=empList.iterator();
			while(true) {
				if(!it.hasNext()) {
					break;
				}
				Emp emp=it.next();
				System.out.println(emp);
			}
			
			System.out.println("分步查询测试=================================");
			//二，分步查询，即两个表分别查询，然后MyBatis把结果结合起来
			Emp emp2=empDeptMapper.getEmpByStep(2);
			System.out.println(emp2);
	
			System.out.println("以下延迟加载测试=================================");
			/*三，延迟加载，只在分步查询时有效，见multiple-select-config.xml中设置。
			延迟加载体现在分步查询中，如果只查询emp表内的信息，不查dept表，则dept的查询语句不会执行，结合控制台的log4j打印的DEBUG理解
			*/
			Emp emp3=empDeptMapper.getEmpByStep(3);
			String ename=emp3.getEname();
			System.out.println("emp3's ename==>"+ename);
			//当要获取部门时就会执行下一步查询
			Dept dept3=emp3.getDept();
			System.out.println("dept3==>"+dept3);
			
			
			// 四，一对多映射，两表联查的方式，以Dept对象为主，在Dept.java中加属性List<Emp> empList表示一个部门中的所有员工。sql查询也是以dept表为主表。
			Dept dept4=empDeptMapper.getEmpsAsListByDept(22);
			System.out.println("dept4==>"+dept4);
			
			System.out.println("以下一对多分步测试=================================");
			//五，一对多分步查询，首先查表dept,查出dept的did再给emp表查在这个部门的员工
			Dept dept5=empDeptMapper.getDeptOnlyByDid(11);
			//System.out.println("dept5==>"+dept5);     //输出结果中dept=null是因为没有给Emp对象中的dept赋值
			System.out.println("dept5==>"+dept5.getDname());     //测试fetchType,单独设置延迟加载
			
			
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

package com.mybatis.crud.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.crud.bean.Emp;
import com.mybatis.crud.mapper.EmpSelectMapper;

//MyBatis的三种查询方式范例
//这里使用JUnit,不用main方法了
public class SelectTest {

	@Test  //使用JUnit这里要加@Test注解
	public void test() {
		
		InputStream in=null;
		try {
			in=Resources.getResourceAsStream("mybatis-crud-config.xml");
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession=factory.openSession(true);
			EmpSelectMapper  empSelectMapper=sqlSession.getMapper(EmpSelectMapper.class);
			
			//一，查询单个员工
			Emp emp=empSelectMapper.getEmpById(3);
			System.out.println(emp);
			
			//二，查询员工总数
			Integer count=empSelectMapper.getEmpCount();
			System.out.println("员工总数："+count);
			
			/*三，1，获取单个员工封装进Map集合
			 * (1)以Map集合获取单个员工的信息,员工对象中每个属性就是一个key,对应属性值是value
			 * (2)注意：错误写法不要把Map<Integer,Emp>,会报ClassCastException异常，原因 getEmpMap(Integer id)中的形参Integer id当作Map的key,
			 * 因为MyBatis底层把单个Emp对象的属性"id","name"等当作了key,属性值是value,而不是整个Emp emp对象
			 * (3)Map<String,String>也是错误,这样迭代器输出只输出String类型的，因为Emp属性中有Integer类型的，key就是Integer类型的， 所以只能写成Map<Object,Object>
			 * (4)直接sout(Map)也行，它重写了toString(),不建议，没意义
			 * */
			//Map<Integer,Emp> empMap=empSelectMapper.getEmpMap(2);    //错误
			Map<Object,Object> empMap=empSelectMapper.getEmpMap(2);
			Set<Map.Entry<Object, Object>>  entrySet=empMap.entrySet();
			Iterator<Map.Entry<Object, Object>> it=entrySet.iterator();
			while(it.hasNext()) {
				Map.Entry<Object, Object> entry=it.next();
				Object key=entry.getKey();
				Object value=entry.getValue();   
				System.out.println(key+"="+value);
			}
			
			/*三，2，获取全部员工封装进Map集合
			 * 这里与1中不同，key和value的类型都是固定的，即key和Emp对象的id类型一致， value就是Emp对象
			 * */
			Map<Integer,Emp> emps=empSelectMapper.getAllEmps();
			Set<Integer> keySet=emps.keySet();
			System.out.println(keySet);
			Set<Map.Entry<Integer, Emp>>  entrySet02=emps.entrySet();
			Iterator<Map.Entry<Integer, Emp>> it02=entrySet02.iterator();
			while(it02.hasNext()) {
				Map.Entry<Integer, Emp>  entry02=it02.next();
				Integer key=entry02.getKey();
				Emp value=entry02.getValue();
				System.out.println(key+"="+value);
			}
		}catch(IOException e){
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
}



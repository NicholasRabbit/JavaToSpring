package com.springframe.jdbcTemplate;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.alibaba.druid.pool.DruidDataSource;

/*本范例使用Junit测试，Junit是一个测试单元框架，可以方法为单位进行测试，不用写main方法，极大地方便了程序员进行测试
 *建议使用junit4，不要用最新的版本
 * */
public class SpringJdbc_Junit_Test {

	@Test      //要加上@Test注解，不用再写main方法也可以执行了
	public void testQuery() {
		ApplicationContext app=new ClassPathXmlApplicationContext("jdbcTemplate.xml");
		DruidDataSource data=app.getBean("data",DruidDataSource.class);
		String jdbc_driver=data.getDriverClassName();
		System.out.println(jdbc_driver);
		
		//获取JdbcTemplate对象，进行操作
		JdbcTemplate jtp=app.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jtp);
		
		/*一，query(String sql,RowMapper rowMapper)方法范例
		 *(1)调用JdbcTemplate中的query(String sql,RowMapper rowMapper)方法，返回值是List
		 *(2)查询到的结果被封装到User对象里，然后存到RowMapper类型的对象里面，row是行，即把一行为单位存到User对象里，注意User对象的属性名要和mysql数据库中表格的列名对应，名称一致，否则无法封装
		 *    例如本例中User和MySQL中t_user的列明是一 一对应的
		 * */
		String sql="select id,name,gender,tel,addr from t_user";
		RowMapper<User>  rowMapper=new BeanPropertyRowMapper<User>(User.class);
		List<User> myList=jtp.query(sql,rowMapper);    //返回值是List集合，可以用迭代器取出来 ，注意迭代器要加泛型
		Iterator<User> it=myList.iterator();
		while(it.hasNext()) {
			User u=it.next();
			Integer id=u.getId();
			String name=u.getName();
			String gender=u.getGender();
			String tel=u.getTel();
			String addr=u.getAddr();
			System.out.println(id+"|"+name+"|"+gender+"|"+tel+"|"+addr);
		}
		
	}

}

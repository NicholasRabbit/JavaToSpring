package com.springframe.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.alibaba.druid.pool.DruidDataSource;

//JdbcTemplate类常用方法范例，它就是Spring封装的一个DBUtil.java，实际功能更复杂
public class SpringJdbcTest001 {
	
	public static void main(String[] args) {
		testQueryAndUpdate();    //不要把所有方法都写到main方法里
	}

	public static void testQueryAndUpdate() {
		ApplicationContext app=new ClassPathXmlApplicationContext("jdbcTemplate.xml");
		DruidDataSource data=app.getBean("data",DruidDataSource.class);
		String jdbc_driver=data.getDriverClassName();
		System.out.println(jdbc_driver);
		
		//获取JdbcTemplate对象，进行操作
		JdbcTemplate jtp=app.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jtp);
		
		/*一，查询数据，query(String sql,RowMapper rowMapper)方法范例
		 *(1)调用JdbcTemplate中的query(String sql,RowMapper rowMapper)方法，返回值是List
		 *(2)查询到的结果被封装到User对象里，然后存到RowMapper类型的对象里面，row是行，即把一行为单位存到User对象里，注意User对象的属性名要和mysql数据库中表格的列名对应，名称一致，否则无法封装
		 *    例如本例中User和MySQL中t_user的列名（或别名）是一 一对应的
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
			System.out.println(id+","+name+","+gender+","+tel+","+addr);
		}
		
		/*二，增删改都用update(..)方法，用到方法重载，先演示单条增删改
		 *1， 修改数据
		 *	(1)update(String  sql),可写单个sql语句进行修改，跟JDBC的Statement作用一样
		 *  (2)update(String sql,Obeject ...args)   此方法和PreparedStatement用法一样，这里是使用可变长度参数的形式
		 * */
		String sql02="update t_user set name='Landar' where id=4";
		int count=jtp.update(sql02);   //返回值是修改的条数
		System.out.println("count==>"+count);
		String sql03=" insert into t_user (id,name) values (?,?);";    //注意通配符问号？不要加引号，mysql会自动转换，即使是字符串也不用加，没必要，还报错
		int count03=jtp.update(sql03,6,"Leon");      				   //这里int类型6自动打包了，相当于 new Integer(6)。   
		System.out.println("count02==>"+count03);
		
		/*三，重点：批量增删改要注意的问题，后期记得再JDBC代码里验证
		 * (1)批量增删改是不可用通配符“？”和PreparedStatement  setString(int index,String column)连用，报错
		 * (2)模糊查询也不可用通配符“？”
		 * */
		
		/*批量增加数据方法batchUpdate(String sql, List<Object[]> args),注意第二个形参的使用，这个方法把List集合分解了，然后把数据增加的数据库中
		*/  
		List<Object[]>  lists=new ArrayList<>();
		lists.add(new Object[] {7,"Flitz"});         //Object[]  objs=new Object[]{...}第三种创建一维数组的方式，这里必须使用Object[] 数组的形式，因为数组内元素类型多样，若用User[]则不适合
		lists.add(new Object[] {8,"Adolf"});
		lists.add(new Object[] {9,"Roman"});
		String sql04="insert into t_user(id,name) values (?,?)";
		jtp.batchUpdate(sql03, lists);               
		
		/*StringBuffer sb=new StringBuffer();
		String 
		String sql05="delete from t_user where name in (？)";   
		jtp.update(sql05);*/
		
		/*四，(1)queryForObject(String sql,Class<T> requiredType),根据指定类型来查取结果，结果必须是单条(单行)的，前提是已知要查询的类型，属于单条查询，sql是静态的固定的，底层执行的的Statement语句
		 * */
		//String sql06="select id from t_user";     //这个sql语句不对，这个查询结果是多条int类型，不是单条
		String sql06="select count(id) from t_user";
		Integer count06=jtp.queryForObject(sql06, Integer.class);
		System.out.println("count06==>"+count06);
		
		//(2)queryForObject(String sql,Object[] args, RowMapper rowMapper),也是查询单条结果并封装到RowMapper里，执行的sql语句所得到的结果必须是单行的，否则报错，底层是执行的PreparedStatement语句
		String sql07="select id,name,gender,tel,addr from t_user where id=?";
		Object[] objs07= {3};      //查询id=3的单行的数据
		RowMapper<User> rowMapper07=new BeanPropertyRowMapper<>(User.class);    //后面的泛型可不写，钻石型写法，默认是User类
		User u07=jtp.queryForObject(sql07,objs07,rowMapper07);                  //返回值是单个的类
		System.out.println("u07==>"+u07);
		
		//(3)queryForObject(String sql, Object[] args, Class<T> requiredType) ,底层执行的是PreparedStatement语句
		String sql08="select name from t_user where id=?";
		String name08=jtp.queryForObject(sql08, new Object[] {8}, String.class);
		System.out.println("name08==>"+name08);
		
		
		
	}
}





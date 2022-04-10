package com.javaframe.info_properties;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;


/*Spring框架导入外部配置文件范例，本例演示导入info.properties配置文件，获取数据库链接相关配置
 *原有的方式是把数据库等链接信息写到xml配置文件里面，但是这种写法不灵活，修改不方便，建议把数据库相关链接信息写到类似info.properties文件里，通过导入读取 
 * */
public class InfoPropertiesTest001 {
	
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("infoTest.xml");
		DruidDataSource  data=app.getBean("data",DruidDataSource.class);
		System.out.println("data==>"+data);
		
		try {
			DruidPooledConnection dpc = data.getConnection(); //这里获取的是一个链接
			System.out.println(dpc);
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		
		DruidDataSource  data02=app.getBean("data02",DruidDataSource.class);
		System.out.println("data02==>"+data02);
		System.out.println(data02.getConnection());
		
	}
}

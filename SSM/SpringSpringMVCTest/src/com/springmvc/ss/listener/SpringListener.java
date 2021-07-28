package com.springmvc.ss.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.ss.bean.Student;

/*个人自定义的监听器，实现ServletContextListener接口
配置监听器的目的是，不用写main方法来调用Spring框架配置文件，不可能将来项目实施了，让客户手动运行main方法
因此直接在web.xml配置好监听器，在这里初始化方法contextInitialized(..)导入spring.xml文件就行，框架自带的监听器也是此原理。
*/
public class SpringListener implements ServletContextListener {

	
	
	public SpringListener() {
	
	}

	//监听器的初始化方法，用来加载Spring框架的配置文件
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listener init execute!");
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");    //Spring框架导入配置文件
		
		//以Student举例演示，见spring.xml笔记
		Student stu=app.getBean("stu", Student.class);
		ServletContext  context=sce.getServletContext();     //获取ServletContext对象，然后把Student对象放进去，可在SpringMVC的控制层ControllerLayer.java中获取
		context.setAttribute("stu",stu);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
}

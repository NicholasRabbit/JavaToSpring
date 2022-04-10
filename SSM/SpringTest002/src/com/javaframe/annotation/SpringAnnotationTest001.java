package com.javaframe.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaframe.annotation.controller.ControllerLayer;
import com.javaframe.annotation.dao.DaoLayer;
public class SpringAnnotationTest001 {
	
/*使用注解要导入spring的aop的jar包，否则报异常：ClassNotFoundException: org.springframework.aop.TargetSource
 * 一般情况下，ClassNotFound异常后跟org.spring...就是缺少Spring框架的jar包
 * */
/*spring组件，就是bean对象
 * Spring内置的常用几种注解
 * (1)@Component: 普通组件
 * (2)@Repository: 持久化层组件
 * (3)@Service：业务逻辑层组件
 * (4)@Controller：表述层控制组件
 * 其实这四个注解在Spring内部看来没有区别，都是要实例化对象，后面三个可以用头一个普通组件替换，之所以名字不同，是为了方便程序员区分不同的层别
 * */
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("annotation.xml");  //注解方式默认是单例模式，因此下面不获取对象，Spring框架底层也会初始化，并创建注解所在对象 
		ControllerLayer cl=app.getBean(ControllerLayer.class);
		DaoLayer  dl=app.getBean(DaoLayer.class);        //如果xml文件中base-package限定为annotation.controller，则这里出异常
	}
}

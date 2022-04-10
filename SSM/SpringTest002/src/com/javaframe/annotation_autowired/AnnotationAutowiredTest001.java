package com.javaframe.annotation_autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaframe.annotation_autowired.controller.Controller_B;
import com.javaframe.annotation_autowired.service.ServiceInterface;

/*@Autowired，@Qualifier用法范例
 *一，@Autowired首先按照byType的方式进行扫描找到对应的类自动赋值，如果一个类存在多个对象则自动转为byName的方式赋值，找到id与属性名一致的对象进行赋值，也可用@Qualifier指定id为属性赋值
 *二，@Qualifier注解必须和@Autowired连用，表示手动指定特定id的bean对象为该引用赋值，（注意不是定义对象的id，而是根据id找已存在的对象进行赋值！！）
 *       例：@Qualifier("stu01"),找到id=“stu01”的对象赋值，因为该注解内有且仅有一个属性名字为value时,java有关注解规定可以不用写value="stu01"
 *三，自定义对象id可使用注解内部属性赋值，例：@Component("stu01")
 *四，@Autowired(required="false/true")，
 *    当值为true时，找不到自动赋值对象，报错：则报错：Could not instantiate bean class Exception
 *required="false"时表示@Autowired所在的属性Car car上，即使Car.java这个类上没有这四个注解@Component,@Controller,@Repository,@Service，也不报错
   * 不写required时，默认值为true
 *五，对第一条的补充，结合Controller_B.java中代码理解
  (1)使用 @Autowired注解时，首先按照byType的方式进行扫描，即按照类来自动赋值，一个类有多个对象时，再按byName的方式自动赋值 
  (2)因此声明变量时，变量名可不用类名首字母小写的形式，但是建议用，因为可能按byName的方式扫描
  (3)用接口声明变量也行，用实现类也可以
  */
public class AnnotationAutowiredTest001 {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("annotation_autowired.xml");
		/*ServiceInterface  service=app.getBean("service_B",ServiceInterface.class);
		service.add();*/
		
		Controller_B  con=app.getBean("controller_B",Controller_B.class);
		con.add();
		
	}
}


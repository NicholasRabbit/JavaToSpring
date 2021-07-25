package com.javaframe.beanlife;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*bean对象生命周期：
 * 第一步：实例化对象
 * 第二步：依赖注入，就是给属性赋值
 * 第三步：初始化
 * 第四步，获取对象，并使用
 * 第五步：销毁
 * */

public class BeanLifeTest001 {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("beanlife.xml");  //ApplicationContext接口内没有close()方法，因此这里改为其实现类
		
		User u01=app.getBean("u01",User.class);
		System.out.println("u01==>"+u01);
		
		app.close();  //调用close()方法后才会执行销毁方法
	}
}

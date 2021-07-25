package com.javaframe.beanprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*bean对象生命周期：
 * 第一步：实例化对象
 * 第二步：依赖注入，就是给属性赋值
 * 第三步：postProcessBeforeInitialization(..)执行
 * 第四步：初始化
 * 第五步：postProcessorAfterIninialization(..)执行
 * 第六步，获取对象，并使用
 * 第七步：销毁
 *
 * 本代码测试在这五步之间加入后处理步骤
 * */

public class BeanLifeTest002 {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("beanlife02.xml");  //ApplicationContext接口内没有close()方法，因此这里改为其实现类
		
		User02 u02=app.getBean("u02",User02.class);
		System.out.println("u02==>"+u02);
		
		app.close();  //调用close()方法后才会执行销毁方法
	}
}

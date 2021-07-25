package com.javaframe.beanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//注意这个程序是和主测试程序结合使用的，不可独立存在，因为后处理目的就是为了给主程序增加步骤，相当于一个分支

/*bean对象的生命周期除了基本的五个步骤外，也可以手动添加后处理方法，即增加步骤，做一些其它的操作，例如用if语句判断，过滤对象的输出等
 * 后处理类要实现BeanPostProcessor接口
 * */
public class AfterHandlerTest implements BeanPostProcessor{

	
	
	//初始化之前执行此方法，这里可写相关语句对bean对象进行处理
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		
		/*(1)这里获取的bean是在BeanLifeTest001.java里创建好的，这里可以再次加工处理
		 *(2)只写这个后处理程序不行，spring并不知道这是个后处理程序，需要在xml中进行设置
		 */
		User02 u=(User02)bean;
		if(u.getId().equals(1001)) {   //这里使用if语句对bean对象进行修改，即后处理
			u.setName("Hans");
		}else {
			return null;
		}
		System.out.println("beforeInitialization execute==>"+u);
		return bean;
	}

	//下面这个方法在初始化之后执行，返回的值是已经处理可在主测试程序BeanLifeTest001.java中进行输出
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after initailization execute!");
		return bean;   
	}

	
			
}

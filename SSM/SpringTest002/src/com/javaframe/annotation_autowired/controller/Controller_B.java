package com.javaframe.annotation_autowired.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.javaframe.annotation_autowired.service.ServiceInterface;
import com.javaframe.annotation_autowired.service.Service_B;

@Controller
public class Controller_B {

	/*Dao_B为Service内属性“db”自动赋值，而Service为Controller_B内 “si”自动赋值，连续赋值的，因此最终执行的是Dao_B内的方法add()
	 * */
	
	/*(1)使用 @Autowired注解时，首先按照byType的方式进行扫描，即按照类来自动赋值，一个类有多个对象时，再按byName的方式自动赋值 
	 *(2)因此声明变量时，变量名可不用类名首字母小写的形式，但是建议用，因为可能按byName的方式扫描
	 *(3)用接口声明变量也行，用实现类也可以
	 * */
	//@Autowired
	//private ServiceInterface  si;  
	
	@Autowired
	private Service_B ser;    
	
	
	/*这里个人代码失误，把service_B.add()写进了Controller_B的无参构造里，当Spring框架要实例化Controller_B.java时，service_B还没自动赋值呢，
	 *因此出现空指针异常，下面代码无法执行，Controller_B无法实例化，因此报错：BeanInstantiationException 
	 */
	/*public Controller_B() {   
		service_B.add();         //错误代码
	}*/
	
	public Controller_B() {
		System.out.println("Controller_B 无参构造执行！");
	}
	
	public void add() {
		System.out.println("Controller_B add()方执行！");
		ser.add();
	}
	
}

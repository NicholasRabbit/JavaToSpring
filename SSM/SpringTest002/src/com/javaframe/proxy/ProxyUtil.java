package com.javaframe.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/*目标
 * ProxyUtil代理类实现Caculator.java的打印日志信息的功能
 * */
public class ProxyUtil {
	
	Caculator  cacu;   //这里实际上Caculator要写Object类型，只是为了便于理解改为Caculator
	
	public ProxyUtil(CaculatorInterface cacu) {   //构建有参构造，可以接收传过来的Caculator对象，为实例变量cacu赋值，供下面调用getInterfaces()使用
		this.cacu=(Caculator)cacu;
	}
	
	public Object getProxy() {
		
		//ClassLoader cl=this.getClass().getClassLoader();
		ClassLoader cl=cacu.getClass().getClassLoader();       //使用的是cacu的类加载器，不是this，获取ProxyUtil.java的类加载器，用来加载目标的相关反射类
		Class[]  interfaces=cacu.getClass().getInterfaces();   //获取被代理类Caculator的所有接口，返回值是一个Class数组，代理类回合目标类实现相同的接口
		InvocationHandler h=new MyHandler(cacu);     //这里也可以写成匿名内部类的方式，见老师课堂源码  
		Object proxyInstance=Proxy.newProxyInstance(cl,interfaces, h);   //这里实际是以CaculatorInterface接口创建了一个实例，供以后调用接口中加减乘除方法用
		
		return proxyInstance;
	}
	 
}

//InvocationHandler接口是进行操作的，帮助目标类实现其功能，MyHandler是其实现类，重写invoke(..)方法进行功能实现
class MyHandler implements InvocationHandler {
	Caculator cacu;
	public MyHandler() {
		
	}
	public MyHandler(Caculator cacu) {
		this.cacu=cacu;    //这里传进来cacu对象，下面的method.invoke(..)要用
	}
	@Override                                        //这里的args是指plus(..)等运算方法中的形参合成的数组
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		String methodName=method.getName();    //获取方法名
		String numbers=Arrays.toString(args);  //把形参列表的数组转换为字符串
		MyLog.beforeHandler(methodName, numbers);
		
		Object result=method.invoke(cacu,args);    //进行运算，这个还是利用反射机制调用Method类里的方法的写法,调用加减乘除方法,动态代理通过这个方法实现目标类的功能，其实还是使用目标类（被代理类）对象来调用方法
		System.out.println("结果："+result);         //注意，形参列表第一个是目标类Caculator对象cacu,不是proxy!!切记
		MyLog.afterHandler(methodName, result);
		
		return result;
	}

	
}

package com.javaframe.proxy;

public class ProxyTest001 {
	
	public static void main(String[] args) {
		
		//声明变量最好用接口，因为动态代理是针对接口操作的，只要知道接口中的方法就知道它的实现类要做什么了，如果有多个实现类的话，接口声明变量转换起来也方便
		CaculatorInterface  ci=new Caculator();    
		
		int result=ci.plus(10, 20);
		System.out.println(result);   //普通new对象的方法进行运算的方式
		
		ProxyUtil  proxyUtil=new ProxyUtil(ci);   //使用AOP，通过动态代理的方式进行运算，日志文件输出信息在ProxyUtil.java里面，不用写在Caculator类写了，代码简洁了
		CaculatorInterface cacu=(CaculatorInterface)proxyUtil.getProxy();   //返回值是代理类对象Object,因为代理类实现了接口CaculatorInterface,所以Object可以向下转型为这个接口
		int result02=cacu.minus(60,15);
		System.out.println(result02);
		
		cacu.multiple(6, 3);   //动态代理方式下，其它方法也可以调用
		cacu.divide(30, 6);
		
		
	}
}

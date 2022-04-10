package com.springframe.aop;

import org.springframework.stereotype.Component;

/*Caculator02.java没有继承任何接口，但Spring框架还是为其配置AOP，并执行了动态代理，
  因为它有个父类是Object，并且aop.xml文件中也启用了AOP切面编程机制
*/

@Component      
public class Caculator02 {
	public String doSome(String cacu02) {
		System.out.println("Caculator02 doSome()方法执行==>"+cacu02);
		return cacu02;
	}
}

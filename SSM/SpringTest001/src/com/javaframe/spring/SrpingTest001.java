package com.javaframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Spring框架作用
 * 用户要获取User对象，不用每次都new新建了，只需在app**.xml文件中添加<bean>标签，并赋予相应的属性值就可以 
 */
public class SrpingTest001 {
	public static void main(String[] args) {
		
		/*(1)注意这里实参要写上applicationContext.xm配置文件，否则报错
		 *(2)这里可以调用app.close()方法关闭资源，但是ApplicationContext是接口，其内没有close()方法，子类中有，
		 *要关闭的话，可把ApplicationContext换为其子类，
		 *如ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		 *但是还是建议使用接口ApplicationContext
		 * */
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");   
		
		System.out.println(app);
		Object obj=app.getBean("user");  //返回值是Object类型，可向下转型
		User u=(User)obj;
		System.out.println(u);
		
		User u2=(User)app.getBean("user02");
		System.out.println(u2);
		
		/*(1)利用反射的方式获取类，以及对象，如果只有一个User类，可使用以下方法getBean(Class<T> c)重载
		             但是因为applicationContext.xml文件中定义了两个User类，所以这个不能在这里用， User.class不知道获取的是哪个
		  (2)使用getBean(String id,Class<T> c)方法重载可解决
		  (3)Spring框架是通过反射机制构建对象的，使用newInstance(),如果User.java中无参构造私有化没法用(手写个有参构造，则无参构造就没法用了)，就会报异常NoSuchMethodException。
		*/
      /*User u3=app.getBean(User.class);   //如果app.xml中<bean>标签只有一个User类，可使用此方式，且不需要id，即xml文件中<bean>标签没有id属性也可以
		System.out.println(u3);*/
		User u4=app.getBean("user02", User.class);  
		System.out.println(u4);
	}
}

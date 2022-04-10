package com.javaframe.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*(1)本范例测试beansConstructor.xml文件中配置Student类中有参构造的的赋值方式，即依赖注入，注入就是赋值
 *(2)注意xml配置文件中给Student有参构造赋值的标签写法，以及按照下标赋值的方式
 * */
public class SpringTest002 {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("beansConstructor.xml");
		//一，beanConstructor.xml文件中通过有参构造赋值之后，下面获取该对象
		//注意xml配置文件中<constructor-arg>要把有参构造所有参数都写全，都赋值，否则报错
		Student stu01=app.getBean("stu01",Student.class);   //getBean方法重载，形参是xml文件中的id和对象的类型，Spring使用反射机制创建对象的 
		System.out.println(stu01);  
		
		//二，有参构造方法重载，没有指定下标的情况，输出错误
		Student stu02=app.getBean("stu02",Student.class);
		System.out.println(stu02);  //Student [num=100122, name=Carolina, age=null, score=25.0]  没有指定下标和类型，这里把age当作score去调用第二个有Double的有参构造方法了，错误
		
		/*三，例二问题解决方案：指定下标和类型，避免调错有参构造方法
		 *   注意，下标是指形参列表里的，不是按照所有属性来排列下标的，下标以0开始
		*/
		Student stu03=app.getBean("stu03",Student.class);
		System.out.println(stu03);  //结果：Student [num=100123, name=Dan, age=27, score=null]    指定下标和类型后，输出正确
		
		 //四，测试xml配置文件中p:name的用法,对象引用不用value进行赋值，而是用ref赋值
        Student stu04=app.getBean("stu04",Student.class);
        System.out.println("stu04==>"+stu04);

        //五，Student类中有对象的属性时的用法范例
        Student stu05=app.getBean("stu05",Student.class);
        System.out.println("stu05==>"+stu05);
        
        //六，给Student的属性teacher的内部属性赋值范例，详见xml文件注释
        Student stu06=app.getBean("stu06",Student.class);
        System.out.println("stu06==>"+stu06);
	}
}

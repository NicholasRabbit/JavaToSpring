/*
注解中的属性，
(1)public @interface MyAnnotation003 {
	String  name();  注意写法，注解内属性以括号结尾，与一般属性写法不同
	int age();
	byte bb() default 30;
(2)注解中属性的类型可以是基本数据类型，引用数据类型，以及他们的数组，枚举也可以	
  
*/

@MyAnno003(name="Tom", age=25)    //(1)注解使用时，其内部属性必须全部赋值，否则报错，如果注解中属性b有默认值，则不赋值也行。
public class AnnotationTest003 {

	static String name="Jerry";   //(2)类中同名变量不按照注解赋值，也不报错,注解只是提供建议的值，不是强制性赋值
	static int age;

	public static void main(String[] args){
	
		System.out.println(name+age);  	
	
	}

	@MyAnno003(name="Jerry",age=60,bb=100)  //(3)默认属性bb重新赋值也可以
	public void method01(){
		System.out.println("method01 execute");
	}

	@MyAnno004    //(4)MyAnno里的属性必须全部赋值才可使用，除非使用defalut指定默认值，如MyAnno003里：byte bb() default 30;
	@MyAnno003(name="Tom", age=25,arr={4,5,6})  //(5)属性是数组，用大括号赋值， 如果只有一个属性，大括号可不写，即arr=4
	public void method02(){                     //   这里赋值不允许使用初始化形式赋值，即arr=new int[5]错误
		System.out.println("method02 execute");
	}
}

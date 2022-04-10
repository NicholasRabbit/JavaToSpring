/*
元注解：用于注解上的注解，称为元注解，以下是常用的三个元注解

(1)Target({ElementType.Method}}) 后面括号内表示一个注解只能用于方法上,其属性是一个ElementType枚举数组

(2)Retention（RetentionPolicy.Class）后面属性的的含义
	CLASS  编译器将把注释记录在类文件中，但在运行时 VM 不需要保留注释。 
	RUNTIME 编译器将把注释记录在类文件中，在运行时 VM 将保留注释，因此可以反射性地读取。 
	SOURCE  编译时注解保留在源文件中，不编译

(3) Deprecated注解类，可用于类，属性，方法，表示它们已过时
*/

public class AnnotationTest005 {

	
	public static void main(String[] args){
	
		User u=new User();
		u.deprecatedMethod();
	}

	@MyAnno   //MyAnno注解只能用在方法上
	public static void method01(){
		System.out.println("method01 execute.");
	}

}


@Deprecated
class User {

	//@MyAnno  //这个注解上有元注解Target（{ElementType.METHOD}）,说明它只能用于方法上，不能用于属性  
    int age;

	
	@Deprecated   
	public int deprecatedMethod(){
	   System.out.println("Deprecated method execute.");
	   return 1;
	}
}
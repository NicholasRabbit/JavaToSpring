/*
元注解(meta annotation)：用于注解上的注解，称为元注解，以下是常用的三个元注解
https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Target.html

(1)@Target
	1,@Target({ElementType.Method}}) : 
	2,@Target(ElementType.TYPE) : It means that the annotation can only be used on type delclarations.
	3,ANNOTATION_TYPE : It can only be used on annotation type delcaration.
	e.g.
	@Target(ElementType.ANNOTATION_TYPE)  //@MyAnno can only be used on annotatiion type declarations.
	public @Interface @MyAnno{
	}
	4,TYPE_PARAMETER : 
	What is type parameter?
	public class Box<T> {
		public void set(@MyAnno T t){}  //T is a type parameter.
	}

	5,@Target({})
	This @Target meta-annotation indicates that the declared type is intended solely for use as a member type in complex annotation type declarations. 
	It cannot be used to annotate anything directly:
		@Target({})
		public @interface MemberType {
			...
		}

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
@DataAnno    //Throw an exception. @DataAnno cannot be used on anywhere because it has a @Target({})
class User {

	//@MyAnno  //这个注解上有元注解Target（{ElementType.METHOD}）,说明它只能用于方法上，不能用于属性  
    int age;

	
	@Deprecated   
	public int deprecatedMethod(){
	   System.out.println("Deprecated method execute.");
	   return 1;
	}
}

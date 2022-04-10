/*Java自带注解Override的作用分析 
源码： 
@Target(value=METHOD)     =>说明Override这个注解只能用在方法上
@Retention(value=SOURCE)  =>此行说明Override注解只存在于源码文件中，而不会被编译为.class文件
public @interface Override{}

*/

public class AnnotationTest002 {

	//@Override
	public static void main(String[] args){
		System.out.println("Override注解练习");
	}

	@Override    //Override注解只能注解子类重写的父类方法上，以及实现接口的方法上等，不能出现在不是重写父类的子类特有的方法上，否则报错。    
	public String toString(){
		return "AnnotationTest002";
	}

}
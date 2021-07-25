//自定义注解，一般情况下，注解可以出现在任何位置，类上，属性上，方法上都行

@MyAnnotation    //注解后面不用加分号  
public class AnnotationTest001 {

	@MyAnnotation
	int age;

	@MyAnnotation
	public static void main(String[] args){
	
		
	}

	@MyAnnotation
    public void method(){
	
	}

}
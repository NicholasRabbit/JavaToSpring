//注解中value属性练习

public class AnnotationTest004 {

	 /*(1)当一个注解类中有且只有一个属性，并且名为value时，可省略不写,如果有别的属性就不可以
	   (2)如果有别的属性，所有属性包括value在内都定义了默认值的情况下，当只在这里用value时，可不写value=200,直接写200即可
	      不写属性名就自动找到value了，与注解中属性的声明顺序无关
       (3)其它非名称为value的属性必须定义了默认值，否则报错
	 */              
	@MyAnno(200)			  
	public static void main(String[] args){
		System.out.println("main execute!");
		doSome();
	}

	@MyAnno02("Tom")
	public static void doSome(){
		System.out.println("doSome execute!");
	}

}
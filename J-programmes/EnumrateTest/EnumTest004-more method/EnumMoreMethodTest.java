
/*
 * Enum深入研究:
 * 1，所有枚举类都默认实现Comparable接口，所有都有compareTo(..)方法;
 *    同时重写了equals()和hashCode()方法;
 * 2，枚举也实现了Serializable接口;
 * 3，根据源码可是Enum.java中的finalize()方法由final修饰，所以所有的自定义Enum类不能有finalize()方法;
 * */

public class EnumMoreMethodTest{

	public static void main(String[] args){
	
		//遍历测试
		for(SeasonEnum se : SeasonEnum.values()){
			//toString()和ordinal()方法
			System.out.print(se + ",ordinal:" + se.ordinal());
			//compareTo(..)方法
			System.out.print(" // compareTo():" + se.compareTo(SeasonEnum.SUMMER));
			//equals(..)方法
			System.out.print(" // equals():"+ se.equals(SeasonEnum.SUMMER));
			//getDeclaringClass()方法
			System.out.print(" // getDeclaringClass():" + se.getDeclaringClass());
			//getName()方法
			System.out.println(" // getName():" + se.name());
		
		}

		
	
	}


	
}

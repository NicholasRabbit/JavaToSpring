
/*
* StringBuilder.java使用范例
*/
public class StringBuilderTest001 {
	
	public static void main(String[] args){
	
		defaultValue();
	}

	
	public static void defaultValue(){
		/*
		* 1，StringBuilder中初始化时的默认值
		*    根据源码可知，StringBuilder初始化后，默认是一个空字符串:""
		*/
		StringBuilder builder = new StringBuilder(5);  //设定初始化StringBuilder内的成员变量char[] value的容量，参照源码
		String str = "";

		if(builder.equals(builder)){
			System.out.println("A");    //这里打印输出，因为这俩底层都重写了toString()方法。println()默认调用对象的toString()方法。
		} 
		
		if(str.toString().equals(builder.toString())){
			System.out.println("B");   //这里也输出，只是首当调用了toString()
		}else{
			System.out.println("other");
		}


	
	}

}
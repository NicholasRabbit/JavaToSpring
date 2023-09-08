public class StringTest003{

	public static void main(String[] args){
	
		strMethod();
	
	}

	public static void strMethod(){
	
		//1,concat(..)方法，不改变原来的String对象，而是生成新的对象
		String str = "Hello";
		String str2 = str.concat(" World!");

		System.out.println("str==>" + str);     //str==>Hello
		System.out.println("str2==>" + str2);	//str2==>Hello World!

	}

}

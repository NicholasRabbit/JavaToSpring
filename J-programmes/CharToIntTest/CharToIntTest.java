public class CharToIntTest{

	//打印char类型的ASCII码范例
	public static void main(String[] args){

		//方法1，自动向上转型
		char c1 = 'a';
		int i1 = c1;  
		System.out.println("ASCII value of '" + c1 + "' is " + i1);

		//方法2，强制转型
		char c2 = 'A';
		System.out.println("ASCII value of '" + c2 + "' is " + (int)c2);

	}


}

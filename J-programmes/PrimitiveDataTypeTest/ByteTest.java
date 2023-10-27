/*
 * byte类型范围-128~127
 * 1,因为系统默认等号右边的右值是int类型，在Java中，只要右值在byte范围内
 * 就不用使用强制向下转型。
 * 2,注意，当int类型作为实参的时候，即使在byte数值范围内也自动向下转型。
 * 自动向下转型仅适用于声明byte类型变量时赋值。
 *
 * */
public class ByteTest {

	public static void main(String[] args){

		//在byte范围内，自动向下转型
		byte a = -128;
		//不在范围内，需加强制转型符号，否则编译报错。
		//byte b = 133;	 //编译报错！！
		byte b = (byte)133;

		//int类型实参即使在byte范围内也不会自动转型
		//testByte(127);  //编译报错！！
		testByte((byte)127);


	}

	
	public static void testByte(byte b){
		System.out.println("b==>" + b);
	}

}

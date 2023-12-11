public class BitWiseAndSignedUnsigned{

	public static void main(String[] args){
	
		//1, Java中的移位都是按照有符号的类型来计算的，正负数移位区别参照个人C语言:23_Bitwise/BitwistTest.c
		int i = 0xcffffff3;
		System.out.println("i = " + Integer.toBinaryString(i));

		int j = i >> 2;
		System.out.println("i >> 2 = " + Integer.toBinaryString(j));

		//2, Java中没有unsigned关键字，默认都是有符号的，可以使用包装类的静态方法toUnsignedLong(..)等方法来转换。
		//注意int转为无符号有的就超范围了，需要转换成long类型。
		long unsignedNum = Integer.toUnsignedLong(i);
		System.out.println("unsignedNum = " + unsignedNum);



	}

}

public class BitWiseTest {

	public static void main(String[] args){
		doSome();
	}

	public static void doSome(){
		//1,">>"或"<<"带符号移位符，只有证书才能以为，移位符只针对二进制数字，表示将二进制移动位置
		int i = 0b1100;
		int j = i >> 1;
		int k = i << 2;
		int l = i >> -3;
		System.out.println("0b1100 >> 1 = " + Integer.toBinaryString(j));  //输出：110，这里直接打印j会默认输出十进制数，无法看到效果，因此使用toBinaryString()转换
		System.out.println("0b1100 << 2 = " + Integer.toBinaryString(k));  //输出：110000
		System.out.println("0b1100 >> -2 = " + Integer.toBinaryString(l)); //输出：0，原因待查
	}

}
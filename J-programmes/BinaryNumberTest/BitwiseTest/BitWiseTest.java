

//Java中常用的位运算，位运算针对二进制的位，其它进制的运算会转换成二进制再进行
//二进数字制用0b或0B开头。

public class BitWiseTest {

	public static void main(String[] args){
		doSome();
	}

	public static void doSome(){
		//1,">>"或"<<"带符号移位符，只有整数才能移位，移位符只针对二进制数字，表示将二进制移动位置
		int i = 0b1100;
		int j = i >> 1;
		int k = i << 2;
		int l = i >> -3;
		System.out.println("0b1100 >> 1 = " + Integer.toBinaryString(j));  //输出：110，这里直接打印j会默认输出十进制数，无法看到效果，因此使用toBinaryString()转换
		System.out.println("0b1100 << 2 = " + Integer.toBinaryString(k));  //输出：110000
		System.out.println("0b1100 >> -2 = " + Integer.toBinaryString(l)); //输出：0，原因待查
	
		//2, & : 按位与，即两个二进制数逐位进行“&”比较，例 1&1=1，1&0=0，0&0=0 
		int a = 0b1001;
		int b = 0b1100;
		int c = a & b;
		System.out.println("a & b ==> " + Integer.toBinaryString(c));  //结果：10000

		//3, | : 按位或，例: 1 | 0 = 1，0 | 1 = 1，当有一个为真时结果为真，都为假时结果为假
		int d = 0b1001;
		int e = 0b1100;
		int f = d | e;
		System.out.println("d | e ==> " + Integer.toBinaryString(f));  //结果：1101

		//4, ^ : 异或运算，例，1^0=1, 1^1=0, 0^0=0,即，一个真一个假结果为真，两个真结果为假，两个假结果也为假
		byte w = 0b1001;
		byte v = 0b1100;
		System.out.println("w ^ v ==> " + Integer.toBinaryString(w^v));  //结果：0101

		//5, ~ : 取反运算，单目运算符，即只用于一个数字
		int x = 0b1100;
		int y = ~x;
		System.out.println("~x ==> " + Integer.toBinaryString(y)); //结果：11111111111111111111111111110011，按全位数的int类型数值取反了。

		//6, |= : 或等运算，跟+=运算同理，不过它只适用于二进制，a |= b等同于 a = a | b
		//同理有：+= -= *= /= %= &= ^= |= <<= >>= >>>=
		int m = 0B10001111;
		int n = 0B01110000;
		m |= n;  
		System.out.println("m |= n==> " + Integer.toBinaryString(m));

		//7, &= : 与等运算，同理
		//byte数的范围-128~127（Java中规定在这个范围内的int自动向下转型），如果这里赋值0B11111111(255)超出范围，而且不加强制转换符号就会报错，
		//这个数是255，实际底层用它来表示-1
		//byte r = 0B11111111;  
		byte r = 0B01111111;  //这个数是127
		byte s = 0B00000000;
		System.out.println("r=" + r);
		r &= s;
		System.out.println("r &= s==> " + Integer.toBinaryString(r));	

		//8, ^= ： 异或等运算，同理，求完异或再赋值
		r = 0B01111111;  //这个数是127
		s = 0B00000000;
		r ^= s;   // r = r ^ s;
		System.out.println("r ^= s ==> " + Integer.toBinaryString(r));
		

	}

}

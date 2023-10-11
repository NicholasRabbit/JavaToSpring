
import java.math.*;

/*
* float,double在计算式损失精度的原因：
* 1，float和double类型是为科学计算和工程计算设计的，他们执行二进制的浮点运算。
*    这使得他们能够在广泛的数值范围内提供更精确的快速近似和计算，但是不能提供完全准确的计算结果。
* 2，因为float,double是用科学计数法来表示数字的，不能表示任何有限长度的二进制，因此转换的时候就会有精度损失
* 3，精度损失是在二进制转换为十进制的时候损失的
*    例：0.5用二进制表示就是 0.5 x 2 = 1 ==> 0.1(二进制，小数点后的 1 x 2^-1 = 0.5)
        但0.2则无法用二进制拼起来，2^-3 = 1/8 = 0.125 ，2^-4 = 1/16 = 0.0625 ...这几个加起来永远无法刚好等于0.2，
		所以造成精度损失。

* 为什么小数位转换成二进制要乘以2？
* 跟小数点左边整数位除以2原理相同，左边转换为二进制，2是最小单位。
* 小数点右边0.0第一位是2^-1次方，因为刚好比1小，即1/2是最小单位，除以1/2就是乘以2，
* 例：0.26
* 0.26 x 2 = 0.52, 整数位是0，说明有0个2^-1，二进制中乘以2，相当于左移一位，跟十进制0.1415926 x 10 = 1.1415926同理，因此下面接着x2就是得到几个2^-2次方。
* 0.52 x 2 = 1.04, 整数位是1，1 x 2^-2次方，因为第二位小数的二进制值的出来了，需要减去这个二进制的1
* 0.04 x 2 = 0.08, ...
* 0.08 x 2 = 0.16, ...
* 然后就计算多少个1/2,1/4,1/8加起来正好等于小数位，
* 有时后永远无法等于，这就造成了精度损失。


* 解决办法：
* 3，使用BigDecimal来解决
* 因为BigDecimal的长度是不可变得，BigDecimal在处理的时候把十进制小数扩大N倍让它在整数上进行计算，并保留相应的精度信息
* 注意：不能直接把double类型的数作为BigDecimal构造函数的实参，转换结果有误
* 应换为String类型，见下例。
* 参考：https://cloud.tencent.com/developer/article/1468551
*		https://cloud.tencent.com/developer/article/1470383
*/
public class DoubleTest {

	public static void main(String[] args){
		
		//(1)double精度损失
		double num = 1.022 * 0.2;
		double a = 0.30d;
		double b = 0.10d;
		double num2 = a - b;

		System.out.println("num = " + num);  //结果：0.20440000000000003
		System.out.println("num2 = " + num2);  //结果：0.19999999999999998

		
		//(2)不能直接把double类型的数作为BigDecimal构造函数的实参
		double num3 = 0.3;
		BigDecimal big1 = new BigDecimal(num3);
		System.out.println("big1==>" + big1);   //转换结果错误：0.299999999999999988897769753748434595763683319091796875
		//正确做法
		BigDecimal big2 = new BigDecimal("0.3");
		System.out.println("big2==>" + big2);

		//(3)double类型的0.1+0.2等于多少？
		double d = 0.1 +0.2;
		System.out.println("0.1+0.2=" + d); //结果：0.30000000000000004
	}
}


import java.math.*;

/*
* float,double在计算式损失精度的原因：
* 1，float和double类型是为科学计算和工程计算设计的，他们执行二进制的浮点运算。
*    这使得他们能够在广泛的数值范围内提供更精确的快速近似和计算，但是不能提供完全准确的计算结果。
* 2，因为float,double是用科学计数法来表示数字的，不能表示任何有限长度的二进制，因此转换的时候就会有精度损失
* 解决办法：
* 使用BigDecimal来解决
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
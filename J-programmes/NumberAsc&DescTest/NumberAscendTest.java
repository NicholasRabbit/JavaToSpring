
/*
* int类型数字的倒序，正序打印范例
*/
public class NumberAscendTest {

	public static void main(String[] args){
		
		int number = 123456;
		ascendPrint(number);

		descendPrint(number);
	}

	//逆序打印
	public static void ascendPrint(int number){
		
		//一，先分步打印，整理思路
		//打印个位数
		int temp = number;
		int i = temp % 10;
		System.out.println("i==>" + i);
		//打印十位数
		temp = temp / 10;
		i = temp % 10;
		System.out.println("i==>" + i);
		//打印百位数
		temp = temp / 10;
		i = temp % 10;
		System.out.println("i==>" + i);
		//依次类推

		
		//使用循环
		System.out.println("======使用循环=======");
		int temp2 = number;
		while(temp2 > 0){
			int j = temp2 % 10;
			System.out.println("j==>" + j);
			temp2 /= 10;
		}

	}

	//正序打印，利用递归，栈的特点(LIFO)
	//实际也是跟上面倒序的思路一样，进行/10 %10等运算，只是利用栈的特性先打印高位数。
	public static void descendPrint(int number){
	
		//这里就是判断当参数小于等于9时，递归的最后一个方法打印完数组，return,弹栈，后续的所有方法持续弹栈
		if(number <= 9){
			System.out.println("descend==>" + number);
			return;
		}
		descendPrint(number / 10);
		System.out.println("descend==>" + number % 10);
		
	}

}
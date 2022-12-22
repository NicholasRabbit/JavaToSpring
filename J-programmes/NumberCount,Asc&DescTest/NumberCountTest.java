public class NumberCountTest {

	private static int m;
	
	public static void main(String[] args){
		
		//统计位数
		int digitCount = count(100);
		System.out.println("digitCount==>" + digitCount);

		int result = recursionCount(123456);
		System.out.println("result==>" + result);

		System.out.println("累加==>" + sum(5));

	}



	//统计一个整数的位数
	//第一种方法
	public static int count(int number){
		
		int digitCount = 0;
		//因为有可能是0这个一位数的情况，所以用do..while,先计一次数
		do{
			digitCount++;
			number /= 10;
		}while (number > 0);
		
		return digitCount;
	}
	//第二种方法，使用递归
	public static int recursionCount(int number){
		
		if(number <= 9){
			return ++m;
		}
		recursionCount(number /= 10);	
		return  ++m;
	}

	
	//累加
	public static int sum(int i){
		if(i == 0){
			return 0;
		}
		return i + sum(i - 1);
	}
}

//生成Fibonacci sequece范例
public class FibonacciArray {
	
	public static void main(String[] args){
		
		int[] array = new int[20];
		createFibonacci(array);
		System.out.println(arrayToString(array));
	}

	public static int[] createFibonacci(int[] array){
		array[0] = 1;
		array[1] = 1;		
		for(int i = 2; i < array.length; i++){
			array[i] = array[i-1] + array[i-2];	
		}
		return array;
	}



	//仿写Arrays.toString(..)
	private static String arrayToString(int[] array){
		if(array == null){
			return "null";
		}
		int maxIndex = array.length - 1;
		if(maxIndex == -1){
			return "{}";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		for(int i = 0; ; i++){  //这里for中间没有条件，因此无论如何回进入下面的if语句，所以最后不写return也不报错。
			builder.append(array[i]);
			if(i == maxIndex)
				return builder.append("}").toString();
			builder.append(",");
		}

	}



}
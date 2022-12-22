public class MaxNumberInArrayTest {

	public static void main(String[] args){
		
		int[] array = {12,36,25,99,45};
		int max = MaxNumberInArrayTest.maxNumber(array);
		System.out.println("max==>" + max);
			
	}

	
	public static int maxNumber(int[] array){
		//首先假设第一个最大
		int max = array[0];
		for(int i = 0; i < array.length; i++){
			//如果大于max就赋值于它
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	
	}

}
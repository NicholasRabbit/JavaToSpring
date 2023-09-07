public class ArrayTest0091{

	public static void main(String[] args){
	
		arr1();
		arr2();
		arr3();

	}

	public static void arr1(){
		int[] arr = new int[5];
		arr[0] = 1;
		arr[2] = 2;
		for(int i = 0; i < arr.length; i++){
			System.out.println("arr:" + arr[i]);
		}

	}

	public static void arr2(){
		//重点注意这里，这种声明数组的方式是静态初始化
		int[] arr1 = new int[]{};
		arr1[0] = 1;  //此行报错，因为上句是属于静态初始化数组，长度已固定。
		arr1[1] = 2;
		arr1[2] = 3;
		for(int i = 0; i < arr1.length; i++){
			System.out.println("arr1:" + arr1[i]);
		}
	}

	public static void arr3(){
		int[] arr2 = new int[]{1,2,3,4};
		arr2[0] = 9;
		for(int i = 0; i < arr2.length; i++){
			System.out.println("arr2:" + arr2[i]);
		}
	}

}

public class SortTest {

    public static void main(String[] args){
	
         int[] arr={5,69,32,14,2,9,7};
		 
		 java.util.Arrays.sort(arr);      //调用java自带数组排序工具类Arrays里sort()方法,把数组元素从小到大排序。
                                          //非java.lang包下的不是自动导入，需写全路径，或使用import
		 for(int i=0; i<arr.length; i++){
		 
		     System.out.println(arr[i]);
		 }
	
	}

}
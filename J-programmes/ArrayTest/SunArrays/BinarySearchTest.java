import java.util.Arrays;

public class BinarySearchTest {

    public static void main(String[] args){
	
	    int[] arr={26,36,22,66,0,45};       
		Arrays.sort(arr);                  //Arrays类里二分法查找方法binarySearch()方法使用前，必须对数组进行升序排序
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);    //{0,22,26,36,45,66}


		}
                                                    //binarySearch()是静态方法。
		int retValue=Arrays.binarySearch(arr,26);   //返回所找数的下标，没有返回负数
		int retValue2=Arrays.binarySearch(arr,100);
		System.out.println("所找数下标："+retValue); 
		System.out.println("所找数下标："+retValue2); 
	
	}

}
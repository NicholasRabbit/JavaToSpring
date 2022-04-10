import java.util.Random;


public class BinarySearchTest203 {

    public static void main(String[] args){
	
         int[] arr=arrMethod();
		 
         int retValue=binarySearch(arr, 5);

		 System.out.println("所查找数的下标:"+retValue);

	
	}
	public static int[] arrMethod(){
	   int[] arr=new int[10];
		for (int i=0;i<arr.length ;i++ ){

            arr[i]=-1;

		}

		Random rdm=new Random();
		int k=0;
		
		//while循环生成随机数放进数组
		while(k<arr.length){
		    int a=rdm.nextInt(10);
		    if(!isSame(arr, a)){
			    arr[k]=a;
				k++;
			}
		}

		//选择法排序
		for(int i=0; i<arr.length-1; i++){
		    int min=i;   
			for(int j=i+1; j<arr.length; j++){
			    if(arr[j]<arr[min]){
				   min=j;
				}
			}
			if(min!=i){
			    int temp;
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		for(int i=0; i<arr.length; i++){
		    System.out.println(arr[i]);
		}

		return arr;

	}


	public static boolean isSame(int[] arr, int a){
	
	    for(int i=0; i<arr.length; i++){
		
		    if(a==arr[i]){
			   return true;
			}
		}
		return false;
	}

	//二分法查找数组内元素的方法
	public static int binarySearch(int[] arr, int a){
	
	    int head=0;
		int tail=arr.length-1;
		while(head<=tail){
		    int mid=(head+tail)/2;
			if(arr[mid]>a){
			    tail=mid-1;
			}else if(arr[mid]<a){
			    head=mid+1;
			}else{
			    return mid;
			}
		}
		return -1;
	
	}

}
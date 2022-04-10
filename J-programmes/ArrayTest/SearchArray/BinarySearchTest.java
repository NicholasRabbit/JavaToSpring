public class BinarySearchTest {

    public static void main(String[] args){
	
	    int[] arr={1,2,3,4,5,6,7,8,9,10};   //用二分法查找元素，针对的数组必须是从小到大拍好序的。

		int retValue=searchMethod(arr, 10);
		System.out.println("10的下标："+retValue);

	
	}

	public static int searchMethod(int[] arr, int dest){
	
	    int head=0;
		int tail=arr.length-1;

		while (head<=tail){     //开始下标只要在结束下标的左边，就一直循环，
		                        //找到数dest的时候，也就是首尾下标相等的时候
			
			int mid=(head+tail)/2;
			
			if(arr[mid]>dest){
			    tail=mid-1;
			}else if(arr[mid]<dest){
			    head=mid+1;
			}else{
			    return mid;    //此时是arr(mid)==dest的情况。
				               //二分法查找元素，如果dest的数在数组里，循环最终都要得到arr[mid]=dest
			}                  //例：在上面数组找10，while循环到最后 int mid=(9+9)/2，则最终else{}成立
			
		}
		return -1;     //通过while循环，没有找到与dest相等的元素，用返回-1表示。

	
	}

}
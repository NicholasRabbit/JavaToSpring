public class BinarySearchTest204 {

    public static void main(String[] args){
	    int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};  //二分法查找元素的下标，前提是数组是拍好序的。

		int index=binarySearch(arr,11);
		System.out.println("11下标："+index);
	}

	public static int binarySearch(int[] arr, int k){
	    int head = 0;
		int tail = arr.length-1;
		while(head<=tail){
		    int mid=(head+tail)/2;
			if(arr[mid]>k){
			    tail=mid-1;
			}else if(arr[mid]<k){
			    head=mid+1;
			}else {
			    return mid;
			}

		}
		return -1;
	}

}
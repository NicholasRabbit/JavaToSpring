public class SearchArray {

    public static void main(String[] args){
	
	     int[] arr={10,25,3,36,95,22,4,6};  //找出3的下标。
		 int retValue=searchMethod(arr,3);	
		 System.out.println("3的下标是："+retValue);   //如果返回-1则表示无此数。
	}

	public static int searchMethod(int[] arr, int k){
	
	    for(int i=0;i<arr.length;i++){
		    if(arr[i]==k){
			
			    return i;
			}    
		}
		return -1;
	
	}

}
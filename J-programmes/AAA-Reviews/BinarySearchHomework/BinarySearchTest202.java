public class BinarySearchTest202 {

    public static void main(String[] args){
	
	    int[] arr=new int[100];
		int i=0;
		int j=1;
		while(i<arr.length){
		    
		    arr[i]=j;
			j++;
			i++;
		
		}
       
		int retValue=BinarySearchMethod(arr, 99);
		System.out.println(retValue);
        
			
	}
    
	public static int BinarySearchMethod(int[] arr, int num){
	    int head=0;
		int tail=arr.length-1;
        
	    while(head<=tail){
		    int mid=(head+tail)/2;
		    if(arr[mid]<num){
			
			    head=mid+1;

			}else if(arr[mid]>num){
			    
                tail=mid-1;

			}else{
			    return mid;
			}

			
		
		}
		return -1;

	}
	

}
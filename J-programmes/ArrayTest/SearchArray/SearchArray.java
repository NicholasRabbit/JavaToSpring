public class SearchArray {

    public static void main(String[] args){
	
	     int[] arr={10,25,3,36,95,22,4,6};  //�ҳ�3���±ꡣ
		 int retValue=searchMethod(arr,3);	
		 System.out.println("3���±��ǣ�"+retValue);   //�������-1���ʾ�޴�����
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
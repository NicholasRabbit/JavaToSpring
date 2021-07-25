public class BubbleSelectTest201 {

    public static void main(String[] args){
	
	    int[] arr={123,6,5,96,32,66,45,20,78,63};
		bubbleMethod(arr);
		System.out.println("~~~~~~~~~~~");
		selectMethod(arr);


	}

	public static void bubbleMethod (int[] arr) {

		for(int i=arr.length-1; i>0; i--){
		
		    for(int j=0; j< i; j++){
			
			    if(arr[j]>arr[j+1]){
				    int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		for(int i=0; i<arr.length; i++){
		
		    System.out.println(arr[i]);
		}
	
	}

	public static void selectMethod(int[] arr){
        //选择法排列数组,这次从大到小排序
		for(int i=0; i<arr.length; i++){
		    int max=i;
			for(int j=i+1; j<arr.length; j++){
			    if(arr[max] < arr[j]){
				    max=j;
				}
			}
			if(max!=i){
			    int temp;
				temp=arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
			}
		}
       
		for(int i=0; i<arr.length; i++){
		    System.out.println(arr[i]);
		}
	
	}

}
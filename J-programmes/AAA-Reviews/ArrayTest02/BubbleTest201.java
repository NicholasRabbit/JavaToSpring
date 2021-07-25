public class BubbleTest201 {

    public static void main(String[] args){
	
	    int[] arr={5,4,3,2,1};
		methodBubble(arr);

		int[] arr2={11,65,23,55,6,0,2,99,412,33,62};
		methodSelect(arr2);

	
	}

	public static int[] methodBubble(int[] arr){
	
	    for(int i=arr.length-1;i>0;i--){
		
		    for(int j=0;j<i;j++){
			
			    if(arr[j]>arr[j+1]){
				
				    int temp;
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;

				}
			
			}
		
		}
        
		for(int i=0; i<arr.length; i++){
		
		    System.out.println(arr[i]);
		
		}
		return arr;
	
	}
    //~~~~~~~~~~~~~~~~~~~~~~~
	public static int[] methodSelect(int[] arr){
	    for(int i=0; i<arr.length-1; i++){
		    int min=i;
			for(int j=i+1; j<arr.length; j++){
			    if(arr[j]<arr[min]){
				    min=j;
				}
				if(min!=i){
				    int temp;
					temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int a=0; a<arr.length; a++){
		
		    System.out.println(arr[a]);
		
		}
		return arr;
	}

}
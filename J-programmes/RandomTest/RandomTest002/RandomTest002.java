import java.util.Random;

public class RandomTest002 {

    public static void main(String[] args){
	
	    method();
	
	}

	public static void method(){
	
	    Random rdm=new Random();
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++){
		    int k=rdm.nextInt(201);
			    arr[i]=k;
			for(int j=0;j<arr.length;j++){
			   
			   if(i!=j & arr[i]!=arr[j]){
			    
				 break;
			   }
			
			}
			
		}

		for(int j=0;j<arr.length;j++){
		    System.out.println(arr[j]);
		}

	
	}



}
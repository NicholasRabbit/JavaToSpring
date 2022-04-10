public class Day09Work02 {

    public static void main(String[] args){
	     
		 sum(100);
	
	}

	public static int sum(int x){
	
	    int m=0;
		int b=0;
		for(int a=1;a<=x;a++){
		   b=b+a;
		   if(a%2!=0&a>1){
		   
		      m+=a;
		   }
		
		}
		int k=b-m;
		System.out.println(k);
		return k;
	
	}

}
public class Day11Work01 {

    public static void main(String[] args){
	 
	    int j=factorialTest01(5);
		System.out.println(j);

		int i=factorialTest02(10);
		System.out.println(i);

	}

	public static int factorialTest01(int a){
	    int k=1;
	    for(int m=1;m<=a;m++){
		 
		    k*=m;  
		
		}
		return k;
	
	}

	public static int factorialTest02(int a){
	
	    int k=1;
		int m=1;
		while(m<=a){
		
		    k*=m;
			m++;

		}
		return k;
	
	}

}
public class RecursionTest202 {

    public static void main(String[] args){
	
	    int sum=recursionMethod(5);
		System.out.println(sum);
	}

	public static int recursionMethod(int n){
	
	    if(n>0){
			return n+recursionMethod(n-1);
        }

		return 0;
	}

}
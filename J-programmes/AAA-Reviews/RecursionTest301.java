public class RecursionTest301{
    public static void main(String[] args){
	    int k=RecursionTest301.sum(5);
		System.out.println(k);
	
	}
	public static int sum(int a){
	    if (a==1){
		   return 1;
		}
		return a+sum(a-1);
	
	}


}
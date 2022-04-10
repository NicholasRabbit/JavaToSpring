public class Test {

    public static void main(String[] args){
	
         
	     int k=Test.sum(100);
		 System.out.println(k);


		 int l=plus(100);
		 System.out.println(l);
	}

	public static int sum(int a){
	
	     int m=0;
		 for(int n=1;n<=a;n++){
		 
		    m=m+n;

		 }
		 return m;
	}


    public static int plus(int n){

		int m;
		    m=(1+n)*n/2;
			return m;
	
	
	}
}


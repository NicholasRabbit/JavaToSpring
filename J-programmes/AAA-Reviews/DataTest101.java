public class DataTest101 {
    public static void main(String[] args){
	     DataTest101.dataTest(2147483648L);
		             
					 double b=10/3;        
		             double k=dataTest02(b);
					 System.out.println(k);

					 double j=10.0/3;
					 double n=dataTest03(j);
					 System.out.println(n);

	
	}
	public static long dataTest(long a){
	     
		 System.out.println(a);
		 
		 long b=2147483649L;
		 int  c=(int)b;
		 System.out.println(c);
			  return a;
	
	}
	public static double dataTest02(double m){
	     
		 return m;
	
	}

	public static double dataTest03(double i){
	     return i;
	 
	}


}
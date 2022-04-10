public class OverloadTest302{
    public static void main(String[] args){
	     
		 int k=sum(10,30);
		 System.out.println(k);
		 
		 String l=sum("Hi there!");
		 System.out.println(l);

		 char m=A.char01('Z');
		 System.out.println(m);

		 K.type("from time immemorial");

		 K.type("This changed conviction into certainty.");
	
	
	}
	public static int sum(int a,int b){
	
	     return a+b;
	}
	public static long sum(long a,long b){
	
	     return a+b;
	}
    public static String sum(String a){
	     return a;
	}

}
class A
{
	public static char char01(char a){
	    return a;
	
	}
}
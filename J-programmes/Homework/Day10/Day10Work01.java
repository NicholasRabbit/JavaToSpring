public class Day10Work01 {

    public static void main(String[] args){
	    System.out.println("五位数的回文数");
	    test();
	}

	public static void test(){
	
	    for(int a=10000;a<100000;a++){
		
		    int m,n,i,j;             //例如12321,m=1,n=2,i=1,j=2
			    m=a/10000;
				n=(a/1000)%10;   
				i=a%10;
				j=(a/10)%10;
			
		    if(m==i&n==j){
			
			    System.out.println(a);
			}
		}
	}

}


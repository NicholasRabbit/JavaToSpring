public class Day11Work02 {

    public static void main(String[] args){
	
	    int k=A.sum(20);
		System.out.println(k);
	}


}

class A {

    public static int sum(int n){
	
	   int a=n;
       
	   boolean isPrime=true;
	   while(isPrime){
	       isPrime=false;  //此处代码目的，当if(a%b==0)语句不执行时，让if(!isPrime)语句执行，使while循环停止。
		                   //从而保证a是大于n的最小质数。
		   a++; 
	       for(int b=2;b<a;b++){
		   
		       if(a%b==0){
			     isPrime=true;
			     break;
			   }
		   }
		   if(!isPrime){
		   
		       break;
		   }
		 

	   }

	   return a;
	
	}

}
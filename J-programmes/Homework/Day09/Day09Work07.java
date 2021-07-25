public class Day09Work07 {

    public static void main(String[] args){
	
	     sum(1000);

	}

	public static int sum(int x){
	     
	    
		 for(int m=1;m<=x;m++){          //此处m=1或2开始都可以。等于1的话，内层for通不过，然后就下一个2，3,4……
		     int k=0;
		     for(int n=1;n<=m/2;n++){    //此处必须从n=1开始，因为1也是一个因数，不能从2开始。
			 
			     if(m%n==0){
				 
				    k+=n;
				 }
			 }
			 if(m==k){
			 
			    System.out.println("完数是； "+m);
			 }

		 }

         return x;
	}

}
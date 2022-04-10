public class Day09Work01 {

    public static void main(String[] args){
	    
		int k=Day09Work01.sum();
		System.out.println(k);
	
	}

	public static int sum(){
	
	     int m=0;
		 for(int n=1;n<=1000;n++){            //计算1000内不被7整除的数的和。
		     boolean isSeven=true;
			 if(n%7==0){
			 
			     isSeven=false;

			 }else if(isSeven){
			 
			    m+=n;
			 }

		 }
		 return m;

	}

}
public class Day09Work01 {

    public static void main(String[] args){
	    
		int k=Day09Work01.sum();
		System.out.println(k);
	
	}

	public static int sum(){
	
	     int m=0;
		 for(int n=1;n<=1000;n++){            //����1000�ڲ���7���������ĺ͡�
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
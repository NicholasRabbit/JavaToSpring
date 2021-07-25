public class ForTest203{
   public static void main(String[] args){
      ForTest203.zhiShu();
	  System.out.println("以上为质数结果");
   
   }
   public static void zhiShu(){
      int count=0;
	  for(int m=2;m<=10000;m+=1){
	      boolean bePrime=true;
		  
		  for(int n=2;n<m;n++){
		      if(m%n==0){
			     bePrime=false;
				 break;
			  }
			  
		  
		  }
		  if(bePrime){
			     count++;
				 System.out.print(m+" ");
				
				 if(count==8){
				 System.out.print('\n');
				 count=0;
				 }

		  }
	  
	  }
   
   }


}
public class ForTest202{
    public static void main(String[] args){
	  
		ForTest202.zhiShu();

	
	
	}
	public static void zhiShu(){
		
		int a;
		
		for(a=2;a<=100;a++){
		   boolean bePrime=true;
		   for(int b=2;b<a;b++){
		      if(a%b==0){
			     bePrime=false;
				 break;
			  }
		   
		   }
		   if(bePrime){
		      System.out.println("ÖÊÊý£º "+a);
		   
		   }
		
		}
	    
	
	
	}

}
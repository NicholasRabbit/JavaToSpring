public class ForTest012{
    public static void main(String[] args){
	     int count=0;
		 for(int c=2;c<=10000;c++){
			 boolean bePrime=true;
			 for(int d=2;d<c;d+=1){
			     if(c%d==0){
				     bePrime=false;
					 break;
				 }
			 
			 
			 }
		     if(bePrime){
				 //count+=1;写这里不对,写这里说明还没输出呢，就先换行了
				 if(count==8){
				    System.out.print('\n');
					count=0;
				 }else{
				    System.out.print(c+" ");
					count+=1;                   //注意count+=1应写在输出质数之后，
					                            //若写在上面，则先计数还没输出质数就换行了，每行就只有七个
				 }
			    
			 
			 }
		
		
		 }
	
	}



}
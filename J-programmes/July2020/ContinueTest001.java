public class ContinueTest001{
    public static void main(String[] args){
	
	   for (int u=1;u<=10;u+=1){
	   
	       if (u==7){
		   
		      continue; 
		   
		   }
	   
	      System.out.println(u);
	   }
	
	   
	   
	   System.out.println("分割线~~~~~~~~~~~~~~~~~~~");

	   for1: for(int m=1;m<=5;m++){
	   
	            for2: for(int n=1;n<=10;n++){
				         if(n==3){
						 
						    continue for1;
						    
						 }
				
				         
				        System.out.println(n);  
				}    //此处连续输出5个“1,2”，   
	                 //因为里面的for循环到三就被continue命令去执行for1里的m++
	            
	   
	   }
	
	
	
	}



}
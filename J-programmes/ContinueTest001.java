public class ContinueTest001{
    public static void main(String[] args){
	
	   for (int u=1;u<=10;u+=1){
	   
	       if (u==7){
		   
		      continue; 
		   
		   }
	   
	      System.out.println(u);
	   }
	
	   
	   
	   System.out.println("�ָ���~~~~~~~~~~~~~~~~~~~");

	   for1: for(int m=1;m<=5;m++){
	   
	            for2: for(int n=1;n<=10;n++){
				         if(n==3){
						 
						    continue for1;
						    
						 }
				
				         
				        System.out.println(n);  
				}    //�˴��������5����1,2����   
	                 //��Ϊ�����forѭ�������ͱ�continue����ȥִ��for1���m++
	            
	   
	   }
	
	
	
	}



}
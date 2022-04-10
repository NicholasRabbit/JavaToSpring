public class IfTest005{
    public static void main(String[] args){
     
    java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.print("输入天气，下雨：1 晴天：0 :");
	byte weather=scan.nextByte();
	System.out.print("输入性别，男：1 女：0 :");
	byte gender=scan.nextByte();
	
	
	
		 
		 
		 if(weather==1){
               if(gender==1){
               System.out.println("黑色伞"); 
               }else if(gender==0){
               System.out.println("红色伞");
               }else{
			   System.out.println("请检查数据是否正确");
			   }
         }else if(weather==0){
					   System.out.print("输入温度");
					   byte degree=scan.nextByte();
					   
					   if(degree<=50&&degree>30){
						       if(gender==1){
							   System.out.println("戴墨镜");
							   }else if(gender==0){
							   System.out.println("带遮阳伞"); 
							   }
		 
		               }else if(degree>=-50&&degree<=30){
					           System.out.println("啥都不用带");
					   }else{
					           System.out.println("请检查数据是否正确");
					   }
		 }else{
		      System.out.println("参数错误！");
		 }



    
	            
	}

}
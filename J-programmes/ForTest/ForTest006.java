public class ForTest006{
   
   public static void main(String[] args){
   
      for(int m=1;m<=9;m++){                          //九九乘法标做法，注意k<=m，关键在m用法
		   for(int k=1;k<=m;k++){                    
			   System.out.print(m+"*"+k+"="+(m*k));   //此处称号等号用字符串，不要用单引号
		                                              //单引号是字符类型char
		   }
   
        System.out.print('\n');    //也可以写作：System.out.println();都有换行作用       
     }
   }
   
} 
   
 
   
  
public class BreakTest003{
    public static void main(String[] args){
	
	     for(int e=10;e>0;e-=1){
		 
		     for (int f=15;f>0;f--){
			 
			     if(f==7&e==8){              //注意e==8那次循环时输出的数据，另外注意此处逻辑与改为逻辑或的区别
				                             //逻辑与改为逻辑或，那么e==8那次循环时,f什么都不输出
				   break;
				 }
			 
			     
				 System.out.println(f);
			 }
		 
		    System.out.println(">>>>>>>>>>>"); 
		 }
	
	     System.out.println("以下逻辑或的情况");
		 
		 for(int e=10;e>0;e-=1){
		 
		     for (int f=15;f>0;f--){
			 
			     if(f==7|e==8){              
				                             //此处改改为逻辑或，那么e==8那次循环时,f什么都不输出
				   break;
				 }
			 
			     
				 System.out.println(f);
			 }
		 
		    System.out.println(">>>>>>>>>>>"); 
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



}
/*                                 
15
14
13
12
11
10
9
8
>>>>>>>>>>>    逻辑与外边for第八次结果
*/
/*15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
>>>>>>>>>>>       其他结果
*/
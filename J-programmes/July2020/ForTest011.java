public class ForTest011{
    public static void main(String[] args){
	     int m;
	      
		 for(m=2;m<=10;m++){
		 
		     for(int n=2;n<m;n++){
			     if(m%n==0){
				 
				   break;
				 
				 }
				 else{
				     System.out.println(m);  
			     }
			 }
		 }
	     

/* 求质数的输出结果 错误，找出问题在哪里,分析
   m,n 都不可取值1
   没有2是因为2n<m2进不来内层for循环
3  3%2!=0，在else里输出m=3
5  5除以2,3,4不等于零，else里的语句连续输出3次，下面7同理
5   
5
7
7
7
7
7
9  9先跟2求余数，进不去if里，然后跟3求余数，进去了，然后被break打断，因此后面的不执行了
   求质数关键在于一票否决制，即只要被一个数跟小于它的不是1的数整除，就不是质数，而且上面
   else语句嵌套在内层for循环里，连续输出，是错误的，需要用布尔表达式控制
*/

//求质数正确答案：

         System.out.println("分割线~~~~~~~~~~~~~~~~~~~");
		 int count=0;                  //每8个一换行加此行和下面语句,
		 for(int a=2;a<=100;a++){      //count=0不可写在,否则每次循环归零
		     
			 boolean beZhiShu=true;   //此处布尔   表达式要写在外层for循环里边
			 for(int b=2;b<a;b++){    //因为要持续赋值给下面的if语句，输出a的值
			     if(a%b==0){
				    beZhiShu=false;
					break;
				 
				 }
			 
			 }
		 
			 if(beZhiShu){
				  
				 System.out.print(a+" ");
				 count+=1;                 //每8个一换行，count自加一要写beZhiShu为真这里
			     if (count==8){            //若写在外边，则100内无论是否质数，都8个一循环
			     System.out.print('\n');   
				 count=0;                  //count==8可以写做count%8==0,最后的count=0归零要去掉
			     }
			 }                             
		     
		 
		 }
   






	}
}
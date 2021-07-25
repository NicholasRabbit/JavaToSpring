public class ForTest001{
   public static void main(String[] args){
      for(int a=0;a<10;a+=1){                 //此处可写a=++a或a++，不可写作a=a++，后者先赋值，后自加一，导致死循环
	      System.out.println(a);
	  }
	  System.out.println("~~~~~~~~~~~~~~~~");

	  
	  
	  int b;
	  for(b=0;b<20;b+=2){
	      if(b%2==0){                        //布尔运算等于一定用==，不能用一个等号=（属于赋值），否则会报错
		     System.out.println(b);
		  } 

	  }
	  
	  System.out.println("~~~~~~~~~~~~~~");


	  
	  int c=0;              //int c=0可以在外面赋值，for第一个分号前可以什么也不写
	  for(;c<10;c+=2){
	  System.out.println(c);
	  }


      

       

	  
   
   }


}

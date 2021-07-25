public class OperatorTest006{
    public static void main(String[] args){
    int a=10;
         a=a+10;
         System.out.println(a); 
         a+=15;
         System.out.println(a);
         a-=5;
         System.out.println(a);
         a*=2;
         System.out.println(a);
         a/=4;
         System.out.println(a); 
      byte b=20;
	       //b=b+30;               //此行编译报错，b+30是默认的int类型
		   b=(byte)(b+30);
		   System.out.println(b);  //结果50
		   b+=10;
		   System.out.println(b);  //结果60 

     
	 long g=100;
	 int  h=200;
	      h+=g;                    //结果300,此行等同于h=(int)(h+g);
		  System.out.println(h);

    


}


}
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
	       //b=b+30;               //���б��뱨��b+30��Ĭ�ϵ�int����
		   b=(byte)(b+30);
		   System.out.println(b);  //���50
		   b+=10;
		   System.out.println(b);  //���60 

     
	 long g=100;
	 int  h=200;
	      h+=g;                    //���300,���е�ͬ��h=(int)(h+g);
		  System.out.println(h);

    


}


}
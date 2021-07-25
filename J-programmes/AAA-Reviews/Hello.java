public class Hello{
   
   static byte h=20;

   public static void main(String[] args){
      
      System.out.println("Hello again!");

	  //int a;
	  //System.out.println(a);    //局部变量不赋值直接输出会报错。
	  
	  System.out.println(h);


	  System.out.println('\u4e2d'); //"中"字 
      num();
   
   }
   public static void num(){
       int a=010;                  //八进制以0开头
	   System.out.println(a);      //输出为默认的十进制，a为8
   
   }


}
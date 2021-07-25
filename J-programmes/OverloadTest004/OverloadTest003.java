public class OverloadTest003{
    public static void main(String[] args){
	   M.m01("Not at all.");
	   M.m01(true);
	   M.m01('S');
	   M.m01(20000L);
	
	
	}



}
class M{
   public static void m01(byte a){            //形式参数列表里的变量名字可以相同
       System.out.println(a);                 //因为是在不用方法里的，在不用作用域里，不冲突
   
   }
   public static void m01(short a){
       System.out.println(a);
   
   }
   public static void m01(char a){
       System.out.println(a);

   }
   public static void m01(int a){
       System.out.println(a);
   
   }
   public static void m01(long a){
       System.out.println(a);
   
   }
   public static void m01(float a){
       System.out.println(a);
   
   }
   public static void m01(double a){
       System.out.println(a);
   
   }
   public static void m01(String a){
       System.out.println(a);
   
   }
   public static void m01(boolean a){   
   
   }


}
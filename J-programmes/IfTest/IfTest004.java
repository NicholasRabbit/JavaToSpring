public class IfTest004{
    public static void main(String[] args){
       java.util.Scanner scan=new java.util.Scanner(System.in);
       System.out.print("您的身高：");   
       double  height=scan.nextDouble();
       
       String   nutritionalGrade="优良";
       
       if (height>=170&&height<=185) {
          nutritionalGrade="优良";
      }else if (height<170 && height>=150) {
          nutritionalGrade="一般";
      }else if (height<150) {
          nutritionalGrade="发育不良";
      }else {
          nutritionalGrade="数据错误或发育异常。";
      }
	   System.out.println("您的身体状况为: "+nutritionalGrade);          //注意最后输出String数据不要忘记编写
       
     
      


    }


}
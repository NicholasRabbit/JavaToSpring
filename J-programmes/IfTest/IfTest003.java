public class IfTest003{
   public static void main(String[] args){
   
   java.util.Scanner scan=new java.util.Scanner(System.in);
   System.out.print("输入成绩:");
   double score=scan.nextDouble();    //此处执行完毕后等待键盘输入； 
                                      //这就相当于把程序和输入端连起来了；
   String level="中等";               //输入的数据根据下行if语句，进行判断；
                                      //从而产生不同的结果
   
   
   if(score<=100&score>90){
      level="优等";  
   }else if(score<=90&score>70){
      level="中等";
   }else if(score<=70&score>=60){
      level="一般";
   }else{
      level="需加倍努力";
   } 
   System.out.println(level);
   
   
   
   }

}
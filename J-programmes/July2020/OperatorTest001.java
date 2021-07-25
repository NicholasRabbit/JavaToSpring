public class OperatorTest001{
  public static void main(String[] args){
      
	  
      int  a=100;
	  System.out.println(a++);   //结果100  系统中int=x,a++带入x则int=a++，先赋值运算，再做自加一运算
      System.out.println(a);      //结果101
	  
	  
	  int  b=200;
	  int  m=b++;
	  System.out.println("m: "+m);    //m输出值为200，m=b++中b先赋值给m再做自加一，因此下面输出b是201
	  System.out.println("b: "+b);

	  int  c=300;
	  //System.out.println(c++);    //此处结果300，因为系统调用int=c++
	  System.out.println(++c);


      
}



}
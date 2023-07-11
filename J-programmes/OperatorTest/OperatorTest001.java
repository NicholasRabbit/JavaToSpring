
/*
* Java中有六类运算符
* 1，算数运算符(Arithmetic Operators): +,-,*,/,%
* 2，赋值运算符(Assignment Operators): =,+=,-+,*=,/=,%=
* 3，关系运算符(Relational Operators): <,<=,>,>=,==,!=
* 4，逻辑运算符(Logical Operators): |,||,&,&&,!
* 5，自运算符(Unary Operators)：--,++,-(用于表示负数), +(表示正数，不常用)，!(用在布尔类型前取反)
* 6，位运算符(Bitwise Operators，仅适用于二进制数): ~,<<,>>,>>>,&,^
*
* 运算优先顺序(Precedence)
* 不用刻意记，用括号括住的优先计算。
*/

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
		  System.out.println("c: " + ++c);   //结果：301，系统底层是 int x = ++c，++在前面则先做自加1再赋值。


		  
	}



}
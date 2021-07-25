public class OperatorTest003{
    public static void main(String[] args){
    int  a=20;
    int  b=a++;
    System.out.println(a);  //此处结果为21，前面有a++自加1运算
    System.out.println(b);
	//此处结果为20，因为Java编译和运算是分开的进程，编译过程中只编译不运算；
	//而且运算顺序是，先做赋值运算，再做自加1运算，由于按顺序来说，前面a的数值20已经赋值给了b
	//后面才进行自加1，即前面的运算结果已经定了，后面a++的结果不会给于b。

	int c=20;
	int d=++c;
	System.out.println(c);    //结果21
	System.out.println(d);    //自加1号++在变量前面，则先进行自加1运算，再进行赋值，此处结果21


}


}
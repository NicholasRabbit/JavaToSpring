public class OperatorTest002{
    public static void main(String[] args){
    int a=20;
    int b=10;
    System.out.println(a<b&++a<b);    //此处逻辑与，后面算子进行计算，因此下行a结果为10
    System.out.println(a);             
    int c=20;
	int d=10;
	System.out.println(c<d&&++c<d);
	//此处短路与，由于前面算子结果为false,所以后面无论结果是什么，整个逻辑与结果都是false
	//所以按照Java的规定，后面算子被短路了，不做运算，下行c结果就为20
	System.out.println(c);






}


}
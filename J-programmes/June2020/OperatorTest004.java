public class OperatorTest004{
    public static void main(String[] args){
        int a,b;
		    a=10;
			b=20;
        System.out.println(a<b);

		int c,d,e;
		    c=100;
			d=200;
			e=100;
        System.out.println(b>a&c>d);
		System.out.println(c>=e|a>b); 
		System.out.println(c==e);
		System.out.println(c==b);
		System.out.println(!true);
		System.out.println(!false);   //"逻辑非"运算符“！”表示相反 
		System.out.println(c!=e);
		//"^"异或，只要两边不一样就是true,两边一样，得出结果为false见下例
		System.out.println(c<d^a>b);  //ture^false的异或，结果为true
		System.out.println(c==e^a<b);  
	    //上一行，true^true的异或，结果为false,注意此处c==e不可写一个等号“=”
		//一个等号是赋值运算，不是逻辑运算，编译会报错

        
}


}
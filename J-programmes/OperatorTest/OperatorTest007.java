public class OperatorTest007{
    public static void main(String[] args){
         int m=10;
         int n=20;
         System.out.println("10+20=30");
		 System.out.println("m+n="+(m+n));
		 System.out.println(10+20+"30");    //结果3030，+号按运算顺序从左到右，第一个+号是数值运算
                                            //第二个是字符串连接运算
         System.out.println(10+(20+"30"));  //结果102030，数值与字符串运算，+号都是字符串运算符
		                                    //最终结果还是字符串类型
             m=120;
			 n=130;
         System.out.println(m+"+"+n+"="+(m+n)); //要实现m,n个结果动态变化，按照此格式写,

}                                               //只有(m+n)里的是算术运算符，其它的都变成了字符链接符号



}
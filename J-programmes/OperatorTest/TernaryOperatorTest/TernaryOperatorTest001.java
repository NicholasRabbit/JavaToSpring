public class TernaryOperatorTest001 {

    public static void main(String[] args){
	
	    int a=10;
		int b=20;

		char chs=a<b ? '对': '错'; //三元运算符，a<b为真则取前面的值：'对'，否则取'错'
		                            //输出的结果必须是同一数据类型，本例的：'对'，'错'，否则编译不通过
		System.out.println(chs);    //判断a<b这个布尔表达式是否为真
	
	}

}
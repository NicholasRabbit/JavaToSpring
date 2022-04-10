public class DataType004{
    public static void main(String[] args){
        double  a=10/3;         //此处后面数据默认为int类型，计算结果为3，按double类型显示3.0
        double  b=10.0/3.0;     //此处后面数据为double类型，计算结果为3.3333333333333335
		
	    System.out.println(a);
        System.out.println(b);
		
		int c=10/3;             //此处输出为3，int整数类型

		System.out.println(c);  

}


}
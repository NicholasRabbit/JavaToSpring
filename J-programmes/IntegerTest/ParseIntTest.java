public class ParseIntTest {
   
    public static void main(String[] args){
	
	     int a=Integer.parseInt("120");   //parseInt()方法，Integer包装类里的静态方法，把字符串转换为int类型，
		 System.out.println(a);           

		 int b=Integer.parseInt("中国");  //实参不能是“中国”等非数字，否则抛出“NumberFormatException”异常。
		 System.out.println(b);
	
	}

}
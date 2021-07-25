import java.text.DecimalFormat;

public class DecimalFormatTest001{

    public static void main(String[] args){
	
	    DecimalFormat df=new DecimalFormat("###,###.##");  //#代表任意数字，只能用#，别的符号不行，这里创建对象，并设定数字格式，有参构造参数是String类型。
		String stNum=df.format(654321);                    //DecimalFormat类里的format()方法，把数字转换为设定的格式，返回值String类型。
		System.out.println(stNum);                         //654,321

		
		DecimalFormat df2=new DecimalFormat("###,###.0000");
		
		String stNum2=df2.format(654321);               //输出：654,321.0000
		System.out.println(stNum2);

		String stNum3=df2.format(654321.56);
		System.out.println(stNum3);                     //输出：654,321.5600

        String stNum4=df2.format(654321.56467);
		System.out.println(stNum4);                     //按照给定精度，四舍五入，输出：654,321.5647         
		
	}

}
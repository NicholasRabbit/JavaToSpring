import java.text.DecimalFormat;

public class DecimalFormatReview001 {

    public static void main(String[] args){
	
	    DecimalFormat df=new DecimalFormat ("####,####.##");
		String num=df.format(123456.00);
		System.out.println(num);

		DecimalFormat df2=new DecimalFormat ("####,####.0000");
		String num2=df2.format(123456);
		System.out.println(num2);
	}

}
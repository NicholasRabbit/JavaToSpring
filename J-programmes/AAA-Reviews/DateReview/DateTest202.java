import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateTest202 {

	public static void main(String[] args) {
	    Date d=new Date();
		System.out.println(d);

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd kk:mm:ss z");
		String time=sdf.format(d);
		System.out.println(time);

		String str="2021/02/14 09:30:30";  //把String类型日期转换为Date类型的
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
		
		try{
		   boolean isDate=sdf2.parse(str) instanceof Date;
		   System.out.println(isDate);
		   Date d2=sdf2.parse(str);
		   System.out.println(d2);	
		}catch (ParseException e){
		   String exception=e.getMessage();
		   System.out.println(exception);
		}

		//System.currentTimeMillis()的使用
		long millis=System.currentTimeMillis();
		System.out.println(millis);

		Date d3=new Date(millis);
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss z");
		String str2=sdf3.format(d3);
		System.out.println(str2);
	}

}
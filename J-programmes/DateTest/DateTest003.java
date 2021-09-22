import java.util.*;
import java.text.*;


public class DateTest003 {

	public static void main(String[] args){
		
		//复习
		long millis=System.currentTimeMillis();
		System.out.println(millis);

		Date date=new Date(millis);
		System.out.println("date==>" + date);

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
		String nowDate = sdf.format(date);
		System.out.println("nowDate==>" + nowDate);

		String str = sdf.format(System.currentTimeMillis());
		System.out.println("str==>" + str);

		
		//把毫秒数转化为时分秒
		SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
		long mm=140200;
		String hms=sdf2.format(mm);
		System.out.println("hms==>" + hms);
	}
}
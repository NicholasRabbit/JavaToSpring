import java.util.*;
import java.text.*;


public class DateTest003 {

	public static void main(String[] args){
		
		//复习
		long millis=System.currentTimeMillis();
		System.out.println(millis);

		//使用毫秒数计算今天的日期
		Date today=new Date(millis);
		//计算昨天的日期
		Date yesterday= new Date(System.currentTimeMillis() - 1000*60*60*24);
		System.out.println("today==>" + today);
		System.out.println("yesterday==>" + yesterday);

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
		String nowDate = sdf.format(today);
		System.out.println("nowDate==>" + nowDate);

		String str = sdf.format(System.currentTimeMillis());
		System.out.println("str==>" + str);

		
		//把毫秒数转化为时分秒
		SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));     //设置0时区，因为计算时间增量是以0时区为原点的，如果是GMT+08:00则结果加8小时
		long mm=140200;
		String hms=sdf2.format(mm);
		System.out.println("hms==>" + hms);
	}
}
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateTest002 {

    public static void main(String[] args) {
	
	    Date time1=new Date(2);  //实参2是long类型，毫秒数，表示从1970-1-1-00:00开始加上的毫秒数2之后的时间
		System.out.println(time1);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd,hh:MM:ss.SSS");
		String newtime=sdf.format(time1);
		System.out.println(newtime);      //1970-01-01,08:01:00.002 ,8点代表北京所处时区东八区

        Date time2=new Date(System.currentTimeMillis());  //从1970-1-1-00：00加上从那时起的毫秒数，即现在的时间，
		                                                  //也可以输入以前某个时间毫秒数，得出当时的日期
		
		//用SimpleDateFormat有参构造方法设置好时间格式，然后调用format(Date date)方法把Date类日期转化为此格式。
		String newTime2=sdf.format(time2);   
		System.out.println(newTime2);      //2020-11-06,01:11:39.180，时间待分析，格式对，但并非当前程序所在时区时间
                                           //原因，上面SimpleDateFormat中有参构造参数,分钟应该用mm
        
		//SimplrDateFormat里的parse(String str)方法,把String类型的日期转换为Date类型的,注意两者格式要一致
		String  strDate="2020-12-25-12:00";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd-hh:mm"); //格式一致
		try{
		   Date newDate=sdf2.parse(strDate);
		   System.out.println(newDate);
		}catch(ParseException e){
		   e.printStackTrace();
		}
		
		
	
	}

}
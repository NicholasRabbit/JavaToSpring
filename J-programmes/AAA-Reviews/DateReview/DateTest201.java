import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTest201 {

    public static void main(String[] args) throws Exception {
	
	    long l=System.currentTimeMillis();
		System.out.println(l);

		Date date=new Date(l-1000*60*60*24*5);
		System.out.println(date);

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String time=sdf.format(date);
		System.out.println(time);

		System.out.println("·Ö¸îÏß++++++++++++++");

		String time02="2021-2-13 20:00:00";
		SimpleDateFormat sdf02=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date02=sdf02.parse(time02);
		String newDate=sdf.format(date02);
		System.out.println(newDate);
	
	}

}
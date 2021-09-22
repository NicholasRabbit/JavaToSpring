import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class TimerTest001 {

    public static void main(String[] args){
	
	    //创建定时器对象
		Timer t=new Timer();
		//Timer t=new Timer(true);  //如果有参构造为true，则是以守护线程的方式执行

		//日期格式化，并把String类型的日期转换为Date类型的
		String executeDate="2021-2-17 16:52:00"; 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		try{
		  Date d=sdf.parse(executeDate);
		  System.out.println(d);
		  MyTimerTask mt=new MyTimerTask();
		  t.schedule(mt, d, 1000*5);    //每隔5秒执行一次定时任务
		}catch(ParseException e){
		  e.printStackTrace();
		}
		
	}

}

//实际定时任务就相当于一个线程一样，只是定时执行
class MyTimerTask extends TimerTask {

    public void run(){
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date=new Date();
		String strDate=sdf.format(date);
		System.out.println(strDate+"执行一次定时任务");
	}
}
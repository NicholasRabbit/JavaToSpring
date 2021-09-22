import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class TimerTest001 {

    public static void main(String[] args){
	
	    //������ʱ������
		Timer t=new Timer();
		//Timer t=new Timer(true);  //����вι���Ϊtrue���������ػ��̵߳ķ�ʽִ��

		//���ڸ�ʽ��������String���͵�����ת��ΪDate���͵�
		String executeDate="2021-2-17 16:52:00"; 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		try{
		  Date d=sdf.parse(executeDate);
		  System.out.println(d);
		  MyTimerTask mt=new MyTimerTask();
		  t.schedule(mt, d, 1000*5);    //ÿ��5��ִ��һ�ζ�ʱ����
		}catch(ParseException e){
		  e.printStackTrace();
		}
		
	}

}

//ʵ�ʶ�ʱ������൱��һ���߳�һ����ֻ�Ƕ�ʱִ��
class MyTimerTask extends TimerTask {

    public void run(){
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date=new Date();
		String strDate=sdf.format(date);
		System.out.println(strDate+"ִ��һ�ζ�ʱ����");
	}
}
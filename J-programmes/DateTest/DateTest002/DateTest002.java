import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateTest002 {

    public static void main(String[] args) {
	
	    Date time1=new Date(2);  //ʵ��2��long���ͣ�����������ʾ��1970-1-1-00:00��ʼ���ϵĺ�����2֮���ʱ��
		System.out.println(time1);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd,hh:MM:ss.SSS");
		String newtime=sdf.format(time1);
		System.out.println(newtime);      //1970-01-01,08:01:00.002 ,8�����������ʱ��������

        Date time2=new Date(System.currentTimeMillis());  //��1970-1-1-00��00���ϴ���ʱ��ĺ������������ڵ�ʱ�䣬
		                                                  //Ҳ����������ǰĳ��ʱ����������ó���ʱ������
		
		//��SimpleDateFormat�вι��췽�����ú�ʱ���ʽ��Ȼ�����format(Date date)������Date������ת��Ϊ�˸�ʽ��
		String newTime2=sdf.format(time2);   
		System.out.println(newTime2);      //2020-11-06,01:11:39.180��ʱ�����������ʽ�ԣ������ǵ�ǰ��������ʱ��ʱ��
                                           //ԭ������SimpleDateFormat���вι������,����Ӧ����mm
        
		//SimplrDateFormat���parse(String str)����,��String���͵�����ת��ΪDate���͵�,ע�����߸�ʽҪһ��
		String  strDate="2020-12-25-12:00";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd-hh:mm"); //��ʽһ��
		try{
		   Date newDate=sdf2.parse(strDate);
		   System.out.println(newDate);
		}catch(ParseException e){
		   e.printStackTrace();
		}
		
		
	
	}

}
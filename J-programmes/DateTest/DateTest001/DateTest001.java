
import java.util.Date;                 //Date������java.util����ģ����ֶ����룬����java.lang���µ��Զ������ࡣ
import java.text.SimpleDateFormat;     //SimpleDateFormat����java.text�����

public class DateTest001 {

    public static void main(String[] args) throws Exception {
	
	    
		//Date����ת��ΪString�������,��Ϊ��д��toString����
		Date  time=new Date();     //������Date����
		System.out.println(time);  //���ʱ�䣬Ĭ�ϸ�ʽ��Thu Oct 29 14:22:40 CST 2020��time��Date�����ã�û�����Ĭ�ϵ�ַ��˵��Date������д��toString������

		
		SimpleDateFormat  sd=new SimpleDateFormat("yyyy��MM��dd��");  //�趨������ڸ�ʽ,ע�⣺yyyy������д��λ��MM,ddͬ���⼸����ĸ�ǹ̶���ʽ���������ֿ��Զ���

		String newDate=sd.format(time);  //������Date�����time��Ϊ���ָ�ʽ������ֵStringBuffer���� 
		System.out.println(newDate);     //�����2020��10��29��


		//String����ת��ΪDate����
		String newTime="2020-9-10-02:30:25.656";
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss.SSS");
		Date newDate2=sdf.parse(newTime);
		
		System.out.println(newDate2);   //���Thu Sep 10 02:30:25 CST 2020  ,��ʽ���趨��ʽ��һ�£���Ϊ��û��ʹ��String newDate=sdf.format(newDate2)
		                                //ע��ǰ��main������throws Exception�������޷����룬ԭ����潲��
        


	
	}

}
public class OverloadTest004{
    public static void main(String[] args){
	     Revoke001.r("Hello");       //ֱ�ӿ��ļ�����Revoke001��ķ�����Revoke001�����ȱ���ſɽ��е���
		 Revoke001.r('A');
		 Revoke001.r(true);
		 Revoke001.r(50.0);
		 Revoke001.r(2000L);
		 Revoke001.r(1000000000);    //�˴������Զ�ת��Ϊ��Ӧ�������������ͣ��Ӷ����ö�Ӧ�ķ���
		 Revoke001.r("�򵥷�װ���������");
	
	}



}
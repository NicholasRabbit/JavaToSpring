
//StringBuffer���̰߳�ȫ�ģ�StringBuilder���̰߳�ȫ

public class StringBufferTest001 {

    public static void main(String[] args){
	
	    StringBuffer sb=new StringBuffer();   //ƴ���ַ�����Ч�ʣ���ʡ�ڴ淽��������StringBuffer����Ĭ������������16��byte[]���飬
		sb.append("a");                       //����StringBuffer�����append()����,
		sb.append("b");                       //append()�����ײ������valueOf()�������������������ݶ�ת��Ϊ���ַ�����
		sb.append(true);
		sb.append(1234567890);                //��������ʱ���ײ�����ensureCapacity()�������ݡ�
		System.out.println(sb);

		
		StringBuffer sb1=new StringBuffer(20);  //Ҳ�ɵ����вι��죬�Զ��������Ż�����������Ԥ��׼ȷ�����������Զ��������������ݴ�����
	    sb1.append("HelloAgain");               //StringBuffer����ķ�����synchronized�ؼ������ε�
		sb1.append('=');
		sb1.append(2020);
		System.out.println(sb1);

		StringBuilder sbx=new StringBuilder(10);    //StringBuilder�÷���StringBuffer�÷�һ����
		sbx.append("������й�");                   //ֻ��StringBuffer����ķ�����synchronized�ؼ������εģ�������̰߳�ȫ����StringBuilderû�С�
		System.out.println(sbx); 
	}

}
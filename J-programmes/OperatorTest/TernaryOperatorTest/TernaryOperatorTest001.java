public class TernaryOperatorTest001 {

    public static void main(String[] args){
	
	    int a=10;
		int b=20;

		char chs=a<b ? '��': '��'; //��Ԫ�������a<bΪ����ȡǰ���ֵ��'��'������ȡ'��'
		                            //����Ľ��������ͬһ�������ͣ������ģ�'��'��'��'��������벻ͨ��
		System.out.println(chs);    //�ж�a<b����������ʽ�Ƿ�Ϊ��
	
	}

}
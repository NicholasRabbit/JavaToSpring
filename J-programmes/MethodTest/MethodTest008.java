public class MethodTest008{
	public static void main(String[] args){
	     int a=10;
		 MethodTest008.method(a);              //�����ֲ�����a�����ظ�����������һ���������ڣ�����ͻ
		 System.out.println("main>>>"+a);      //�˴����aΪ10����Ϊmethod�ŷ�������֮��
                                               //�ͽ����ˣ��ڴ���ͷ��ˣ��˴�a��û�н��յ�
         int b=20;
		     
         int c=method02(b);
		 System.out.println("method02: "+c);   //�˴������˷���ֵ����c���Ϊ21.
	
	}
	public static void method(int a){
	     a++;
		 System.out.println("Method>>>"+a);   //�˴����aΪ11��
	
	}
	public static int method02(int b){
	     b++;
		 return b;
	
	}



}
public class ParseIntTest {
   
    public static void main(String[] args){
	
	     int a=Integer.parseInt("120");   //parseInt()������Integer��װ����ľ�̬���������ַ���ת��Ϊint���ͣ�
		 System.out.println(a);           

		 int b=Integer.parseInt("�й�");  //ʵ�β����ǡ��й����ȷ����֣������׳���NumberFormatException���쳣��
		 System.out.println(b);
	
	}

}
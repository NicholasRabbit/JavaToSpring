public class OperatorTest007{
    public static void main(String[] args){
         int m=10;
         int n=20;
         System.out.println("10+20=30");
		 System.out.println("m+n="+(m+n));
		 System.out.println(10+20+"30");    //���3030��+�Ű�����˳������ң���һ��+������ֵ����
                                            //�ڶ������ַ�����������
         System.out.println(10+(20+"30"));  //���102030����ֵ���ַ������㣬+�Ŷ����ַ��������
		                                    //���ս�������ַ�������
             m=120;
			 n=130;
         System.out.println(m+"+"+n+"="+(m+n)); //Ҫʵ��m,n�������̬�仯�����մ˸�ʽд,

}                                               //ֻ��(m+n)���������������������Ķ�������ַ����ӷ���



}
public class ParameterTest001{
    public static void main(String[] args){
	     int m=10;
		 ParameterTest001.sum(m);               //�������ݣ���Զֻ������ֵ��
		 System.out.println("main------>"+m);   //���10��

	
	}
	public static void sum(int m){
	     m++;
		 System.out.println("sum------->"+m);   //���11��
	
	}

}
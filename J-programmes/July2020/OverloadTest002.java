public class OverloadTest002{
    public static void main(String[] args){
	    
		OverloadTest002.sum();
		OverloadTest002.sum(20);
        System.out.println("�ָ���~~~~~~~~~~~~~~~~~~~~~~~~~");
        /*
		sum02(30,40);                          //�˴��޷��������淽������������
		*/
	
	
	}
	
	public static void sum(){
	   
	   System.out.println("sum:overload01");
	
	}
    public static void sum(int u){
	   
	   System.out.println("sum:overloda02+"+u);
	}
	
	
	/*
	public static int sum02(int v, int w){       //�˴�����������������ֵ���Ͳ�ͬ�������������������б���ͬ
	     return v+w;                             //����޷����з�������,����ĳ���Ҳ�޷�����
	}                                            //���������뷵��ֵ�����޹أ�������ֵ����һ����һ��������Ӱ������
	public static double sum02(int x, int y){    //���������Ͳ����б������������
	      double z=x+y;
		  System.out.println(z);
	     return z;
	}
	*/

}
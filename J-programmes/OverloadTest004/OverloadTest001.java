public class OverloadTest001{
    public static void main(String[] args){       //�ܽᣬ���������뷽������������������й�
	  int x=OverloadTest001.sum(10,20);           //���������񷵻�ֵ���ͣ����η��б���޹�
	  System.out.println(x);
	  
	  double y=OverloadTest001.sum(10.0,20.0);    //��������ʡ��
	  System.out.println(y);
	  
	  long z=sum(20L,30L);                        
	  System.out.println(z);
	
	}
	public static int sum(int a,int b){
	    return a+b;
	
	}
	public static double sum(double c,double d){
	     return c+d;
	   
	}
	public static long sum(long e,long f){
	    return e+f;
	   
	}




}
public class DataTest102{
    
	public static void main(String[] args){
	
	     DataTest102.dataTest04();

		             dataTest05();
	}
	
	public static void dataTest04(){
	     byte m=127;

		 int  a=30;
		 //byte b=a/3;             //���б���java Complier����ʱ�������㣬ֻ����﷨��
		                           //��Ϊa��int���ͣ�int����������ֵ����byte��Χ�����Ա���
		 System.out.println(m);
		 //System.out.println(b);
	
	}

	public static void dataTest05(){
	    
		long q=100;
		//byte r=(byte)q/4;         //���д���ӦΪ4����int���ͣ�ǰ��������ôת������4������ֱ��int����
		byte r=(byte)(q/4);
		System.out.println(r);
	
	}

}
public class Day10Work04 {

    public static void main(String[] args){
	
	    long distance=Day10Work04.basketball(100);
			System.out.println(distance);

	}

	public static long basketball(int x){
	    
		int k=x;  //��ʼ�߶�
		int j=x;  //�ۼӾ����ʼֵ����100�����£��ü���100�ס�
		int n=1;
		while(n<10){
		   k/=2;
		   j+=k;
		   n++;
		}

		return j;    //ע�⣺�����int�����Զ�ת��Ϊlong���͵Ĺ��̡�

	
	}

}
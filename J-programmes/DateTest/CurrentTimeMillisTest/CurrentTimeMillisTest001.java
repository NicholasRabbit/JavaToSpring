public class CurrentTimeMillisTest001 {

    public static void main(String[] args){
	
	    long begin=System.currentTimeMillis();    //System���ﾲ̬����currentTimeMillis,�����1970-1-1 0:00.000����ǰִ��ʱ�ĺ�����
		System.out.println(begin);                //��ʼʱ��
		
		long proceedingTime=method(begin);
		System.out.println(proceedingTime);       //��;����������forѭ���������ʱ��
	}

	public static long method(long begin){
	
	    for(int a=0;a<1000000;a++){
		    
		}
	    
		long finish=System.currentTimeMillis();
		System.out.println(finish);              //����ʱ��
		
		return finish-begin;
	}

}
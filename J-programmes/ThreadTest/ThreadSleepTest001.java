//�߳����߷���sleep(long millis)��ϰ�����Ǹ���̬����

public class ThreadSleepTest001 {

    public static void main(String[] args){
	
	    try{
		   System.out.println("5������߳����");
		   Thread.sleep(1000*5);              //�����ĵ�λ�Ǻ��룬������5000����=5��
		   System.out.println("���߳����");  //��̬����sleep()�������ĸ��̣߳��ĸ��߳̾�����

		  
		}catch(InterruptedException e){
		   e.printStackTrace();
		}

		sleepMethod(1000*3);   //����Ҳ�ǵ���sleepMethod()����,�������߳�
		      
	}

	public static void sleepMethod(long millis){
        int i=0;
		while( i<10){
		    try{
				Thread.sleep(millis);      //whileѭ��ÿ��3�����һ�� 
				System.out.println("���߳����߲������=>"+i);
								
			}catch(InterruptedException e){
			    e.printStackTrace();
			}

			i++;
		}
	}

}
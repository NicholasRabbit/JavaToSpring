//�߳�˯�ߵķ���public static void sleep()��Thread����ľ�̬������������Thread.sleep(long millis)����
//��������������ĸ��߳̾������ĸ��̣߳�
//��������߳����÷��̵߳����õ��ã�����t.sleep(long millis)������Ҳ��ͨ������ʵ�ʻ������ߵĵ�ǰ�߳�
public class ThreadSleepTest002 {

    public static void main(String[] args){
	     
		 Runnable r=new MyThread002();
	     Thread t=new Thread(r);
         
		 t.start();
         try{
		     for(int i=0; i<10; i++){
		     t.sleep(1000*5);       //�����õ��þ�̬����sleep(..)��ʵ�ʸ�Thread.sleep(..)Ч��һ���������������̣߳�
			                        //����������t������ָ��ķ��̡߳�
			 System.out.println("���߳������ "+i);
			 }
		 }catch(InterruptedException e){
		     e.printStackTrace(); 
		 }

		
		 
	}

}

class MyThread002 implements Runnable {

    public void run(){
	  
	            
	}

}
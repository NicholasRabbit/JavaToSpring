//��ֹ�̵߳ķ���:ʵ��������t.stop()
//�˷��������ã���Ϊ������ǿ����ֹ�̣߳���������ݶ�ʧ��
public class ThreadStopTest001 {

    public static void main(String[] args){
	
	   MyRunnable002 mr=new MyRunnable002();
	   Thread t=new Thread(mr);
       t.setName("MR002");
	   t.start();            //����MR002���߳�
	   
	   try{
	     Thread.sleep(1000*3);   //���߳�����3����������stop()������ֹ���߳�  
	   }catch(InterruptedException e){
	     e.printStackTrace();
	   }
	   
	   t.stop();     
	}

}

class MyRunnable002 implements Runnable {

    public void run(){
	    int i=0;
		while (i < 1000000){
		    System.out.println("���ƣ�"+Thread.currentThread().getName()+":���߳����==>"+i);
			i++;
		}
	}

}
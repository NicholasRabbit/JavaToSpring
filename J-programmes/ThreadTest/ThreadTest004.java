
//�̵߳�Ĭ�����֣�Thread0,1,2,3����
//�޸��߳����֣�mt.setName(String name);
//��ȡ�߳����֣� mt.getName()  =>  public final String getName()
//��ȡ��ǰ�̶߳���Thread t=Thread.currentThread(); ��̬����
public class ThreadTest004 {

    public static void main(String[] args){
	
	    MyThread mt01=new MyThread();    
		String threadName=mt01.getName();    //setName(),getName()�Ǹ���Thread��final���εķ��������Ա��̳У����ܱ���д��
		System.out.println(threadName);

		mt01.setName("�߳�01");
		System.out.println(mt01.getName());

		mt01.start();

		MyThread mt02=new MyThread();   //�̶߳���MyThread���Զ��new�½������Ǹ��µķ�֧�߳�
        mt02.setName("�߳�02");         //�������̵߳�����
		System.out.println(mt02.getName());


	
	}

}

class MyThread extends Thread {

    public void run(){
	
	   Thread mt01=Thread.currentThread();   //��ȡ��ǰ�̶߳���������д����ʹ����ȡ�ĸ��̵߳Ķ�������
	   System.out.println(mt01.getName());

	  
	}

}
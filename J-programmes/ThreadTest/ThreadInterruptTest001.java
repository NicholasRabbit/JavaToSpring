//�߳����ߵĻ��ѣ�����ֹ�߳�����
public class ThreadInterruptTest001 {

    public static void main(String[] args){
	    MyThread003 mt=new MyThread003();
		Thread t=new Thread(mt);
		t.setName("���߳�t");
		t.start();

 		t.interrupt();    //sleep()�������׳�InterruptedException����interrupt()������������������ص�����ֹ�߳�����
                          //��Ϊ�쳣�׳�����try,catch������������Ҳ�ͽ�����	    
	}

}

class MyThread003 implements Runnable {

    public void run(){
	    System.out.println(Thread.currentThread().getName()+":�߳̿�ʼ");
		try{
		    Thread.sleep(1000*60*60);  //����һ��Сʱ
			//System.out.println("�߳�������ֹ");      //����Test����ʹ��t.interrupt()�����Ժ����������򲻻����
		}catch(InterruptedException e){                //��Ϊinterrupt()ʹ�õ����쳣�����������̣߳���ֹ�����ߣ����쳣�Ժ�����ľͲ���ִ����
		    String str=e.getMessage();   //����Ҳ���Ե���e.getMessage()�����������ַ�����Ȼ�����
			System.out.println(str);
		}
		System.out.println(Thread.currentThread().getName()+":�߳���ֹ����");
	}

}
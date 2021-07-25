//Object���Դ����߳̿�����ص�wait(),notify()����������ϰ

public class WaitNotifyTest001 {

    public static void main(String[] args){
	
	   User u=new User();
	   MyRunnable  mr01=new MyRunnable(u);
	   MyRunnable  mr02=new MyRunnable(u);
	   Thread t01=new Thread(mr01);
	   t01.start();
	}
 
}

class MyRunnable implements Runnable {
    User u;

	public MyRunnable(){}
	public MyRunnable (User u){
	    this.u=u;
	}

    public void run(){
	    u.userMethod();
	}
}

class User {

	public synchronized void userMethod(){   //wait()����Ҫ��synchronized���ã������׳�IllegalMonitorException
	    System.out.println("start");
		
		try{
		   this.wait();   //wait()����һ��ִ�У��ڶ������õ��߳̾ͽ����˶����������߳̾ʹ��ڵȴ��ľ���״̬
		}catch(InterruptedException e){
		   e.printStackTrace();
		}
		
		try{
		    Thread.sleep(1000*3);
		}catch(InterruptedException e){
		    e.printStackTrace();
		}

		//����notify()����ִ��ǰ���߳�����wait()���������Ѿ�����ȥ�ˣ�
		//������һֱ�����������������soutһֱ��ִ��
		this.notify();   //ע������this.notify()�ǻ�����������wait���̣߳����ǵ�ǰ�߳�t01,��ǰ�߳��Ѿ��������ˣ�û��������User�����ϣ���Ҫ�������߳�������
						 //���հ����ĵ�����WaitNotifyTest002.java����
	    System.out.println("finish");	 
	}
}
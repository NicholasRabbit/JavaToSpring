//�ػ��̴߳���ʵ�ַ�����һ���û��߳̽������ػ��߳�Ҳ������������ʹ�ػ��߳�������ѭ��Ҳ�����

public class DaemonTest001 {

    public static void main(String[] args){
		DaemonThread dt=new DaemonThread();
		Thread t=new Thread(dt);
		t.setName("�ػ��߳�t");
		
		t.setDaemon(true);  //�����ػ��̣߳��˾����д��t.start()֮ǰ
		
		t.start();

		
		for(int i=0;i<10;i++){
		    try{
			   Thread.sleep(1000*2);
			   System.out.println("���̣߳�"+Thread.currentThread().getName()+"ִ��");
			}catch(InterruptedException e){
			   e.printStackTrace();
			}
			
		}
		
	}

}

class DaemonThread implements Runnable {

    public void run(){
	    int i=0;
		while(true){    //��ʹ�ػ��߳�������ѭ����䣬һ���û��߳̽������ػ��߳�Ҳ����   
		    try{
			  Thread.sleep(1000*1);
			  System.out.println(Thread.currentThread().getName()+"����ִ��");
			  i++;
			}catch(InterruptedException e){
			  e.printStackTrace(); 
			}
			
		}
	}
}
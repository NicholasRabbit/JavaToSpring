public class User {

	public synchronized static  void doSome(){   //��̬����
	     Thread t=Thread.currentThread();
		 for(int i=0; i<10; i++){
		     try{
			    Thread.sleep(1000);
			 }catch(InterruptedException e){
			    e.printStackTrace();
			 }
			 System.out.println("�߳����ƣ�"+t.getName()+"�߳�ִ��:doSome=>"+i);
		 }
	}

	public synchronized void doOther(){   //ʵ������
	     Thread t=Thread.currentThread();
		 for(int i=0; i<10; i++){
		     try{
			    Thread.sleep(1000);
			 }catch(InterruptedException e){
			    e.printStackTrace();
			 }
			 System.out.println("�߳����ƣ�"+t.getName()+"�߳�ִ��:doOther=>"+i);
		 }
	}
	

}
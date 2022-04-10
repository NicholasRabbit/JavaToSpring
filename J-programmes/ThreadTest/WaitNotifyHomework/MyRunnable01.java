public class MyRunnable01 implements Runnable {

	User u;
	public MyRunnable01(){
	
	}
	public MyRunnable01(User u){
	    this.u=u;
	}
	public void run(){
		synchronized(u){
			while(true){
				int j=u.getI();
				if(j%2 != 0){
				    try{
					   u.wait();	
					}catch(InterruptedException e){
					   e.printStackTrace();
					}
				}
				
				//����������д��else���棬�������һ���߳�����������ݵ����
				System.out.println(Thread.currentThread().getName()+"���"+u.getI());
				u.setI(++j);
				u.notify();	  			
			}
		}
	}
}
//守护线程代码实现范例，一旦用户线程结束，守护线程也立即结束，即使守护线程有无限循环也会结束

public class DaemonTest001 {

    public static void main(String[] args){
		DaemonThread dt=new DaemonThread();
		Thread t=new Thread(dt);
		t.setName("守护线程t");
		
		t.setDaemon(true);  //设置守护线程，此句必须写在t.start()之前
		
		t.start();

		
		for(int i=0;i<10;i++){
		    try{
			   Thread.sleep(1000*2);
			   System.out.println("主线程："+Thread.currentThread().getName()+"执行");
			}catch(InterruptedException e){
			   e.printStackTrace();
			}
			
		}
		
	}

}

class DaemonThread implements Runnable {

    public void run(){
	    int i=0;
		while(true){    //即使守护线程有无限循环语句，一旦用户线程结束，守护线程也结束   
		    try{
			  Thread.sleep(1000*1);
			  System.out.println(Thread.currentThread().getName()+"进程执行");
			  i++;
			}catch(InterruptedException e){
			  e.printStackTrace(); 
			}
			
		}
	}
}
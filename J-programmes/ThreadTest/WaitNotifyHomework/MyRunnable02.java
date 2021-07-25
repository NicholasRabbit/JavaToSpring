public class MyRunnable02 implements Runnable {

	User u;
	public MyRunnable02(){
	
	}
	public MyRunnable02(User u){
	    this.u=u;
	}
	public void run(){
		synchronized(u){
			while(true){
				int j=u.getI();
				if(j%2 == 0){
				    try{
					   u.wait();	
					}catch(InterruptedException e){
					   e.printStackTrace();
					}
				}
				
	 		    //以下三行需写在else里面，否则出现一个线程输出两次数据的情况
				System.out.println(Thread.currentThread().getName()+"线程"+u.getI());
				u.setI(++j);
				u.notify();				
			}
		}
	}
}
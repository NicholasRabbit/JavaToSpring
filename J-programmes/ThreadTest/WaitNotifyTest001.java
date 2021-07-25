//Object里自带与线程控制相关的wait(),notify()方法个人练习

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

	public synchronized void userMethod(){   //wait()方法要和synchronized连用，否则抛出IllegalMonitorException
	    System.out.println("start");
		
		try{
		   this.wait();   //wait()方法一旦执行，在对象作用的线程就交出了对象锁，该线程就处于等待的就绪状态
		}catch(InterruptedException e){
		   e.printStackTrace();
		}
		
		try{
		    Thread.sleep(1000*3);
		}catch(InterruptedException e){
		    e.printStackTrace();
		}

		//这里notify()方法执行前，线程锁在wait()方法那里已经交出去了，
		//这里在一直等锁，所以下面语句sout一直不执行
		this.notify();   //注意这里this.notify()是唤醒其它正在wait的线程，不是当前线程t01,当前线程已经交出锁了，没有作用在User对象上，需要其它的线程来唤醒
						 //参照帮助文档，及WaitNotifyTest002.java范例
	    System.out.println("finish");	 
	}
}
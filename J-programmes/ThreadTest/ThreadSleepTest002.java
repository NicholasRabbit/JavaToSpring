//线程睡眠的方法public static void sleep()是Thread类里的静态方法，用类名Thread.sleep(long millis)调用
//这个方法出现在哪个线程就休眠哪个线程；
//如果在主线程里用分线程的引用调用，例，t.sleep(long millis)，编译也可通过，但实际还是休眠的当前线程
public class ThreadSleepTest002 {

    public static void main(String[] args){
	     
		 Runnable r=new MyThread002();
	     Thread t=new Thread(r);
         
		 t.start();
         try{
		     for(int i=0; i<10; i++){
		     t.sleep(1000*5);       //用引用调用静态方法sleep(..)，实际跟Thread.sleep(..)效果一样，休眠其所在线程，
			                        //并不会休眠t引用所指向的分线程。
			 System.out.println("主线程输出： "+i);
			 }
		 }catch(InterruptedException e){
		     e.printStackTrace(); 
		 }

		
		 
	}

}

class MyThread002 implements Runnable {

    public void run(){
	  
	            
	}

}
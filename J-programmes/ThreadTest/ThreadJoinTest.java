//join()方法的使用范例
public class ThreadJoinTest {

    public static void main(String[] args){
	
	    MyRunnable005 mr=new MyRunnable005();
		Thread t=new Thread(mr);
		t.start();

		System.out.println("主线程开始");

		try{  //此处使用join()方法表示把分线程t合并到主线程main里边，直到分线程t执行完，主线程下面的语句才会输出
		    t.join(); 
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
		
		System.out.println("主线程结束");   
	}

}

class MyRunnable005 implements Runnable {

    public void run(){
	    for(int i=0; i<100; i++){
		   Thread currentThread=Thread.currentThread();
		   System.out.println(currentThread.getName()+"执行=>"+i); 
		}
	}
}
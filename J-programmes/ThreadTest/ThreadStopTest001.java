//终止线程的方法:实例方法，t.stop()
//此方法不常用，因为这属于强行终止线程，会造成数据丢失。
public class ThreadStopTest001 {

    public static void main(String[] args){
	
	   MyRunnable002 mr=new MyRunnable002();
	   Thread t=new Thread(mr);
       t.setName("MR002");
	   t.start();            //启动MR002分线程
	   
	   try{
	     Thread.sleep(1000*3);   //主线程休眠3秒后，下面调用stop()方法终止分线程  
	   }catch(InterruptedException e){
	     e.printStackTrace();
	   }
	   
	   t.stop();     
	}

}

class MyRunnable002 implements Runnable {

    public void run(){
	    int i=0;
		while (i < 1000000){
		    System.out.println("名称："+Thread.currentThread().getName()+":分线程输出==>"+i);
			i++;
		}
	}

}
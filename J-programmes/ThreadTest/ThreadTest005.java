import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

//第三种实现线程的方法及步骤:  这种创建线程方式的优点，可以获得线程执行结果，通过FutureTask引用来调用get()方法
//即:futureTask.get()，注意不是用线程引用来调
//步骤1，首先新建一个类继承Callable接口，
//步骤2，把上步骤1的类new个对象放到FutrueTask有参构造参数里边；
//步骤3,把步骤2的FutureTask类new个对象放到Thread有参构造里边即可。
//启动，t.start();
//获取线程执行结果futureTask.get()
public class ThreadTest005 {

    public static void main(String[] args){
	
	    Callable c=new MyCallable();
		FutureTask futureTask=new FutureTask(c);  //FutureTask<V>新建对象时也可加泛型
		Thread t=new Thread(futureTask);          //FutureTask类继承了接口Runnable,因此可放到Thread类有参构造new Thread(Runnable r)里         
		
		System.out.println("主线程开始");

		try{
		  t.start();           //调用start()方法启动线程，因为JVM会执行call()方法，有异常抛出，所以这里要捕捉
		}catch(Exception e){
		  e.printStackTrace();
		}

        try{
		   //这里调用futureTask.get()方法会造成所在主线程阻塞，有异常要捕捉
		   //t.start()的线程执行完才会获取结果，因此这种方式可用于闭锁，见JUC的CountDownLatch相关代码
		   //线程执行完才会获取结果，因此这种方式可用于闭锁，见JUC的CountDownLatch相关代码
		   Object retValue=futureTask.get();  
		   System.out.println(retValue); 
		}catch(InterruptedException | ExecutionException e ){
			e.printStackTrace();
		}

		System.out.println("主线程结束");


	}

}

class MyCallable implements Callable {

	   public Object call() throws Exception {   //这里call()方法相当于之前创建线程的run()方法，t.start()执行，
												 //JVM会自动执行这个call()方法	      
		 try{
		    Thread.sleep(1000*5);
		 }catch(InterruptedException e){
		    e.printStackTrace();
		 }

		 Object obj=new Object();
		 return obj;
       }
	
}
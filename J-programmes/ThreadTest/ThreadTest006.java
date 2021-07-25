import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ExecutionException;

/*第三种创建线程的方式，带有泛型的写法，本例同时也测试sleep(millis)方法
   注意自己创建的类MyCallable可不加泛型，要给MyCallable加都加，要不加都不加
*/
public class ThreadTest006 {

	public static void main(String[] args){
		Callable<String> mc=new MyCallable();  
		FutureTask<String> ft=new FutureTask<>(mc);
		Thread mt=new Thread(ft);

	
			mt.start();
		
	}
}

class MyCallable implements Callable<String> {
	public String call(){
	
		try{
			for(int i=0;i<20;i++){
			Thread.sleep(1000*2);  //休息每两秒输出一次
			System.out.println("分线程每两秒输出"+i);
		    }
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		

		return "awesome";
	}
}
//线程休眠方法sleep(long millis)练习，这是个静态方法

public class ThreadSleepTest001 {

    public static void main(String[] args){
	
	    try{
		   System.out.println("5秒后主线程输出");
		   Thread.sleep(1000*5);              //参数的单位是毫秒，这里是5000毫秒=5秒
		   System.out.println("主线程输出");  //静态方法sleep()出现在哪个线程，哪个线程就休眠

		  
		}catch(InterruptedException e){
		   e.printStackTrace();
		}

		sleepMethod(1000*3);   //这里也是调用sleepMethod()方法,休眠主线程
		      
	}

	public static void sleepMethod(long millis){
        int i=0;
		while( i<10){
		    try{
				Thread.sleep(millis);      //while循环每隔3秒输出一次 
				System.out.println("主线程休眠测试输出=>"+i);
								
			}catch(InterruptedException e){
			    e.printStackTrace();
			}

			i++;
		}
	}

}
//创建分线程的第一个方法：
//第一步：新建一个类，继承java.lang.Thread
//第二步：在主线程中创建这个类的对象，并调用对象内的satrt()方法，start()方法启动后瞬间结束
//        主线程for循环和分线程for循环同时执行
public class ThreadTest001 {

    public static void main(String[] args){
	
	    MyThread mt=new MyThread();
		
		//mt.run();     //不能调用对象内的run()方法来启动，这样还是单线程，还是在main方法栈里，没有开辟分支栈
		                //分线程for执行完，主线程的for 才执行，既遵循java亘古不变的规则：方法体内的语句从上到下依次执行
		     
        mt.start();
		for(int i=0; i<10000000; i++){
		    System.out.println("主线程执行："+i);
		}
	
	}

}

class MyThread extends Thread {

    public void run(){
	
	    for(int i=0; i<1000; i++){
		 
		    System.out.println("分线程执行： "+i);
		}
	
	}

}
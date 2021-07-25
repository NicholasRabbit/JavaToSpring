
//线程的默认名字：Thread0,1,2,3……
//修改线程名字：mt.setName(String name);
//获取线程名字： mt.getName()  =>  public final String getName()
//获取当前线程对象：Thread t=Thread.currentThread(); 静态方法
public class ThreadTest004 {

    public static void main(String[] args){
	
	    MyThread mt01=new MyThread();    
		String threadName=mt01.getName();    //setName(),getName()是父类Thread中final修饰的方法，可以被继承，不能被重写。
		System.out.println(threadName);

		mt01.setName("线程01");
		System.out.println(mt01.getName());

		mt01.start();

		MyThread mt02=new MyThread();   //线程对象MyThread可以多次new新建，这是个新的分支线程
        mt02.setName("线程02");         //设置新线程的名字
		System.out.println(mt02.getName());


	
	}

}

class MyThread extends Thread {

    public void run(){
	
	   Thread mt01=Thread.currentThread();   //获取当前线程对象，这个语句写哪里就代表获取哪个线程的对象引用
	   System.out.println(mt01.getName());

	  
	}

}
//sychronized同步，共用多个对象，synchronized嵌套使用容易发生死锁，
//死锁不会报错，也不出异常，很难解决
//死锁的代码范例

public class DaedLockTest001 {

    public static void main(String[] args){
	
	    Object o1=new Object();
		Object o2=new Object();

		MyThread01 t1=new MyThread01(o1,o2);
		MyThread02 t2=new MyThread02(o1,o2);

		t1.start();
		t2.start();

	}
}

class MyThread01 extends Thread {
    Object o1;
	Object o2;

	public MyThread01(){
	
	}
	public MyThread01(Object o1,Object o2){
	    this.o1=o1;
		this.o2=o2;
	}
    
	public void run(){     //顺序：线程1先锁住o1,再锁住o2
						   //      线程2先锁住o2,再锁住o1
		                   //有可能发生死锁，即线程1锁住o1,线程2锁住o2，因为是嵌套synchronized,则线程1用完o2之后才会放开o1给线程2,
						   //线程2用完o1之后才会放开之前先使用的o2给线程1，这样就互锁了.
		                   //也有可能不会发生死锁，即一个线程用完o1,o2之后，另一个线程再用o1,o2
		synchronized(o1){  
		    System.out.println("MyThread01-1");
			synchronized(o2){
		    System.out.println("MyThread01-2");			
			}
		}
	           
	}

}

class MyThread02 extends Thread {
      Object o1;
	  Object o2;

	public MyThread02(){
	
	}
	public MyThread02(Object o1,Object o2){
	    this.o1=o1;
		this.o2=o2;
	}

	public void run(){
	   
		synchronized(o2){
		   System.out.println("MyThread02-1");   
		   synchronized(o1){
		       System.out.println("MyThread02-2");   
		   }
		}
	}
    

}
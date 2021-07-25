//实现线程的第二种方式：
//第一步：创建一个类，实现Runnable接口；
//第二部：用这个类新建一个对象，把这个对象作为参数放进Thread有参构造方法里面即可
//注意：实际运用中常用这一种方式实现多线程，因为这种方式是面向接口编程，这样一来本例中MyRunnable类还可以继承别的类
//如果按第一种直接继承Thread类的方式，那么分线程的类就不能继承别的类了，有很大局限性。

public class ThreadTest002 {

    public static void main(String[] args){
	
	    MyRunnable mr=new MyRunnable();   //到这一步还没有创建分线程，只是创建了一个可运行的对象

		Thread  mt=new Thread(mr);        //这一步才是创建了分线程
		mt.start();

		for(int i=0; i<1000; i++){
		    System.out.println("主线程执行： "+i);
		}
		
			
	}

}

class MyRunnable implements Runnable {

    public void run(){
	
	    for(int i=0; i<1000; i++){
		    System.out.println("分线程执行："+i);
		}
	}

}
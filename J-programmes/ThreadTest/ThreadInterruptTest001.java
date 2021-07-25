//线程休眠的唤醒，即终止线程休眠
public class ThreadInterruptTest001 {

    public static void main(String[] args){
	    MyThread003 mt=new MyThread003();
		Thread t=new Thread(mt);
		t.setName("分线程t");
		t.start();

 		t.interrupt();    //sleep()方法会抛出InterruptedException，而interrupt()方法就是利用了这个特点来终止线程休眠
                          //因为异常抛出，则try,catch语句结束，休眠也就结束了	    
	}

}

class MyThread003 implements Runnable {

    public void run(){
	    System.out.println(Thread.currentThread().getName()+":线程开始");
		try{
		    Thread.sleep(1000*60*60);  //休眠一个小时
			//System.out.println("线程休眠终止");      //上面Test里面使用t.interrupt()方法以后，这里的语句则不会输出
		}catch(InterruptedException e){                //因为interrupt()使用的是异常机制来唤醒线程，终止其休眠，抛异常以后这里的就不会执行了
		    String str=e.getMessage();   //这里也可以调用e.getMessage()方法，返回字符串，然后纯输出
			System.out.println(str);
		}
		System.out.println(Thread.currentThread().getName()+":线程终止休眠");
	}

}
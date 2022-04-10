//线程的优先级的值，以及常用方法
//设置优先级:setPriority(),
//获取优先级:getPriority()
//优先级高的并不是完全占有CPU，也不是执行完了才执行其他线程，而是占用CPU的时间片比较多，总的来说占用时间较长。

public class ThreadPriorityTest001 {

    public static void main(String[] args){
	
	    Thread t=new Thread();
		
		int maxPriority=t.MAX_PRIORITY;		//最高优先级数值 10
		int minPriority=t.MIN_PRIORITY;		//最低优先级数值 1
		int defaultPriority=t.NORM_PRIORITY;	//默认优先级数值 5

		System.out.println("最高优先级: "+maxPriority);
		System.out.println("最低优先级: "+minPriority);
		System.out.println("默认优先级: "+defaultPriority);

		MyRunnable004 mr=new MyRunnable004();
		Thread mt=new Thread(mr);

		mt.setPriority(3);    //设置优先级
		System.out.println(mt.getPriority());  //获得优先级信息

	}

}

class MyRunnable004 implements Runnable {

    public void run(){
	    
	}

}
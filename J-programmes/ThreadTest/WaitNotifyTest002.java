/*
使用wait(),notify()方法实现生产者和消费者模式，本例是一个线程生产一个对象，另一个线程消费一个
注意 synchornized和wait()方法需连用，否则出异常。
*/
import java.util.List;
import java.util.ArrayList;

public class WaitNotifyTest002 {

    public static void main(String[] args){
				
	    List<Integer>  myList=new ArrayList<Integer>();
		Producer mr01=new Producer(myList);
		Consumer mr02=new Consumer(myList);
		
		Thread t01=new Thread(mr01);
		Thread t02=new Thread(mr02);
		t01.setName("线程01");
		t02.setName("线程02");

		t01.start();
		t02.start();


	}

}

class Producer implements Runnable {
    
	List<Integer> myList;
	public Producer(){
	
	}
	public Producer(List<Integer> myList){
		this.myList=myList;
	}

    public void run(){
		
        synchronized(myList){          //在线程调用wait()方法时，要用synchronized代码块锁住对象，确保对象不被多个线程调用，不加synchronized会出现IllegalMonitorException异常         
			while(true){
				if(myList.size()>0){
				   try{
					  myList.wait();   //wait()方法一旦调用，作用在对象(myList)上的线程就等待，同时线程交出了对象锁,线程由运行状态转为就绪状态
					                 
				   }catch(InterruptedException e){
					  e.printStackTrace();
				   }
				}else{
				   Integer i=new Integer(100);
				   myList.add(i);
				   myList.notify();   //注意：myList.notify()方法唤醒在myList对象上等待的另一个消费者线程，而不是当前的线程，并不会释放对象锁
				   System.out.println(Thread.currentThread().getName()+"添加"+i);
				}
			
			} 
		}		
		
    }

}

class Consumer implements Runnable {
	List<Integer> myList;
	public Consumer(){
	
	}
	public Consumer(List<Integer> myList){
		this.myList=myList;
	}


    public void run(){
		
		synchronized(myList){
		   while(true){
			   if(myList.size()==0){
				   try{
					  myList.wait();
				   }catch(InterruptedException e){
					  e.printStackTrace();
				   }

			   }else{
				   Integer i=myList.remove(0);
				   myList.notify();    //这里也是唤醒另一个作用在myList对象上的线程，不是唤醒当前的Consumer线程
				   System.out.println(Thread.currentThread().getName()+"删除"+i);
			   }
			   
			}
		}
		

		
	}
    

}
//join()������ʹ�÷���
public class ThreadJoinTest {

    public static void main(String[] args){
	
	    MyRunnable005 mr=new MyRunnable005();
		Thread t=new Thread(mr);
		t.start();

		System.out.println("���߳̿�ʼ");

		try{  //�˴�ʹ��join()������ʾ�ѷ��߳�t�ϲ������߳�main��ߣ�ֱ�����߳�tִ���꣬���߳���������Ż����
		    t.join(); 
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
		
		System.out.println("���߳̽���");   
	}

}

class MyRunnable005 implements Runnable {

    public void run(){
	    for(int i=0; i<100; i++){
		   Thread currentThread=Thread.currentThread();
		   System.out.println(currentThread.getName()+"ִ��=>"+i); 
		}
	}
}
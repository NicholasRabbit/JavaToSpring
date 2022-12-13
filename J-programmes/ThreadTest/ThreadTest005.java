import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

//������ʵ���̵߳ķ���������:  ���ִ����̷߳�ʽ���ŵ㣬���Ի���߳�ִ�н����ͨ��FutureTask����������get()����
//��:futureTask.get()��ע�ⲻ�����߳���������
//����1�������½�һ����̳�Callable�ӿڣ�
//����2�����ϲ���1����new������ŵ�FutrueTask�вι��������ߣ�
//����3,�Ѳ���2��FutureTask��new������ŵ�Thread�вι�����߼��ɡ�
//������t.start();
//��ȡ�߳�ִ�н��futureTask.get()
public class ThreadTest005 {

    public static void main(String[] args){
	
	    Callable c=new MyCallable();
		FutureTask futureTask=new FutureTask(c);  //FutureTask<V>�½�����ʱҲ�ɼӷ���
		Thread t=new Thread(futureTask);          //FutureTask��̳��˽ӿ�Runnable,��˿ɷŵ�Thread���вι���new Thread(Runnable r)��         
		
		System.out.println("���߳̿�ʼ");

		try{
		  t.start();           //����start()���������̣߳���ΪJVM��ִ��call()���������쳣�׳�����������Ҫ��׽
		}catch(Exception e){
		  e.printStackTrace();
		}

        try{
		   //�������futureTask.get()����������������߳����������쳣Ҫ��׽
		   //t.start()���߳�ִ����Ż��ȡ�����������ַ�ʽ�����ڱ�������JUC��CountDownLatch��ش���
		   //�߳�ִ����Ż��ȡ�����������ַ�ʽ�����ڱ�������JUC��CountDownLatch��ش���
		   Object retValue=futureTask.get();  
		   System.out.println(retValue); 
		}catch(InterruptedException | ExecutionException e ){
			e.printStackTrace();
		}

		System.out.println("���߳̽���");


	}

}

class MyCallable implements Callable {

	   public Object call() throws Exception {   //����call()�����൱��֮ǰ�����̵߳�run()������t.start()ִ�У�
												 //JVM���Զ�ִ�����call()����	      
		 try{
		    Thread.sleep(1000*5);
		 }catch(InterruptedException e){
		    e.printStackTrace();
		 }

		 Object obj=new Object();
		 return obj;
       }
	
}
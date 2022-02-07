
import java.util.concurrent.CountDownLatch;


/*
1,CountDownLatch.java�÷�������
  ���ã�����������ȴ������߳�ִ�����Ժ���ִ��һ����������������ͳ�������߳�ִ����ĺ�ʱ
2,ע��latch������ʵ���������õ����ķ���Ҫ��ͬ��������֤�̰߳�ȫ��
*/
public class CountDownLatchTest {

	public static void main(String[] args){
		
		//һ����ʼ��CountDownLatch���󣬲��趨�ü���̵߳�������latch.countDown()����ÿִ��һ�Σ������ֵ��һ��
		//    ����Ϊ0ʱ���Ż�ִ��latch.await()����
		final CountDownLatch latch = new CountDownLatch(10);   //���ñ�����final���Σ���ʾ������ò���ָ����������
		
		//��������߳����ﴫCountDownLatch����
		Runnable mr = new MyRunnableDemo(latch);
	
		long startTime = System.currentTimeMillis();	//��ʼʱ��

		//��������10���̣߳�������ġ�10������һ��
		for(int i = 0; i < 10; i++){
			Thread t = new Thread(mr);
			t.start();
		}
		
		//�ģ�����await()�������˷���ִ��ǰ����ǰ�߳�һֱ��������״̬��Ŀ��Ϊ��10���߳�������
		try {
			latch.await();	
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		//�壬������ʱ
		long endTime = System.currentTimeMillis();
		long usedTime = endTime - startTime;
		System.out.println("����ʱ==>" + usedTime);
		
	}
}



class MyRunnableDemo implements Runnable {
	
	private CountDownLatch latch;
	
	public MyRunnableDemo(){
	
	}
	public MyRunnableDemo(CountDownLatch latch){
		this.latch = latch;
	}

	public void run(){
		//����Ϊ�˱�֤�̰߳�ȫ��ʹ��ͬ�������
		synchronized (this) {  //����Ҳ������ס��latch��
			
			//�ߣ�ͬʱΪ�˷�ֹ�쳣���countDown()������ִ�У��������̵߳�"10"�޷����㣬��˰Ѹ÷����ŵ�finally��ִ��
			//��finally������try
			try {
				//����һ���ڵ�ż��
				for(int i = 0; i < 10000; i++){
					if(i % 2 == 0){
						System.out.println(i);
					}
				}	
			} finally {
				//�ˣ�����countDown()������ÿִ��һ�Σ�count��ֵ��һ
				latch.countDown();  
			}			
		}
		
	}
}
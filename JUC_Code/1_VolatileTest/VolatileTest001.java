public class VolatileTest001 {

	public static void main(String[] args){
	
		MyRunnable01 mr01 = new MyRunnable01();
		Thread t01 = new Thread(mr01);
		t01.setName("���߳�");
		t01.start();
	    /*1,���̵߳�flagʵ�����������ڶ��ڴ��У������ڴ����̹߳���
		  2,�ڴ�Ĳ��ɼ��ԣ����������߳̿��������̵߳Ļ���
		    ���ڷ��߳���˯��500���룬�����߳��ȴӶ��ڴ��л�ȡflag,ֵΪfalse,����ŵ��Լ������У�
			��java��whileѭ������ײ�ģ�ִ���ٶȽϿ죬һֱ��ȡ�����е�ֵ�����߳̿��������߳����Ѿ��ڷ��̻߳�����
			��ֵ��flagΪtrue���ŵ��Ĺ�����ڴ��У������ڴ�Ĳ��ɼ��ԣ�����ִ�в���if��䡣
		  3,�����flag�������ˡ�volatile�����η��󣬸ı����Ͳ��ᱻ�߳��õ����ǵĻ����У������ڹ���Ķ��ڴ����޸ġ�
		    �����Ͳ��ᷢ�����������ˣ�
		  4,volatile��synchronized���η���ͬ����synchronized���ٶȿ�
		    sychronized���л����ԣ�volatile�����л�����
			volatile���ܱ�֤������ԭ����
		*/	
		while(true){
			if(mr01.getFlag()){
				System.out.println(Thread.currentThread().getName() + "==>execute!");
				break;
			}
		}
	
	}
}


class MyRunnable01 implements Runnable {

	private boolean flag = false;
	//
	//private volatile boolean flag = false;
	
	public void run(){
		
		//���÷��߳�˯��500���룬���������߳��ȵõ�flag��ֵ
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		this.flag = true;
		System.out.println(Thread.currentThread().getName() + ":flag ==> " + flag);
	}

	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	public boolean getFlag(){
		return this.flag;
	}

}
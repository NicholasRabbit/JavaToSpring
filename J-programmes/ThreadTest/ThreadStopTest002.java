//��ֹ�߳����е�һ����������
//�ڷ��߳�������һ���������ͱ���:run������run���õ�if���֮�У�Ȼ����main�������߳���ͨ���ı�run��ֵ�������п���
public class ThreadStopTest002 {

    public static void main(String[] args){
	    MyRunnable003 mr03=new MyRunnable003();
		Thread t=new Thread(mr03);
		t.setName("���߳�mr03");
		t.start();
		
		try{
		    Thread.sleep(1000*5);  
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
        
		mr03.run=false;   //ע��˴�����д��t.run����Ϊt����Myrunnable003�����ã�����ָ��������:run
	}
}


class MyRunnable003 implements Runnable {

    boolean run=true;

	public void run(){
	    for(int i=0; i<20; i++){
		    if(run){
			    System.out.println(Thread.currentThread().getName()+"���=>"+i);
				try{
				    Thread.sleep(1000);
				}catch (InterruptedException e){
				    e.printStackTrace();
				}
			}else{
			    /*   ����return�������߳�
				return���ִ���򷽷������������߳�Ҳ�������������ļ��ȣ���д��return֮ǰ��������mr03.run=falseʱ
				��ִ���������䣬�Ϳɱ��������
				*/
				return;
			}
		}
	}

}
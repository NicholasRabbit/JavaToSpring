//�������̵߳ĵ�һ��������
//��һ�����½�һ���࣬�̳�java.lang.Thread
//�ڶ����������߳��д��������Ķ��󣬲����ö����ڵ�satrt()������start()����������˲�����
//        ���߳�forѭ���ͷ��߳�forѭ��ͬʱִ��
public class ThreadTest001 {

    public static void main(String[] args){
	
	    MyThread mt=new MyThread();
		
		//mt.run();     //���ܵ��ö����ڵ�run()�������������������ǵ��̣߳�������main����ջ�û�п��ٷ�֧ջ
		                //���߳�forִ���꣬���̵߳�for ��ִ�У�����ѭjavaب�Ų���Ĺ��򣺷������ڵ������ϵ�������ִ��
		     
        mt.start();
		for(int i=0; i<10000000; i++){
		    System.out.println("���߳�ִ�У�"+i);
		}
	
	}

}

class MyThread extends Thread {

    public void run(){
	
	    for(int i=0; i<1000; i++){
		 
		    System.out.println("���߳�ִ�У� "+i);
		}
	
	}

}
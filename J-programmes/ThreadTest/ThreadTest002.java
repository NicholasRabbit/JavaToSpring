//ʵ���̵߳ĵڶ��ַ�ʽ��
//��һ��������һ���࣬ʵ��Runnable�ӿڣ�
//�ڶ�������������½�һ�����󣬰����������Ϊ�����Ž�Thread�вι��췽�����漴��
//ע�⣺ʵ�������г�����һ�ַ�ʽʵ�ֶ��̣߳���Ϊ���ַ�ʽ������ӿڱ�̣�����һ��������MyRunnable�໹���Լ̳б����
//�������һ��ֱ�Ӽ̳�Thread��ķ�ʽ����ô���̵߳���Ͳ��ܼ̳б�����ˣ��кܴ�����ԡ�

public class ThreadTest002 {

    public static void main(String[] args){
	
	    MyRunnable mr=new MyRunnable();   //����һ����û�д������̣߳�ֻ�Ǵ�����һ�������еĶ���

		Thread  mt=new Thread(mr);        //��һ�����Ǵ����˷��߳�
		mt.start();

		for(int i=0; i<1000; i++){
		    System.out.println("���߳�ִ�У� "+i);
		}
		
			
	}

}

class MyRunnable implements Runnable {

    public void run(){
	
	    for(int i=0; i<1000; i++){
		    System.out.println("���߳�ִ�У�"+i);
		}
	}

}
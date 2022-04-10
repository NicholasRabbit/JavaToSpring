//�̵߳����ȼ���ֵ���Լ����÷���
//�������ȼ�:setPriority(),
//��ȡ���ȼ�:getPriority()
//���ȼ��ߵĲ�������ȫռ��CPU��Ҳ����ִ�����˲�ִ�������̣߳�����ռ��CPU��ʱ��Ƭ�Ƚ϶࣬�ܵ���˵ռ��ʱ��ϳ���

public class ThreadPriorityTest001 {

    public static void main(String[] args){
	
	    Thread t=new Thread();
		
		int maxPriority=t.MAX_PRIORITY;		//������ȼ���ֵ 10
		int minPriority=t.MIN_PRIORITY;		//������ȼ���ֵ 1
		int defaultPriority=t.NORM_PRIORITY;	//Ĭ�����ȼ���ֵ 5

		System.out.println("������ȼ�: "+maxPriority);
		System.out.println("������ȼ�: "+minPriority);
		System.out.println("Ĭ�����ȼ�: "+defaultPriority);

		MyRunnable004 mr=new MyRunnable004();
		Thread mt=new Thread(mr);

		mt.setPriority(3);    //�������ȼ�
		System.out.println(mt.getPriority());  //������ȼ���Ϣ

	}

}

class MyRunnable004 implements Runnable {

    public void run(){
	    
	}

}
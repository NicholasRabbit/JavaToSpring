//��ThreadTest002�е��߳��������ڲ���ķ�ʽ��������ΪRunnable�Ǹ��ӿڣ�����new(){}�����ڲ���

public class ThreadTest003 {

    public static void main(String[] args){
	
	    Thread mt=new Thread(      
			         new Runnable(){        //�����ڲ���
		                 public void run(){
						     for(int i=0; i<1000; i++){
						         System.out.println("�����ڲ�����߳�ִ�У�"+i);
						     }
						 }
					 }
		          );      //ע��new��������ﲻҪ©�ֺš�;��
          
            mt.start();

			for(int i=0; i<1000; i++){
			    System.out.println("���߳�ִ�У�"+i);
			}

	
	}

}
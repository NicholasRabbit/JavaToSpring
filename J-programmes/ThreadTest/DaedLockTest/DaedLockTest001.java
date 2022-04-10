//sychronizedͬ�������ö������synchronizedǶ��ʹ�����׷���������
//�������ᱨ��Ҳ�����쳣�����ѽ��
//�����Ĵ��뷶��

public class DaedLockTest001 {

    public static void main(String[] args){
	
	    Object o1=new Object();
		Object o2=new Object();

		MyThread01 t1=new MyThread01(o1,o2);
		MyThread02 t2=new MyThread02(o1,o2);

		t1.start();
		t2.start();

	}
}

class MyThread01 extends Thread {
    Object o1;
	Object o2;

	public MyThread01(){
	
	}
	public MyThread01(Object o1,Object o2){
	    this.o1=o1;
		this.o2=o2;
	}
    
	public void run(){     //˳���߳�1����סo1,����סo2
						   //      �߳�2����סo2,����סo1
		                   //�п��ܷ������������߳�1��סo1,�߳�2��סo2����Ϊ��Ƕ��synchronized,���߳�1����o2֮��Ż�ſ�o1���߳�2,
						   //�߳�2����o1֮��Ż�ſ�֮ǰ��ʹ�õ�o2���߳�1�������ͻ�����.
		                   //Ҳ�п��ܲ��ᷢ����������һ���߳�����o1,o2֮����һ���߳�����o1,o2
		synchronized(o1){  
		    System.out.println("MyThread01-1");
			synchronized(o2){
		    System.out.println("MyThread01-2");			
			}
		}
	           
	}

}

class MyThread02 extends Thread {
      Object o1;
	  Object o2;

	public MyThread02(){
	
	}
	public MyThread02(Object o1,Object o2){
	    this.o1=o1;
		this.o2=o2;
	}

	public void run(){
	   
		synchronized(o2){
		   System.out.println("MyThread02-1");   
		   synchronized(o1){
		       System.out.println("MyThread02-2");   
		   }
		}
	}
    

}
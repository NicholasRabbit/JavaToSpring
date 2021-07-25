/*
ʹ��wait(),notify()����ʵ�������ߺ�������ģʽ��������һ���߳�����һ��������һ���߳�����һ��
ע�� synchornized��wait()���������ã�������쳣��
*/
import java.util.List;
import java.util.ArrayList;

public class WaitNotifyTest002 {

    public static void main(String[] args){
				
	    List<Integer>  myList=new ArrayList<Integer>();
		Producer mr01=new Producer(myList);
		Consumer mr02=new Consumer(myList);
		
		Thread t01=new Thread(mr01);
		Thread t02=new Thread(mr02);
		t01.setName("�߳�01");
		t02.setName("�߳�02");

		t01.start();
		t02.start();


	}

}

class Producer implements Runnable {
    
	List<Integer> myList;
	public Producer(){
	
	}
	public Producer(List<Integer> myList){
		this.myList=myList;
	}

    public void run(){
		
        synchronized(myList){          //���̵߳���wait()����ʱ��Ҫ��synchronized�������ס����ȷ�����󲻱�����̵߳��ã�����synchronized�����IllegalMonitorException�쳣         
			while(true){
				if(myList.size()>0){
				   try{
					  myList.wait();   //wait()����һ�����ã������ڶ���(myList)�ϵ��߳̾͵ȴ���ͬʱ�߳̽����˶�����,�߳�������״̬תΪ����״̬
					                 
				   }catch(InterruptedException e){
					  e.printStackTrace();
				   }
				}else{
				   Integer i=new Integer(100);
				   myList.add(i);
				   myList.notify();   //ע�⣺myList.notify()����������myList�����ϵȴ�����һ���������̣߳������ǵ�ǰ���̣߳��������ͷŶ�����
				   System.out.println(Thread.currentThread().getName()+"���"+i);
				}
			
			} 
		}		
		
    }

}

class Consumer implements Runnable {
	List<Integer> myList;
	public Consumer(){
	
	}
	public Consumer(List<Integer> myList){
		this.myList=myList;
	}


    public void run(){
		
		synchronized(myList){
		   while(true){
			   if(myList.size()==0){
				   try{
					  myList.wait();
				   }catch(InterruptedException e){
					  e.printStackTrace();
				   }

			   }else{
				   Integer i=myList.remove(0);
				   myList.notify();    //����Ҳ�ǻ�����һ��������myList�����ϵ��̣߳����ǻ��ѵ�ǰ��Consumer�߳�
				   System.out.println(Thread.currentThread().getName()+"ɾ��"+i);
			   }
			   
			}
		}
		

		
	}
    

}
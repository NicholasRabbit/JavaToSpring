//SynchronizedTest001的线程安全方式

public class SynchronizedTest002 {

	    
    public static void main(String[] args){
         
		Account act=new Account("tom",1000);

		Thread t1=new Thread(new AccountThread(act));  
		Thread t2=new Thread(new AccountThread(act));

		t1.start();
		t2.start();
	}
}
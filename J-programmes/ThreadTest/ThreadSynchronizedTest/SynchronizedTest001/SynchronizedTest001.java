public class SynchronizedTest001 {

    public static void main(String[] args){
	
	    BankAccount act=new BankAccount("tom", 100);
		
		Thread t1=new Thread(new AccountThread(act));
		Thread t2=new Thread(new AccountThread(act));

		t1.start();
		t2.start();

	}

}
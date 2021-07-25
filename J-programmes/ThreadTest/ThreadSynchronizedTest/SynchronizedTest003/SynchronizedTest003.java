public class SynchronizedTest003 {

    public static void main(String[] arg){
	   
		Account act=new Account("001",1000);
		
		AccountThread  at1=new AccountThread(act);
        AccountThread  at2=new AccountThread(act);

		Thread t1=new Thread(at1);
		Thread t2=new Thread(at2);

		t1.start();
		t2.start();

	}

}
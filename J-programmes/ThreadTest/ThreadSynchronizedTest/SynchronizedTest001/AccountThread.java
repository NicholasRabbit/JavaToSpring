public class AccountThread implements Runnable {

	BankAccount act;

	public AccountThread(){
	
	}
	public AccountThread(BankAccount act){
	    this.act=act;
	}

    public void run(){
		act.withdraw(50);
	}

}
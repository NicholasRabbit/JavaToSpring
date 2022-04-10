public class WaitNotifyHomework {

	public static void main(String[] args){
	
		User u=new User();
		MyRunnable01 mr01=new MyRunnable01(u);
		MyRunnable02 mr02=new MyRunnable02(u);
		Thread t1=new Thread(mr01);
		Thread t2=new Thread(mr02);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}

}
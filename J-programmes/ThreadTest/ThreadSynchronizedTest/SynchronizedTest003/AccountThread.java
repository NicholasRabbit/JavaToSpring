public class AccountThread implements Runnable {
    
	Account act;

    public AccountThread(){
	
	}
	public AccountThread(Account act){
	    this.act=act;
	}

	public void run(){
	    double money=500;
		act.withdraw(money);
		
		System.out.println(Thread.currentThread().getName()+"取钱："+money+",余额:"+act.getBalance());
		/*这里输出:
		  Thread-1取钱：500.0,余额:0.0
	      Thread-0取钱：500.0,余额:0.0
		  原因：在Thread-0线程这里的sout语句执行前，一旦它的withwdraw()方法已经执行完交出锁，Thread-1马上就执行
		  它的withdraw()方法，并更新了同一个对象act引用指向的balance属性，因此余额都为0。
		  解决办法：
		  一，把这里的sout语句写到Account类里的synchronized语句里
		  二，或者在Acccount类里的“this.setBalance(remain);”之前休眠下线程，让后面那个线程晚会给balance赋值
		*/
	}
}
public class Account {

    private String id;
	private double balance;

	public Account(){
	
	}
	public Account(String id, double balance){
		this.id=id;
		this.balance=balance;
	}

	public void setId(String id){
	    this.id=id;
	}
	public String getId(){
	    return this.id;
	}
	public void setBalance(double balance){
	    this.balance=balance;
	}
	public double getBalance(){
	    return this.balance;
	}

                                                        //这样是同步了整个方法，缺点：效率不高， 优点：但代码简洁了
	public synchronized double withdraw(double money){  //synchronized作为修饰词出现在实例方法上的时候,只能锁住this,即共享的是this
	    
		
		  double current=this.getBalance();              
		  double remain=current-money;

		  /*
		  try{
		      Thread.sleep(1000*2);           //解决方法二
		  }catch(InterruptedException e){
		      e.printStackTrace();
		  }
		  */
        
		  this.setBalance(remain);
          //解决方法一
		  //System.out.println(Thread.currentThread().getName()+"取钱："+money+"余额"+this.getBalance());
		  return balance;
		
		
	}

}
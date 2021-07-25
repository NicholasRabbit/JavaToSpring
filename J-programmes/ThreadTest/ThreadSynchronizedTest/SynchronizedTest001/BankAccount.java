//本例模仿两个人对同一个银行账户取款，线程不安全时的情况
//在SynchronizedTest002中进行改善

public class BankAccount {

    private String name;
	private double balance;

	
	public void withdraw(double money){
	    double  current=this.getBalance();   //取钱之前余额
		double  remain=current-money;        //取完之后剩的钱，这里没有使用sychronize(){}代码块，在下行执行之前
		                                     //一个线程还没设置余额，另一个线程就并发了，这另一个线程获得的余额还是100,

		 try{  //这里模拟网络延迟，即两个线程都把上面的执行完了，则余额肯定会出问题
		   Thread.sleep(1000*1);
		}catch(InterruptedException e){ 
		   e.printStackTrace();
		}

		//在下面这行执行之前，两个线程都把上面的执行完了，就容易出问题
		this.setBalance(remain);             //本例，正确的余额：第一个100-50=50，第二个取钱：50-50=0
                                             //有可能出现的情况（线程并发时），第一个100-50=50；第二个100-50=50；最后设置余额还是50
		System.out.println("取款："+money+",余额："+remain);

	}
	
	
	//无参有参构造方法
	public BankAccount(){
	
	}
	public BankAccount(String name, int balance){
	    this.name=name;
		this.balance=balance;
	}
    
	//set,get方法
	public void setName(String name){
	    this.name=name;
	}
	public String getName(){
	    return this.name;
	}
	public void setBalance(double balance){
	    this.balance=balance;
	}
	public double getBalance(){
	    return this.balance;
	}

}
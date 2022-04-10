public class AccountThread implements Runnable {

    Account act;

	public AccountThread(){
	}
	public AccountThread(Account act){
		this.act=act;
	}

	public void run(){
		
		double money=500;                 //取款500，注意这里int类型500自动转为范围更大的double
		
	    act.withdraw(money);              //synchronized(){}也可以加在这里，即Synchronize(act){
		                                  //    act.withdraw(money); 
										  // } 只不过包含的语句更多了，扩大同步范围，速度慢些
		
		double remain=act.getBalance();   //剩余钱数
		System.out.println("取钱："+money+",剩余："+remain);
	}
}
public class AccountThread implements Runnable {

    Account act;

	public AccountThread(){
	}
	public AccountThread(Account act){
		this.act=act;
	}

	public void run(){
		
		double money=500;                 //ȡ��500��ע������int����500�Զ�תΪ��Χ�����double
		
	    act.withdraw(money);              //synchronized(){}Ҳ���Լ��������Synchronize(act){
		                                  //    act.withdraw(money); 
										  // } ֻ�����������������ˣ�����ͬ����Χ���ٶ���Щ
		
		double remain=act.getBalance();   //ʣ��Ǯ��
		System.out.println("ȡǮ��"+money+",ʣ�ࣺ"+remain);
	}
}
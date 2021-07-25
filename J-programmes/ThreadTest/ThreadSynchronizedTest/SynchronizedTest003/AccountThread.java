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
		
		System.out.println(Thread.currentThread().getName()+"ȡǮ��"+money+",���:"+act.getBalance());
		/*�������:
		  Thread-1ȡǮ��500.0,���:0.0
	      Thread-0ȡǮ��500.0,���:0.0
		  ԭ����Thread-0�߳������sout���ִ��ǰ��һ������withwdraw()�����Ѿ�ִ���꽻������Thread-1���Ͼ�ִ��
		  ����withdraw()��������������ͬһ������act����ָ���balance���ԣ������Ϊ0��
		  ����취��
		  һ���������sout���д��Account�����synchronized�����
		  ����������Acccount����ġ�this.setBalance(remain);��֮ǰ�������̣߳��ú����Ǹ��߳�����balance��ֵ
		*/
	}
}
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

                                                        //������ͬ��������������ȱ�㣺Ч�ʲ��ߣ� �ŵ㣺����������
	public synchronized double withdraw(double money){  //synchronized��Ϊ���δʳ�����ʵ�������ϵ�ʱ��,ֻ����סthis,���������this
	    
		
		  double current=this.getBalance();              
		  double remain=current-money;

		  /*
		  try{
		      Thread.sleep(1000*2);           //���������
		  }catch(InterruptedException e){
		      e.printStackTrace();
		  }
		  */
        
		  this.setBalance(remain);
          //�������һ
		  //System.out.println(Thread.currentThread().getName()+"ȡǮ��"+money+"���"+this.getBalance());
		  return balance;
		
		
	}

}
public class Account {
    private String name;
	private double balance;
	//�޲κ��вι��췽��
	public Account(){
	
	}
	public Account(String name, double balance){
	    this.name=name;
		this.balance=balance;
	}
	//set,get����
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

	//ȡǮ����
	public double withdraw(double money){

		synchronized(this){     //ʹ��Synchronized(){}����飬��������߳�ִ�е����ֻ����һ���߳̽�����������
								//ֱ��һ���߳�ִ���꣬����̲߳��ܽ������������ܱ�֤�̰߳�ȫ��
								//Synchronized(..)С�����ڵĲ��������Ƕ���̹߳�������ݲ���
		    double current=this.getBalance();
            double remain=current-money;
			
			try{              
			   Thread.sleep(1000*2);  //����ģ�������ӳ� 
			}catch(InterruptedException e){
			   e.printStackTrace();
			}
			
			this.setBalance(remain);
			return balance;
		}
	}

}
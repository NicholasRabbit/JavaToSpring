//����ģ�������˶�ͬһ�������˻�ȡ��̲߳���ȫʱ�����
//��SynchronizedTest002�н��и���

public class BankAccount {

    private String name;
	private double balance;

	
	public void withdraw(double money){
	    double  current=this.getBalance();   //ȡǮ֮ǰ���
		double  remain=current-money;        //ȡ��֮��ʣ��Ǯ������û��ʹ��sychronize(){}����飬������ִ��֮ǰ
		                                     //һ���̻߳�û��������һ���߳̾Ͳ����ˣ�����һ���̻߳�õ�����100,

		 try{  //����ģ�������ӳ٣��������̶߳��������ִ�����ˣ������϶��������
		   Thread.sleep(1000*1);
		}catch(InterruptedException e){ 
		   e.printStackTrace();
		}

		//����������ִ��֮ǰ�������̶߳��������ִ�����ˣ������׳�����
		this.setBalance(remain);             //��������ȷ������һ��100-50=50���ڶ���ȡǮ��50-50=0
                                             //�п��ܳ��ֵ�������̲߳���ʱ������һ��100-50=50���ڶ���100-50=50�������������50
		System.out.println("ȡ�"+money+",��"+remain);

	}
	
	
	//�޲��вι��췽��
	public BankAccount(){
	
	}
	public BankAccount(String name, int balance){
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

}
public class Account {
    private String name;
    private int id;
	private long balance;
	private double annualInterestRate;

    public void setName(String name){
	    this.name=name;
	
	}
	public String getName(){
	
	    return name;
	}

	public void setId(int id){
	    this.id=id;
	
	}
	public int getId(){
	
	    return id;
	}

	
	public void setBalance(long balance){
	    this.balance=balance;
	   
	}
	public long getBalance(){
	
	    return balance;
	}


	public void setAnnualInterestRate(double annualInterestRate){
	
	    this.annualInterestRate=annualInterestRate;

	}
    public double getAnnualInterestRate(){
	
	    return annualInterestRate;
	}

	public void deposit(long moneyPlus){

		System.out.println("�ɹ����룺"+moneyPlus);
	    balance+=moneyPlus;
	
	}
	
	public void withdraw(long moneyMinus){
	 
	    if (moneyMinus>balance){
            System.out.println("����");
			return;
                
	    }else{
		    balance-=moneyMinus;
		    System.out.println("�ɹ�ȡ����"+moneyMinus);
			
		
		}
     }

    public void summary(){
	
	    System.out.println(name+"has a account "+"id"+id+"����"+annualInterestRate+"���"+balance);
	} 		
		
	

	




}
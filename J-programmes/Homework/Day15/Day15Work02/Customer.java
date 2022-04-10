public class Customer {

    public static void main(String[] args){
	 
	    Account janeSmith=new Account();
		        janeSmith.setId(63323660);

				janeSmith.setBalance(2000L);
				janeSmith.setName("Jane Smith");
				janeSmith.setAnnualInterestRate(0.0123);

				janeSmith.deposit(100L);
				janeSmith.withdraw(960L);
				janeSmith.withdraw(2000L);

				janeSmith.summary();


				

			
	
	}

}
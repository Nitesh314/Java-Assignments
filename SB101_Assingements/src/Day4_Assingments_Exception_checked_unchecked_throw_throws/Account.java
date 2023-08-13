package Day4_Assingments_Exception_checked_unchecked_throw_throws;

public class Account {
	
	private  String accountNumber;
	private double balance;
	
	public Account(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	
	
	public void deposit(double amount) {
		
		this.balance+=amount;
		
		System.out.println("Your amount "+amount +" deposit successfully ThankYou...");
		
	}
	
	
	public double withdraw(double amount) throws InsufficientFundsException {
	      
		if(amount>balance) {
			InsufficientFundsException ie=new InsufficientFundsException("SORRY!! Insufisent Fund in Acoount!");
			throw ie;
		}
		else {
			return balance-amount;
		}
		
		
	}

}

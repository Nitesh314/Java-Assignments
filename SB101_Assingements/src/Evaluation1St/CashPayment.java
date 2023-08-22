package Evaluation1St;

public class CashPayment implements Payment {

	private int amount;
	
	public CashPayment(int amount) {
		this.amount=amount;
		
	}
	
	
	
	
	@Override
	public void doPayment() {
		
		System.out.println("Payment done using Cash "+amount);
		
	}

}

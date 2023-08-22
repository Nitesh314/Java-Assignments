package Evaluation1St;

public class CardPayment implements Payment {

	private int amount;
	
	public CardPayment(int amount) {
		this.amount=amount;
	}
	
	
	
	@Override
	public void doPayment() {
		System.out.println("Payment done using Card "+amount);
	}

}

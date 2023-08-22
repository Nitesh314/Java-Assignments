package Evaluation1St;

import java.util.Arrays;
import java.util.List;

public class Main3 {
	
	public void doTransactions(List<? extends Payment> list) {
		   
		for(Payment p: list) {
			p.doPayment();
		}
		
	}
	
	public static void main(String[] args) {
		
		Main3 m=new Main3();
		
		
		
		m.doTransactions(Arrays.asList(new CardPayment(8000),new CardPayment(7000)));
		
		m.doTransactions(Arrays.asList(new CashPayment(6000),new CashPayment(9000)));
		
	}
	

}

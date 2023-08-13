package Day4_Assingments_Exception_checked_unchecked_throw_throws;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Welcome To Dena Lena Bank...\r\n");
		
		System.out.print("Please Enter your Bank Account number\r\n");
		String acn=sc.nextLine();
		
		System.out.println("Enter the amount for deposit ");
		double am=sc.nextDouble();
		
		Account ac=new Account(acn, am);
		
		
		System.out.println("Please enter the amount for deposit your account");
		double dp=sc.nextDouble();
		
		ac.deposit(dp);
		
		System.out.println("Please enter the amount to withdraw the amount ");
		double wi=sc.nextDouble();
		
		try {
			ac.withdraw(wi);
			System.out.println("Withdraw successfully...");
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("   ThankYou...   ");
		
		
		
	}
	
}

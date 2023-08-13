package Day4_Assingments_Exception_checked_unchecked_throw_throws;

import java.util.Scanner;

public class Main4 {
	
	
	public static void  getQuotient(int a,int b) {
		
		try {
			System.out.println("The quotient of "+a+"/"+b+"="+a/b);
		}catch (ArithmeticException ae) {
			System.out.println("DivideByZeroException caught"); 
		
		}finally {
			System.out.println("Inside Finally block");
		}
		
		
	    
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the first Number : ");
		int fst=sc.nextInt();
		
		System.out.print("Enter teh second Number : ");
		int sec=sc.nextInt();
		
	    Main4.getQuotient(fst, sec);
		
		
		
		
	}
	
	

}

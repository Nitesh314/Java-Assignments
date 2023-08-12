package day3_Assingments_Exception_Handling_1st;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Start of main..");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
		String message=null;
		
		
		try {
			
			int num3=num1/num2;
			
			if(num3>10) {
				message="Welcome to Exception Handling";			
			}
			
			System.out.println("Message is  : "+message.toUpperCase());
			
		}catch (InputMismatchException ie) {
			System.out.println("Please enter valid number");
		}
		catch (ArithmeticException ae) {
		   if(num2==0) {
			   System.out.println("num2 should not be "+num2);
		   }
		}catch (Exception e) {
			message="String value is null";
			System.out.println(message);
		}
		
		 
		 System.out.println("End of main..");
		 
		
	}
	
	 
	
}

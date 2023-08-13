package Day4_Assingments_Exception_checked_unchecked_throw_throws;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        String input = scanner.nextLine();
	        

	        try {
	            int number = Integer.parseInt(input);
	            int square = number * number;
	            System.out.println("The square of the number is: " + square);
	        } catch (NumberFormatException e) {
	            System.out.println("Entered input is not a valid format for an integer.");
	        }

	        System.out.println("The work has been done successfully");
	
	}

}

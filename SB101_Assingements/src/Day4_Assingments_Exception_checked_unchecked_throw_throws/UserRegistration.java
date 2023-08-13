package Day4_Assingments_Exception_checked_unchecked_throw_throws;

import java.util.Scanner;

public class UserRegistration {
	
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equalsIgnoreCase("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException in=new InvalidCountryException("User Outside India cannot be registered");
			throw in;
		}
		
	}
	
	public static void main(String[] args) {
		
		UserRegistration us=new UserRegistration();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Name : ");
		String name=sc.nextLine();
		
		System.out.print("Enter Your Country : ");
		String country=sc.nextLine();
		
		try {
			us.registerUser(name, country);
		}catch (InvalidCountryException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		System.out.println("Thank you!");
		
	}
	

}

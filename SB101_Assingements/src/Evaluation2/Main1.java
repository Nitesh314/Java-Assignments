package Evaluation2;

import java.util.List;
import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Library lib=new Library();
		
		
		
		
		
		while(true) {
			
			System.out.println("1.Add Book\r\n"
					+ "2.Display all book details\r\n"
					+ "3.Search Book by author\r\n"
					+ "4.Search book by ISBN\r\n"
					+ "5.Exit");
			
			System.out.print("\r\n"+" Enter your choice : ");
			int input=sc.nextInt();
			
			switch (input) {
			case 1:{
				System.out.print(" Enter the isbn no : ");
				int isbn=sc.nextInt();
				
				sc.nextLine();
				
				System.out.print(" Enter the book name : ");
				String name=sc.nextLine();
				
				System.out.print(" Enter the author name : ");
				String author=sc.nextLine();
				
				Book b=new Book(isbn, name, author);
				
				try {
					lib.addBook(b);
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 2: {
				
				try {
				   List<Book> blist=lib.viewAllBooks();
				   
				   blist.forEach(b -> {
					    System.out.println("\r\n"+"Isbn no : " + b.getIsbn() +
					            "\r\nBook Name : " + b.getBookName() +
					            "\r\nAuthor Name : " + b.getAuthor() +
					            "\r\n****************************");
					});
				   
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
	
			case 3 :{
				sc.nextLine();
				System.out.print("Enter the author name : ");
				String author=sc.nextLine();
				
				try {
					 List<Book> blist= lib.viewBooksByAuthor(author);
					 
					 blist.forEach(b->System.out.println("\r\nIsbn no : "+b.getIsbn()+"\r\nBook Name : "+b.getBookName()+"\r\nAuthor Name : "+b.getAuthor()+"\r\n****************************\r\n"));
					
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			
			case 4: {
				System.out.print("Enter the isbn no : ");
				int isbn=sc.nextInt();
				
			try {
				Book b=	lib.getBookByISBN(isbn);
				
				System.out.println("\r\nIsbn no : "+b.getIsbn()+"\r\nBook Name : "+b.getBookName()+"\r\nAuthor Name : "+b.getAuthor()+"\r\n****************************\r\n");
				
			} catch (BookException e) {
				System.out.println(e.getMessage());
			}
			break;
		  }
			
			case 5:{
				
				System.out.println("\n\r"+"Output: Thank You..!!");
			   System.exit(input);
			   
			}
			default: {
	            System.out.println("\r\nInvalid choice. Please enter a valid option.");
	            break;
	        }
			
		   }
			
			
		}
		
		
		
	}

}

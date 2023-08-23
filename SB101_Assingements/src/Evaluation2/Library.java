package Evaluation2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	
	 List<Book> list =new ArrayList<>();
	 
	 //addBook method is use to add a book in list ;
	
	 public void addBook(Book book)throws BookException{
		 
		if(list.contains(book)) {
			BookException be=new BookException("\r\n"+"Output: Book is already exist"+"\r\n");
			throw be;
		}
			list.add(book);
			
			System.out.println("\r\n"+"Output: Book added successfully"+"\r\n");
		
		 
	 }
	 
	 //viewAllBooks method is used to return  the all book present in the list ;
	 
	 public List viewAllBooks()throws BookException{
		 
		 if(list.isEmpty()) {
			 BookException be=new BookException("\r\n"+"Output: None of the book in the library..."+"\r\n");
			 throw be;
		 }else {
			 
			return list.stream().sorted((b1,b2)->b1.getBookName().compareToIgnoreCase(b2.getBookName())).collect(Collectors.toList());
		 }
	 }
	 
	 //viewBooksByAuthor method is used to return the book by author name;
	 
	 public List viewBooksByAuthor(String author)throws BookException {
		 
		List<Book> blist=new ArrayList<>();
		
		for(Book b:list) {
			
			if(b.getAuthor().equalsIgnoreCase(author)) {
				blist.add(b);
			}
		}
		
		if(blist.isEmpty()) {
			BookException be=new BookException("\r\n"+"Output: None of the book published by the author "+author+"\r\n");
			throw be;
		}
		 
		 return blist;
	 }
	 
	 //getBookByISBN method is used to return book details by is ISBN number
	 
		public Book getBookByISBN(int isbn)throws BookException {
			
			for(Book b: list) {
				
				if(b.getIsbn()==isbn){
					return b;
				}
			}
			
			throw new BookException("\r\n"+"Output: No book found for ISBN: " + isbn+"\r\n");
			
		 }
	 
	 
    
}

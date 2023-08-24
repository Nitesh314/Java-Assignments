package Library_Managment_System;

public class Books {
	
	private int bookId; //unique
	private String bookName;
	private String bookAuthor;
	
	
	public Books(int bookId,String bookName,String  bookAuthor) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
}

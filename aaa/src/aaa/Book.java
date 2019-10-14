package aaa;

public class Book {
	
	private String bookName;
	private String author;
	
	public Book(String bookName, String author) {
		
		this.bookName = bookName;
		this.author = author;
		
	}
	public void showBookInfo() {
			
		System.out.println(bookName +","+ author);
		}
		
	}


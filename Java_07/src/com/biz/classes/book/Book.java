package com.biz.classes.book;

public class Book {
	
	public String name;
	public String company;
	public String author;
	public int price;
	
	
	
	public void List() {
		
		System.out.printf("%s\t%s\t%s\t%d\n", name, company, author, price);
	}
	
	public void bookInfo() {
		
		System.out.println("도서명: " + name);
		System.out.println("출판사: " + company);
		System.out.println("저자: " + author);
		System.out.println("가격: " + price);
	}

}

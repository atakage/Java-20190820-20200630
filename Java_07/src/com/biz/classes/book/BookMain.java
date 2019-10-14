package com.biz.classes.book;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		Book b2 = new Book();
		
		b.author = "김";
		b.company = "A출판사";
		b.name = "책A";
		b.price = 10000;
		
		b2.author = "이";
		b2.company = "B출판사";
		b2.name = "책B";
		b2.price = 20000;
		
		
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(b);
		list.add(b2);
		
		
		System.out.println("-도서 리스트");
		System.out.println("도서명\t출판사\t저자\t가격\n");
		for(int i = 0; i < list.size(); i++) {
			list.get(i).List();
			
		}
		
		System.out.println("===================================");
		System.out.println("-"+b.name+"의 정보" );
		b.bookInfo();

	}

}

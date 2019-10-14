package array;

import java.util.ArrayList;

import aaa.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만"));
		library.add(new Book("ㅇㄸㄱ", "ㅇㅅㅁ"));
		
		for(int i = 0 ; i< library.size();i++) {
			
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		
		System.out.println("====================");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		
		
	}
}

package com.biz.books.exec;

import java.io.IOException;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.serivce.BookReadServiceV1;
import com.biz.books.serivce.BookViewServiceV1;

public class BookEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		BookReadServiceV1 bs = new BookReadServiceV1();
		BookViewServiceV1 bv = new BookViewServiceV1();
		
		String bookFile = "src/com/biz/books/도서정보.txt";
		
		
		try {
			bs.readBookInfo(bookFile);
			List<BookVO> bookList = bs.getBookList();
			bv.setBookList(bookList);
		//	bv.view();
			
			bv.search("다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

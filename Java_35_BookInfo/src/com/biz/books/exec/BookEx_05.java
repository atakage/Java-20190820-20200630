package com.biz.books.exec;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.serivce.BookReadServiceV1;
import com.biz.books.serivce.BookSaveServiceV1;
import com.biz.books.serivce.BookViewServiceV1;
import com.biz.books.serivce.ExcelServiceV1;

public class BookEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookReadServiceV1 bRead = new BookReadServiceV1();
		ExcelServiceV1 excel = new ExcelServiceV1();
		
		String bookFile = "src/com/biz/books/도서정보.txt";
		String bookSavePath = "src/com/biz/books/";
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			excel.setBookList(bookList);
			excel.excelSave(bookSavePath+"책","책");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

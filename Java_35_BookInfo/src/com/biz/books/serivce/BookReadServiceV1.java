package com.biz.books.serivce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.utils.BookSettings;

public class BookReadServiceV1 {
	
	
	private List<BookVO> bookList;

	
	
	
	public BookReadServiceV1() {
		// TODO Auto-generated constructor stub
		bookList = new ArrayList<BookVO>();
		
		
	}
	
	public List<BookVO> getBookList(){
		return bookList;
	}
	
	
	
	public void readBookInfo(String bookFile) throws IOException {
		
		FileReader fr = new FileReader(bookFile);
		BufferedReader br = new BufferedReader(fr);
		
		
		int lineNum = 0;
		
		while(true) {
		String str = br.readLine();
		

		System.out.println(++lineNum);
		if(str == null) break;
		
		
		String[] strArr = str.split(":");
		
		BookVO vo = new BookVO();
		
		
		vo.setB_isbn(strArr[BookSettings.FILE.ISBN]);
		vo.setB_comp(strArr[BookSettings.FILE.COMP]);
		vo.setB_title(strArr[BookSettings.FILE.TITLE]);
		vo.setB_writer(strArr[BookSettings.FILE.WRITER]);
		vo.setB_trans(strArr[BookSettings.FILE.TRANS]);
		vo.setB_date(strArr[BookSettings.FILE.DATE]);
		
		
		vo.setB_page(Integer.valueOf(strArr[BookSettings.FILE.PAGE].trim()));
		
		vo.setB_price(Integer.valueOf(strArr[BookSettings.FILE.PRICE].trim()));
		
		
		bookList.add(vo);
		
		
		}
		br.close();
		fr.close();
		
		System.out.println("생성완료");
		System.out.println(bookList);
		
		
		
	}
}

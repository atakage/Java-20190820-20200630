package com.biz.books.serivce;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

public class BookSaveServiceV1 {

	private List<BookVO> bookList;

	private PrintWriter fileOut = null;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	public void print(String saveFile) throws FileNotFoundException {

		fileOut = new PrintWriter(saveFile);

		this.listTitle();

		for (BookVO vo : bookList) {
			this.body(vo);
		}

		fileOut.close();

	}

	public void print(String saveFile, String text) throws FileNotFoundException {

		fileOut = new PrintWriter(saveFile);

		this.listTitle();

		for (BookVO vo : bookList) {
			if(vo.getB_title().contains(text.trim())) {
			this.body(vo);
			}
		}

		fileOut.close();

	}
	
	public void print(String saveFile, int grPrice, int lessPrice) throws FileNotFoundException {

		fileOut = new PrintWriter(saveFile);

		this.listTitle();

		for (BookVO vo : bookList) {
			int price = vo.getB_price();
			if(price >= grPrice && price <= lessPrice) {
			this.body(vo);
			}
		}

		fileOut.close();

	}

	private void listTitle() {

		fileOut.println("====================================");
		fileOut.println("도서 정보v1");
		fileOut.println("------------------------------------");
		fileOut.println("ISBN\t도서명\t출판사\t저자\t가격");

	}

	private void body(BookVO vo) {

		fileOut.print(vo.getB_isbn() + "\t");
		fileOut.print(vo.getB_title() + "\t");
		fileOut.print(vo.getB_comp() + "\t");
		fileOut.print(vo.getB_writer() + "\t");
		fileOut.print(vo.getB_price() + "\n");

	}

}

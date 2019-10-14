package com.biz.books.serivce;

import java.util.List;

import com.biz.books.domain.BookVO;

public class BookViewServiceV1 {

	List<BookVO> bookList;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	

	private void listTitle() {

		System.out.println("====================================");
		System.out.println("도서 정보v1");
		System.out.println("------------------------------------");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격");

	}

	private void body(BookVO vo) {

		System.out.print(vo.getB_isbn() + "\t");
		System.out.print(vo.getB_title() + "\t");
		System.out.print(vo.getB_comp() + "\t");
		System.out.print(vo.getB_writer() + "\t");
		System.out.print(vo.getB_price() + "\n");

	}

	public void view() {

		this.listTitle();

		for (BookVO vo : bookList) {

			this.body(vo);

		}
	}
	
	public void search(String text) {

		this.listTitle();

		for (BookVO vo : bookList) {

			if (vo.getB_title().contains(text)) {			

				this.body(vo);
			}

		}

	}
	
	
	public void search(int startPrice, int endPrice) {

		this.listTitle();

		for (BookVO vo : bookList) {

			int price = vo.getB_price();
			if (startPrice <= price && price <= endPrice) {			

				this.body(vo);
			}

		}

	}
}

package com.biz.books.serivce;
// Java에서 Binary(이미지, 영상, 음성, 엑셀)들은 기본적으로 읽긴ㄴ 가능하지만 연산처리는 어려움

// 형식에 맞게 저장하는 것도 어려움

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.biz.books.domain.BookVO;

//Binary 파일을 읽고 쓰는 데는 3rd Party SDK(Software Devel. Kit)를 빌려와 사용해야 함

//엑셀 저장하기는 text 파일 저장하기를 조금 으용하면 아쉬운 대로 사용 가능
public class ExcelServiceV1 {

	private List<BookVO> bookList;
	private String excelExt = ".csv"; // comma separater value
	int listSize = 10;

	// FileWriter fileWriter;

	// FileOutputStream fos;
	BufferedWriter buffer;

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	private void bufferOpen(String fileName) throws FileNotFoundException, UnsupportedEncodingException {

		FileOutputStream fos = new FileOutputStream(fileName + excelExt); // 한글 encoding을 변환
		// excel 파일의 한글 encoding 으로 변환 : euc-kr

		fos = new FileOutputStream(fileName + excelExt);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "euc-kr");

		buffer = new BufferedWriter(osw);

	}

	public void excelSave(String fileName, String text) throws IOException {

		this.bufferOpen(fileName);
		this.title();

		listSize = 1;

		for (BookVO vo : bookList) {

			if(vo.getB_title().contains(text.trim())) {
				this.body(vo);
				listSize ++;
			}
			
		}

		this.footer();

		buffer.flush();
		buffer.close();
		// fileWriter.close();

	}
	
	public void excelSave(String fileName, int grPrice, int lessPrice) throws IOException {

		this.bufferOpen(fileName);
		this.title();

		listSize = 1;

		for (BookVO vo : bookList) {
			
			int price = vo.getB_price();

			if(price >= grPrice && price <= lessPrice) {
				this.body(vo);
				listSize ++;
			}

		}

		this.footer();

		buffer.flush();
		buffer.close();
		// fileWriter.close();

	}

	private void title() throws IOException {

		buffer.write("ISBN,");
		buffer.write("도서명,");
		buffer.write("출판사,");
		buffer.write("저자,");
		buffer.write("발행일,");
		buffer.write("가격,");
		buffer.newLine(); // enter 키 입력
		buffer.flush();
	}

	private void body(BookVO vo) throws IOException {

		buffer.write("'" + vo.getB_isbn() + ",");
		buffer.write(vo.getB_title() + ",");
		buffer.write(vo.getB_comp() + ",");
		buffer.write(vo.getB_writer() + ",");
		buffer.write(vo.getB_date() + ",");
		buffer.write(vo.getB_price() + ",");
		buffer.newLine();
		buffer.flush();

	}

	private void footer() throws IOException {
		buffer.write("도서개수,");
		buffer.write("=COUNTA(B2..B" + listSize + "), ");
		buffer.newLine();
		buffer.flush();

	}

}

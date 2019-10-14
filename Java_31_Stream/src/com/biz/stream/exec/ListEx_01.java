package com.biz.stream.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.biz.stream.domain.BookVO;

public class ListEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String objSaveFile = "src/com/biz/stream/bookList.dat";

		List<BookVO> bookList = new ArrayList<BookVO>();

		BookVO bookVO = new BookVO();
		bookVO.title = "Java만세";
		bookVO.company = "영진출판사";
		bookVO.price = 5000;

		bookList.add(bookVO);

		bookVO = new BookVO();

		bookVO.title = "오라클";
		bookVO.company = "생능출판사";
		bookVO.price = 30000;

		bookList.add(bookVO);

		bookVO = new BookVO();

		bookVO.title = "Do it Java";
		bookVO.company = "이지퍼블";
		bookVO.price = 25000;

		bookList.add(bookVO);
		
		OutputStream os = null;					// 인터페이스와 유사한 추상클래스를 사용하여 선언, 이때 각 개체는 null로 초기화
		ObjectOutput oos = null;
		
		try {
			os = new FileOutputStream(objSaveFile);
			oos = new ObjectOutputStream(os);				// app 내에서 사용되는 변수, 객체 값을 파일로 저장하기 위한 보조 stream 연결
			
			oos.writeObject(bookList);
			oos.flush();
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.biz.books.exec;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.serivce.BookReadServiceV1;
import com.biz.books.serivce.BookSaveServiceV1;
import com.biz.books.serivce.BookViewServiceV1;

public class BookEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookReadServiceV1 bs = new BookReadServiceV1();
		BookViewServiceV1 bv = new BookViewServiceV1();
		BookSaveServiceV1 bSave = new BookSaveServiceV1();

		Scanner scanner = new Scanner(System.in);

		String bookFile = "src/com/biz/books/도서정보.txt";
		String bookSavePath = "src/com/biz/books/";

		try {
			bs.readBookInfo(bookFile);
			List<BookVO> bookList = bs.getBookList();
			bv.setBookList(bookList);
			bSave.setBookList(bookList);
			// bv.view();

			// bv.search("다");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {
			System.out.println("======================");
			System.out.println("도서 검색");
			System.out.println("========================");
			System.out.println("1.제목 2.가격 0.종료");
			System.out.print(">>");
			String strM = scanner.nextLine();

			int intM = Integer.valueOf(strM);

			if (intM == 0) {
				System.out.println("업무 종료");
				break;
			}

			if (intM == 1) {

				System.out.print("제목>>");
				String strTitle = scanner.nextLine();
				bv.search(strTitle);

				System.out.print("파일로 저장(YES/NO)>> ");
				String sOK = scanner.nextLine();
				if (sOK.equalsIgnoreCase("YES")) {
					try {
						bSave.print(bookSavePath + strTitle + ".txt", strTitle);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else if (intM == 2) {
				System.out.print("최저 가격 입력>>");
				String sPrice = scanner.nextLine();
				System.out.print("최고 가격 입력>>");
				String ePrice = scanner.nextLine();

				try {
					bv.search(Integer.valueOf(sPrice), Integer.valueOf(ePrice));
				} catch (Exception e) {
					// TODO: handle exception1
					System.out.println("가격은 숫자로만");
				}

				System.out.print("파일로 저장(YES/NO)>> ");
				String sOK = scanner.nextLine();
				if (sOK.equalsIgnoreCase("YES")) {

					try {
						bSave.print(bookSavePath + sPrice + "-" + ePrice + ".txt", Integer.valueOf(sPrice),
								Integer.valueOf(ePrice));
					} catch (NumberFormatException | FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}

	}

}

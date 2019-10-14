package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV1 implements BookService{

	Scanner scan;
	List<BookVO> bookList;
	
	
	public BookServiceImpV1() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	
	public void input(int count) {
		
		for(int i = 0; i < count; i++) {
			
			this.input();
			
		}
	}
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		
		
			
			System.out.print("도서번호> ");
			String strNum = scan.nextLine();
			
			System.out.print("도서명> ");
			String strName = scan.nextLine();
			
			System.out.print("저자> ");
			String strAuthor = scan.nextLine();
			
			System.out.print("출판사> ");
			String strComp = scan.nextLine();
			
			System.out.print("가격> ");
			int intPrice = 0;	
			
			
			try {										// 공백 입력 시 정수형으로 전환 불가 NumberFormatException
													// 예외 처리 필요	
			
			 intPrice =  Integer.valueOf(scan.nextLine());
			
			
			
			} catch (NumberFormatException ne) {
				System.out.println("가격에 공백 포함");
				return;
			} 
			
			
			System.out.print("출판연도> ");
			int intYear = 0;
			
			try {
				
				 intYear =  Integer.valueOf(scan.nextLine());
				
				
				
				} catch (NumberFormatException ne) {
					// TODO: handle exception
					System.out.println("출판연도에 공백 포함");
					return;
				} 
			
			
			
			
			BookVO bookvo = new BookVO();
			
			bookvo.setNum(strNum);
			bookvo.setStrName(strName);
			bookvo.setStrWriter(strAuthor);
			bookvo.setStrComp(strComp);
			bookvo.setIntPrice(intPrice);
			bookvo.setIntYear(intYear);
			
			
			bookList.add(bookvo);
	
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
		System.out.println("=======================================");
		System.out.println("도서 정보 일람표");
		System.out.println("======================================");
		System.out.println("ISBN\t도서명\t저자\t출판사\t가격\t출판연도");
		
		int size = bookList.size();
		for(int i = 0; i < size; i++) {
			
			BookVO vo = bookList.get(i);
			
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n", vo.getIntYear());
		}
		
	}

	@Override
	public void view(int index) {
		// TODO Auto-generated method stub
		
		
		BookVO vo = bookList.get(index);
		
			System.out.println("=============================");
			System.out.println(index+"번째 도서 정보 출력");
			System.out.println("=============================");
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n", vo.getIntYear());
		
		
	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		int size = bookList.size();
		for(int i = 0; i < size; i++) {
			
			if(bookList.get(i).getStrName().equals(strName)) {
				BookVO vo = bookList.get(i);

				System.out.print(vo.getNum() + "\t");
				System.out.print(vo.getStrName() + "\t");
				System.out.print(vo.getStrWriter() + "\t");
				System.out.print(vo.getStrComp() + "\t");
				System.out.printf("%5d\t",vo.getIntPrice());
				System.out.printf("%4d\n", vo.getIntYear());
			}
			
		}
		
	}

	
}

package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV2 implements BookService {
	
	Scanner scan;
	List<BookVO> bookList;
	
	
	public BookServiceImpV2() {
		
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	
		
	}
	

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
		
		
	
		BookVO vo = new BookVO();
		
		System.out.print("ISBM:");
		vo.setNum( scan.nextLine());
		System.out.print("도서명:");
		vo.setStrName(scan.nextLine());
		System.out.print("저자:");
		vo.setStrWriter(scan.nextLine());
		System.out.print("출판사:");
		vo.setStrComp(scan.nextLine());
		
		
		
		try {
			
			System.out.print("가격:");
			vo.setIntPrice(Integer.valueOf(scan.nextLine()));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("가격은 숫자만 입력하시오");
			throw new NumberFormatException();				//나를 호출한 input 예외 던짐
		}
			
			
		try {
			
			System.out.print("출판년도:");
			vo.setIntYear(Integer.valueOf(scan.nextLine()));
		}catch(Exception e) {
			System.out.println("년도는 숫자로만 입력");
			
			while(true) {
				System.out.print("년도 다시 입력(종료는 -1) > ");
				
				try {
					vo.setIntYear(Integer.valueOf(scan.nextLine()));
					if(vo.getIntYear() == -1) break;
					break;
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		
		bookList.add(vo);

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("ISBM\t도서명\t저자\t출판사\t가격\t출판연도");
		System.out.println("============================================");
	
		/*
	   int size =	bookList.size();
		for(int i = 0; i < size; i++) {
			
			System.out.print(bookList.get(i).getNum()+"\t");
			System.out.print(bookList.get(i).getStrName()+"\t");
			System.out.print(bookList.get(i).getStrWriter()+"\t");
			System.out.print(bookList.get(i).getStrComp()+"\t");
			System.out.print(bookList.get(i).getIntPrice()+"\t");
			System.out.print(bookList.get(i).getIntYear()+"\n");
		}
		
		*/
		
		
		for(BookVO vo : bookList) {
			
			System.out.print(vo.getNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getStrWriter()+"\t");
			System.out.print(vo.getStrComp()+"\t");
			System.out.print(vo.getIntPrice()+"\t");
			System.out.print(vo.getIntYear()+"\n");
			
		}

	}

	@Override
	public void view(int index) {
		// TODO Auto-generated method stub
		
		
		int size = bookList.size();
		
		BookVO vo = bookList.get(index);
		System.out.println("↓↓↓"+index+"번째 도서 정보↓↓↓");
		
			
			System.out.println("ISBM: "+vo.getNum());
			System.out.println("도서명: "+vo.getStrName());
			System.out.println("저자: "+vo.getStrWriter());
			System.out.println("출판사: "+vo.getStrComp());
			System.out.println("가격: "+vo.getIntPrice());
			System.out.println("출판연도: "+vo.getIntYear());
		
	

	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		
	int size = bookList.size();
		
		System.out.println("↓↓↓"+strName+"의 도서 정보↓↓↓");
		for(int i = 0; i < size; i++) {
			
			BookVO vo = bookList.get(i);
			String voStrName		=	vo.getStrName();
			if(voStrName.equals(strName)) {
			
			this.view(i);
			
			}
			
			if(voStrName.toUpperCase().contains(strName.toUpperCase())) {
				
				this.view(i);
			}
		}

			
	}

	@Override
	public void input(int count) {
		// TODO Auto-generated method stub
		
		
		for(int i = 0; i < count; i++) {
			System.out.println("=================");
			System.out.println((i+1) + "번째 도서 정보 입력");
			System.out.println("=================");
			try {
			this.input();
			}catch(Exception e) {
				System.out.println("데이터를 다시 입력");
				i--;
				continue;					//for문 되돌아감
			}
		}
	}

}

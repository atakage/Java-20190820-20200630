package com.biz.list.exec;

import com.biz.list.model.BookVO;

public class List_01 {
	
	
	public static void main(String[] args) {
		
		
		BookVO bookVO = new BookVO();
		
		bookVO.setNum("970001");
		bookVO.setStrName("Do It Java");
		bookVO.setStrWriter("박은종");
		bookVO.setStrComp("이지퍼블리싱");
		bookVO.setIntPrice(25000);
		bookVO.setIntYear(2018);
		
		
		
		System.out.println("ISBN :" + bookVO.getNum());
		System.out.println("도서명 :" + bookVO.getStrName());
		System.out.println("저자 :" + bookVO.getStrWriter());
		System.out.println("출판사 :" + bookVO.getStrComp());
		System.out.println("가격 :" + bookVO.getIntPrice());
		System.out.println("출판연도 :" + bookVO.getIntYear());
		
	}

}

package com.biz.list.exec;

import com.biz.list.service.BookService;
import com.biz.list.service.BookServiceImpV2;

public class List_02 {
	
	public static void main(String[] args) {
	
		
		BookService bs = new BookServiceImpV2();
		
		bs.input(); 	// BookService에 BookServiceImV1()의 메서드 없을 경우 
						//((BookServiceImpV1)bs).input(3); <- 이런 식으로 다운캐스팅 해 써야함
						//이런 경우는 그냥 인터페이스에 추상메서드 추가
		
		bs.list();
		
		
		
		

		
		
	}
}

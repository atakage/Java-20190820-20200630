package com.biz.classes.model;


/*
 * 
 * VO클래스
 * Value Object 클래스
 * 데이터의 묶음(멤버 변수)을 처리할 때 사용
 * 
 */
public class BookVO {
	
	public String strTitle;
	public String strComp;
	public String strAuth;
	public int intPrice;
	
	
	public void view() {
		System.out.println("도서명: " + strTitle);
		System.out.println("출판사: " + strComp);
		System.out.println("저자: " + strAuth);
		System.out.println("가격: " + intPrice);
		
	}
	
	public void list() {
		System.out.printf("%s\t%s\t%s\t%d\n", strTitle, strComp, strAuth, intPrice);
		
	}

}

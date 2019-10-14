package com.biz.iolist.model;

/*
 * 
 * 클래스를 작성할 때 다른 클래스를 extends 하지 않으면 모든 클래스는 Object 클래스를 자동으로 상속 받음
 * Object에는 클래스를 객체로 생성하거나 하는 몇 가지 메서드가 설정되어 있음
 * 
 */

public class BookVO {

	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;
	
	public BookVO() {	//클래스를 선언하면 매개변수가 없는 생성자가 보이지 않지만 자동으로 만들어져서 
							//자신이 가지고 있는 멤버변수(필드)들을 초기화 하도록 구성되어 있음
								//생성자 메서드는 클래스에 선언된 멤버변수(필드)를 초기화
		// TODO Auto-generated constructor stub
		
		
		strName = "";				//생성자 메서드에 감춰진 코드들(멤버변수가 String, primitive 타입인 경우에만) 
		strWriter = "";					
		strComp = "";
		intPrice = 0;
		intYear = 0;
		
		
	}
	
	public BookVO(String strName) {		
		this.strName = strName;			//멤버 변수를 초기화 할 때 strName =""으로 하지 않고 매개변수에 받은 값으로 초기화
	}								//만약 매개변수 포함된 생성자 만들면 public BookVO(){} 코드 만들어지지 않음

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrWriter() {
		return strWriter;
	}

	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}

	public String getStrComp() {
		return strComp;
	}

	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}

	public int getIntPrice() {
		return intPrice;
	}

	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}

	public int getIntYear() {
		return intYear;
	}

	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}

}

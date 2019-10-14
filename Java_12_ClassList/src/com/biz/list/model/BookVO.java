package com.biz.list.model;


/*
 * VO 클래스를 만들 때
 * 1. 추상화 단계: 어떤 멤버 변수(필드)
 * 2. 정보 은닉
 * 3. 캡슐화: 은닉된 멤버 변수 접근 위해 getter(), setter()
 * 
 */

public class BookVO {
	
	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;
	private String num;
	
	
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
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	

}

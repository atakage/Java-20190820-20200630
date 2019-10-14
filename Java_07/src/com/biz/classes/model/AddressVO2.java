package com.biz.classes.model;

public class AddressVO2 {

	public String strName;
	public String strTel;
	public String strAddr;
	public String strChain;
	
	public void view() {
		System.out.println("이름: "+ strName);
		System.out.println("전화번호: "+ strTel);
		System.out.println("주소: " + strAddr);
		System.out.println("관계: " + strChain);
	}
	
}
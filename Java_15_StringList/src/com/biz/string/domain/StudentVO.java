package com.biz.string.domain;

/*
 * VO(Value Object) 저장 패키지  이름 model, domain, command....
 * Dto(Data Transfer Object): VO와 쓰임새가 거의 같음, VO와 혼용해서 사용하기도 함
 */

public class StudentVO {

	private String strNum; // 멤버 변수 , 필드, 속성
	private String strName;
	private String strAddr;
	private String strTel;
	private int intAge;
	
	

	public StudentVO(String strNum, String strName, String strAddr, String strTel, int intAge) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.intAge = intAge;
	}
	
	

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public int getIntAge() {
		return intAge;
	}

	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}

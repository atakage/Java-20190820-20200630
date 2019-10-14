package com.biz.iolist.model;

public class GradeVO {
	
	/*
	 * 
	 * VO클래스 만들기
	 * 1. 멤버변수 private
	 * 2. getter setter
	 * 3. super생성자, field 생성자ㅉ
	 * 4.toString() 정의
	 */

	private String strNum;
	private String strName;
	private int intKor;
	
	
	
	
	public GradeVO(String strNum) {
		this.strNum = strNum;
	}
	

	public GradeVO() {
		super();			//오브젝트에 있는 생성자 호출(숨겨짐)
		// TODO Auto-generated constructor stub
	}
	
	

	public GradeVO(String strNum, String strName, int intKor) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKor = intKor;
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

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}



	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + "]";
	}



}

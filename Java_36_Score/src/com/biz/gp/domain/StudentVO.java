package com.biz.gp.domain;

public class StudentVO {
	
	/*
	 * 
	 * 정보은닉 - 필드(멤버변수) private 설정, 외부에서 필드에 직접 접근 막는 것
	 * 
	 * 캡슐화 - 외부에서 간접적으로 접근할 수 있는 통로 설정(getter,setter), 단순히 접근 통로뿐만 아니라 내부에서  어떤 연산 수행하고 값을 변경 후에 외부에 노출하거나
	 * 				외부에서 주입되는 값을 검증하는 코드를 추가해 논리적으로 잘못된 데이터가 필드변수에 추가되는 것을 막는 일
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	private String st_num;
	private String st_name;
	private String st_tel;
	private String st_addr;
	private int st_grade;
	private String st_dept;
	
	
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(String st_num, String st_name, String st_tel, String st_addr, int st_grade, String st_dept) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_tel = st_tel;
		this.st_addr = st_addr;
		this.st_grade = st_grade;
		this.st_dept = st_dept;
	}
	public String getSt_num() {
		return st_num;
	}
	public void setSt_num(String st_num) {
		this.st_num = st_num;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_tel() {
		return st_tel;
	}
	public void setSt_tel(String st_tel) {
		this.st_tel = st_tel;
	}
	public String getSt_addr() {
		return st_addr;
	}
	public void setSt_addr(String st_addr) {
		this.st_addr = st_addr;
	}
	public int getSt_grade() {
		return st_grade;
	}
	public void setSt_grade(int st_grade) {
		this.st_grade = st_grade;
	}
	public String getSt_dept() {
		return st_dept;
	}
	public void setSt_dept(String st_dept) {
		this.st_dept = st_dept;
	}
	
	

}
package com.biz.classes.student;

public class Student {
	
	public String num;
	public String name;
	public int year;
	public String subject;
	public String grade;
	public String ex = "12345";

	
	public int gradeC() {
		int result;
		result = 2019 - getYear();
		
		return result;
		
		
	}
	
	public void Studentlist() {
		
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\n", getNum(), getName(), getYear(), getSubject(), gradeC());
		
		
		
	}
	
	public void PersonalList() {
		
		System.out.println("학번: " + getNum() );
		System.out.println("이름: " + getName() );
		System.out.println("입학년도 :" + getYear());
		System.out.println("전공 :" + getSubject());
		System.out.println("학년 :" + gradeC());
	}
	
	

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}

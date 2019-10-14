package com.biz.classes.student;

public class Student2 {
	
	
	
	public String strNum;
	public String strName;
	public int intYear;
	public String strDept;
	//public int intGrade;
	
	public void viewInfo() {
		System.out.println("학번:" + strNum);
		System.out.println("이름:" + strName);
		System.out.println("입학년도" + intYear);
		System.out.println("전공" + strDept);
		System.out.println("학년" + (2019 - intYear));
	}
	
	
	public void List() {
		System.out.printf("%s\t%s\t%d\t%s\t%d\n", strNum, strName, intYear, strDept, 2019-intYear);
		
	}
}

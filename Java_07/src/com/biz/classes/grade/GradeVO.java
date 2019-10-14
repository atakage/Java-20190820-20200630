package com.biz.classes.grade;

public class GradeVO {
	
	
	
	public  String strNum;
	public String strName;
	public  int intKor;
	public  int intEng;
	public  int intMath;
	public int sumval;
	
	
	
	public void gradeList() {
		
		//%s: 문자열
		//%c: 문자
		sumval = intKor + intEng + intMath;
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\n", strNum, strName, intKor, intEng, intMath, sumval);
		
	}
	
	
public void sum() {
		
		int sum = intKor + intEng + intMath;
		System.out.println("총점:" + sum);
		System.out.println("평균:" + sum/3);
	}

}

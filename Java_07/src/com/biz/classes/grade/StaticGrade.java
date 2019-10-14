package com.biz.classes.grade;

/*
 * 멤버 변수, 메서드에 한 개라도 static 키워드르 붙이면 
 * class는 static class가 됨
 * 
 * 
 * static class는 프로젝트를 실행하면
 * JVM이 자동으로 클래스를 선언 생성 초기화하여 사용할 수 있도록 미리 준비
 */

public class StaticGrade {

	public static String strNum;
	public static String strName;
	public static int intKor;
	public static  int intEng;
	public static  int intMath;
	
	
	public static void sum() {
		
		int sum = intKor + intEng + intMath;
		System.out.println(sum);
		
	}
	
	
}

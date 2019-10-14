package com.biz.classes;

import com.biz.classes.grade.GradeVO;
import com.biz.classes.grade.StaticGrade;

public class StartMain {
	
	public static void main(String[] args) {
		
		/*
		 * static 클래스는 선언, 생성, 초기화 과정을 코딩하지 않고
		 * class.~~~ 방식으로 접근
		 * 
		 */
		
		StaticGrade.strNum = "001";
		StaticGrade.strName = "홍길동";
		StaticGrade.intKor = 90;
		StaticGrade.intEng = 88;
		StaticGrade.intMath = 77;
		
		StaticGrade.sum();
		
		
		/*
		 * non static class 는 접근 전에 대리자를 선언, 생성, 초기화 과정을 코딩해야 함
		 * 대리자: 객체, Object, instance
		 */
		GradeVO grade01 = new GradeVO();
		
		grade01.strNum = "002";
		grade01.strName = "성춘향";
		grade01.intKor = 99;
		grade01.intEng = 99;
		grade01.intMath = 99;
		
		
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		
		grade01.sum();
		
		
		
		
	}

}

package com.biz.classes;

import java.util.ArrayList;

import com.biz.classes.grade.GradeVO;

public class GradeMain_03 {

	public static void main(String[] args) {
		
		GradeVO grade01 = new GradeVO();
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		GradeVO grade06 = new GradeVO();
		GradeVO grade07 = new GradeVO();
		
		
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		
		
		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		grade02.intEng = 88;
		grade02.intMath = 66;
		grade02.intKor = 78;
		
		
		
		grade03.strNum = "003";
		grade03.strName = "이몽룡";
		grade03.intEng = 98;
		grade03.intMath = 78;
		grade03.intKor = 68;
		
		
		System.out.println("========================");
		System.out.println("응용SW 성적표");
		System.out.println("-------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		
		
		
		ArrayList<GradeVO> list = new ArrayList<GradeVO>();
		list.add(grade01);
		list.add(grade02);
		list.add(grade03);
		
		System.out.println("========================");
		System.out.println("응용SW 성적표");
		System.out.println("-------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t");
		
		for(int i = 0; i < list.size(); i++) {
			
			list.get(i).gradeList();
		}
		
	}
}

package com.biz.classes.grade;

import java.util.Scanner;

public class GradeEx_01 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		GradeVO gVO = new GradeVO();
		
		
		System.out.println("===============");
		System.out.println("성적 정보 입력");
		
		System.out.print("학번 >> ");
		String strNum = scanner.nextLine();
		
		System.out.print("이름 >>");
		String strName = scanner.nextLine();
		
		System.out.print("영어 >>");
		String strEng = scanner.nextLine();
		
		System.out.print("국어 >>");
		String strKor = scanner.nextLine();
		
		System.out.print("수학 >>");
		String strMath = scanner.nextLine();
		
		gVO.strNum = strNum;
		gVO.strName = strName;
		gVO.intEng = Integer.parseInt(strEng);
		gVO.intKor = Integer.parseInt(strKor);
		gVO.intMath = Integer.parseInt(strMath);
		
	
		
		gVO.sum();
	}

}

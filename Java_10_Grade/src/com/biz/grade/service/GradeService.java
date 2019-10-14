package com.biz.grade.service;

import java.util.Scanner;

public class GradeService {
	
	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	private int[] sum;
	
	private Scanner scan;
	
	public GradeService(int length) {
		
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];
		sum = new int[length];
		
		scan = new Scanner(System.in);
	}
	
	
	public void input() {
		
		for(int i = 0; i < intKor.length; i++) {
			System.out.print(i+1 + "번 국어 >>");
			intKor[i] = Integer.valueOf(scan.nextLine());
			
			System.out.print(i+1 + "번 영어 >>");
			intEng[i] = Integer.valueOf(scan.nextLine());
			
			System.out.print(i+1 + "번 수학 >>");
			intMath[i] = Integer.valueOf(scan.nextLine());
		}
		
	}
	
	
	public void view() {
		System.out.println("=========================");
		System.out.println("성적 일람표");
		System.out.println("-------------------------");
		System.out.println("국어\t영어\t수학");
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i]);
		}
		
	}

}

package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		Random rd = new Random();
		int korTotal = 0;
		int engTotal = 0;
		
		for(int i = 0; i < intKor.length; i++) {
			
			intKor[i] = rd.nextInt(100)+1;
			intEng[i] = rd.nextInt(100)+1;
			korTotal = korTotal + intKor[i];
			engTotal = engTotal + intEng[i];
			
		}
		
		
		System.out.printf("Kor\tEng\n");
		System.out.println("------------------------------");
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t", intKor[i]);
			System.out.printf("%d\n", intEng[i]);
		}
		
		System.out.println("-------------------------------");
		System.out.printf("%d\t", korTotal);
		System.out.printf("%d\t\n", engTotal);
		System.out.println("===============================");
	}

}

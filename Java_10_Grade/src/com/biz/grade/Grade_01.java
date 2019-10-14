package com.biz.grade;
import java.util.Scanner;

public class Grade_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] intKor = new int[5];
		Scanner scanner = new Scanner(System.in);
		String val;
				
				
			
				for(int i = 0; i < intKor.length; i++) {
					
					System.out.print(i+"번째 점수 입력: ");
					val = scanner.nextLine();
					intKor[i] = Integer.valueOf(val);
				}
				
				
				for(int i = 0; i <intKor.length; i++) {
					
					System.out.print(intKor[i]+", ");
				}
	}

}

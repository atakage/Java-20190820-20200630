package com.biz.classes;

import java.util.Scanner;

public class Prime_02 {
	
	public static void main(String[] args) {
		
		
		PrimeService ps = new PrimeService();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자(-1:종료) >> ");
			String strNum = scanner.nextLine();
			int num = Integer.valueOf(strNum);
			
			if(num < 0) break;
			ps.checkPrime(num);
			System.out.println("=====================================");
			
		}
		
		System.out.println("게임 오버");
		
		
		
	
		
		
		
	}

}

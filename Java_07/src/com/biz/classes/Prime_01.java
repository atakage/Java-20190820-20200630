package com.biz.classes;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {
		
	

	
	Scanner scanner = new Scanner(System.in);
	System.out.print("숫자 >> ");
	String strNum = scanner.nextLine();
	
	int number = Integer.valueOf(strNum);
	
	int index;
	for(index = 2; index < number; index++) {
		if(number % index == 0)break;
		
	}
	
	if(index >= number)
		System.out.println(number+"는 소수");
	else 
		System.out.println(number+"는 소수가 아님");
	
}
	
}

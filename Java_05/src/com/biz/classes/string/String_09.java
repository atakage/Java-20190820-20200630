package com.biz.classes.string;

import java.util.Scanner;

public class String_09 {
	
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		Scanner scanner = new Scanner(System.in);
		int intLength = strNation.length();
		
		System.out.println("전체 문자열:" + strNation);
		System.out.print("입력할 문자:" );
		String val = scanner.nextLine();
		
		for(int i = 0; i < intLength; i++ ) {
		
		if(strNation.substring(i, i+1).equals(val)) {
			System.out.println("'"+val+"'"+"문자: "+i+"열에 있음");
			break;
		}
		
		
		}
	}
}


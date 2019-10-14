package com.biz.string;

public class String_05 {
	
	public static void main(String[] args) {
		
		int num = 30;
		boolean bYes = num == 30;
		
		if(bYes) System.out.println("num에는 30이 담겨 있다");
		else System.out.println("num에는 30이 담겨 있지 않다");
		
		
		num = 50;
		int num1 = 30;
		
		bYes = num == num1;
		
		String strNation = "Korea";
		String strKorea = "Korea";
		
		bYes = strNation == strKorea;
		if(bYes) System.out.println("두 문자열 일치");
		else System.out.println("두 문자열 다름");
		
		
		if(strNation == strKorea) System.out.println("두 문자열 일치");
		else System.out.println("두 문자열 다름");
		
		
		bYes = strNation.equals(strKorea);
		bYes = strKorea.equals(strNation);
		
		//대소문자에 관계없이 단어나열이 일치한가
		bYes = strNation.equalsIgnoreCase(strKorea);
		bYes = strKorea.equalsIgnoreCase(strNation);
		
	}

}

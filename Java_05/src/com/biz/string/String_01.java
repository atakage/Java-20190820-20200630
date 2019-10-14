package com.biz.string;

public class String_01 {
	
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String s = "Korea";
		
		int num = 3;
		
		int intLength = strNation.length();
		
		System.out.println("strNation 문자열 개수: " +intLength);
		
		strNation="대한민국";
		System.out.println(strNation.length());
		
		String s1 = "Korea";
		String s2 = "대한민국";
		int sum = s1.length() + s2.length();
		
		System.out.println("문자열 개수 합: " +sum);
	}

}

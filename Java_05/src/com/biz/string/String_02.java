package com.biz.string;

public class String_02 {
	
	public static void main(String[] args) {
		
		String strNation  = "Republic of Korea";
		
		int intLength = strNation.length();
		
		
		// for문의 반복 회수 intLength 만큼
		// 변수 i의 변화는 0 ~ (intLength -1)
		for(int i = 0; i < intLength; i++) {
			
			
		}
		
		
		for(int i = 0; i < intLength; i++) {
			char cA = strNation.charAt(i);
			System.out.println(i + "번째: " + cA);
		}
		
		System.out.println("===============================");
		
		for(int i = 0; i < intLength; i++) {
			char cA = strNation.charAt(i);
			System.out.println(cA);
		}
	}

}

package com.biz.string;

public class String_04 {
	
	public static void main(String[] args) {
		
		
		String strNation = "Republic of Korea";
		
		String strKorea = strNation.substring(12); //12번째 위치부터 잘라서 strKorea에 담기 
		System.out.println(strKorea);
		
		String strPub = strNation.substring(2, 8);//2번째 위치부터 8번 앞까지 잘라서 strPub에 담기
		
		System.out.println(strPub);
	}

}

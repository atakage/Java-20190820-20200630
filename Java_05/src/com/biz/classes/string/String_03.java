package com.biz.classes.string;

public class String_03 {
	
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		
		char cSearch = 'u';
		
		int index = 0;
		
		
		
		for(int i = 0; i < intLength; i++) {
			
			char cA = strNation.charAt(i);
			if(cA == cSearch)
				System.out.println(i + "번 위치에 있음");
			
			
		}
		
		
		
		
	}

}

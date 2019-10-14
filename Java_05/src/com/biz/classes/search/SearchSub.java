package com.biz.classes.search;

import java.util.Scanner;

public class SearchSub {
	
	
	public String strNation;
	

	public void main() {
		// TODO Auto-generated method stub
		//String strNation = "Republic of Korea";
		
		int intLength = strNation.length();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("제시된 문자열: " + strNation);
		System.out.print("1개의 문자열을 입력: ");
		String val = scanner.nextLine();
		
		int index = 0;
	
		
		for(index = 0; index < intLength; index++ ) {
			
			String strAt = strNation.substring(index, index+1);
			if(strAt.equalsIgnoreCase(val))break;
			
		}
			System.out.println(index);
			
			if(index < intLength)
				System.out.println(index + "번째에서 찾음");
			else
				System.out.println("없는 문자열");
		
			
			
		
		}
}

	
	


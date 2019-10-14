package com.biz.classes.search;

import java.util.Scanner;

public class FakeTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String strNation = "Republic of Korea";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("제시된 문자열: " + strNation);
		System.out.print("1개의 문자열을 입력: ");
		String val = scanner.nextLine();
		
		int index = 0;
	
		
		for(index = 0; index < strNation.length(); index++ ) {
			
			String strAt = strNation.substring(index, index+1);
			if(strNation.equalsIgnoreCase(val))
				System.out.println(index + "번째에서 찾음");
			else
				System.out.println("못 찾음");
			break;
			
		}
	}

}

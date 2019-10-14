package com.biz.classes.string;

public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNation = "Republic of Korea";
		
		
		String ch;
		int num = 0;
		
		for(int i = 0; i < strNation.length(); i++) {
			
			if(strNation.substring(i, i+1).equals("u")) {
				num = i;
			}
		}
		
		System.out.println(num);

		
	}

}

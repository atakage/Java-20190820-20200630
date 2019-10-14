package com.biz.classes.string;

public class String_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNation = "Republic of Korea";
		
		String strSearch = "r";
		
		int intLength = strNation.length();
		int index = 0;
		
		 
		 String strAt = strNation.substring(index, index+1);
		 if(strAt.equalsIgnoreCase(strSearch)) System.out.println(index + "번째 위치에서 찾음");
		 index++;
		 
		 strAt = strNation.substring(index, index+1);
		 if(strAt.equalsIgnoreCase(strSearch)) System.out.println(index + "번째 위치에서 찾음");
		 index++;
		 
		 strAt = strNation.substring(index, index+1);
		 if(strAt.equalsIgnoreCase(strSearch)) System.out.println(index + "번째 위치에서 찾음");
		 index++;
		 strAt = strNation.substring(index, index+1);
		 if(strAt.equalsIgnoreCase(strSearch)) System.out.println(index + "번째 위치에서 찾음");
		 index++;
		 
		 
		 

	}

}

package com.biz.classes;

public class String2Number_02 {
	
	public static void main(String[] args) {
		
	
	String strNum = "30";
	System.out.println(Integer.valueOf(strNum));
	//String strNum2 = "30 ";
	//System.out.println(Integer.valueOf(strNum2));
	//String strNum3 = " 30";
	//System.out.println(Integer.valueOf(strNum3));
	String strNum4 = "A39";
	System.out.println(Integer.valueOf(strNum4));
	String strNum5 = "39A";
	System.out.println(Integer.valueOf(strNum5));
	}
}

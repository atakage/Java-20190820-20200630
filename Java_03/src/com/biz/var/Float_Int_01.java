package com.biz.var;

public class Float_Int_01 {

	public static void main(String[] args) {
		
		float fNum = 0;
		int intNum = 0;
		
		fNum = intNum;
		intNum = (int)fNum;
		
		System.out.println(fNum);
	}
}

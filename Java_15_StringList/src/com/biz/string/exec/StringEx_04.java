package com.biz.string.exec;

import java.util.Random;

public class StringEx_04 {
	
	public static void main(String[] args) {
		
		
		Random rd = new Random();
		int intval = 0;
		int inttotal = 0;
		
		String[] strArr;
		
		for(int i = 0; i < 10; i++) {
			
			int rNum = rd.nextInt();
			
			if(rNum < 0) { 
				rNum *= -1;
			}
			
			String strNum = rNum + "";
			System.out.println(strNum);
			strArr = strNum.split("");
			
			intval = Integer.valueOf(strArr[3]);
			
			inttotal = intval + inttotal;

	}
		
		System.out.println(inttotal);
		
		
		int nSum = 0;
		
		for(int i = 0; i < 10; i++) {
			
			int rNum = rd.nextInt();
			
			if(rNum < 0) { 
				rNum *= -1;
			}
			
			String strNum = rNum + "";
			int intNum = Integer.valueOf(strNum.substring(3,4));
			nSum = nSum + intNum;
		
		}
		
	System.out.println(nSum);
	
	
	
	
	
	
	
	
		
		
		
	}

}

package com.biz.classes.string;

public class String_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int nCount = 0;
	int intMul = 21;
	int intSearch = 5;
	int intMax = 100;
	
	
		
		for(int i = 1; i <= intMax; i ++) {
			
			if(i % intMul == 0) nCount++;
			
			if(nCount == intSearch) {
				System.out.println(nCount+","+i);
				break;
			}

			
	}
		
		
		
		
		

	}
}

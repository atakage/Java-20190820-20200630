package com.biz.classes.string;

public class String_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num0 = 8;
	int num = 5;
	int count = 0;
	
	
		
		for(int i = 1; i <= 100; i ++) {
			
			if(i % num0 == 0) count++;
			
			if(count == num) {
				System.out.println(count+","+i);
				break;
			}

			
	}
		
		
		
		
		

	}
}

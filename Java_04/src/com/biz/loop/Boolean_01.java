package com.biz.loop;

public class Boolean_01 {
	
	public static void main(String[] args) {
		
		
	 boolean bYes = 3 == 3;
	 
	 System.out.println(bYes);
	 
	 
	 bYes = 4 == 4;
	 bYes = 4 > 4;
	 bYes = 4 >= 4;
	 bYes  = 5 == 5 || 4 == 4; 
	 bYes = 5 > 5 || 4 == 4;
	 bYes = 5 >= 5 || 4 > 4;
	 
	 bYes = 5 == 5 && 4 == 4;
	 bYes = 5 > 5 && 4 == 4;
	 bYes = 5 >= 5 && 4 > 4;
	 
	 bYes = 5 <= 4;
	 bYes = 3 < 4;
	 
	 bYes = 3 != 4;
	 System.out.println(bYes);
	 
	 int n = 1;
	 n = n * -1;
	 n = n * -1;
	 n = n * -1;
	 n = n * -1;
	 
	 
	 bYes = !bYes; // NOT 연산, 원래 값을 반전
	 
	}

}

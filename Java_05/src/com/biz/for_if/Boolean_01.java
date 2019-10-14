package com.biz.for_if;

public class Boolean_01 {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		long longNum2 = 0L;
		
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		
		boolean bYes = true;
		boolean bNo = false;
		
		
		bYes = 3 == 3;
		bNo = 3 > 3;
		
		char cA = 'A';
		
		
		String strName = "대한민국";
		bYes = 3 == 3;
		bYes = 3 > 3;
		
		bYes = 3 != 3;
		bYes = !bYes; // bYes값을 역전 (inverter, NOT 연산)
		
		int n = 1;
		n *= -1;
		n *= -1;
		n = -n; //n의 값을 양수와 음수를 역전
	}

}

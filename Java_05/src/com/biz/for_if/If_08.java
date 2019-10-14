package com.biz.for_if;

public class If_08 {
	
	public static void main(String[] args) {
		
		int intAge = 121;
		
		if(!(intAge >= 0 && intAge <= 120)) {
			System.out.println("조건 부합하지 않");
		}
		
		
		if(intAge < 0 || intAge > 120) {
			System.out.println("나이는 0세부터 120세까지만 가능");
			System.out.println("변수 값: "+intAge);
		}else {
			System.out.println("조건에 맞음");
		}
	}

}

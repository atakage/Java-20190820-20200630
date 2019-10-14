package com.biz.for_if;

public class If_07 {
	
	public static void main(String[] args) {
		
		int num = 66;
		
		if(num % 3 == 0 && num % 6 == 0) {
			System.out.println(num + "는 3의 배수이며 6의 배수이다");
		}
		
		if(num % 3 == 0 || num % 6 == 0) {
			System.out.println(num + "는 3의 배수이거나 6의 배수이다");
			System.out.println(num + "는 3의 배수 또는 6의 배수이다");
		}
		
		if(num % 3 == 0 && num % 6 == 0) {
			System.out.println(num + "는 3의 배수이며 6의 배수이다");
		}
		
	}

}

package com.biz.for_if;

public class If_06 {
	
	public static void main(String[] args) {
		
		
		int num = 47;
		
		if(num % 3 == 0)
			System.out.println(num + "는 3의 배수");
		else if(num % 4 == 0)
			System.out.println(num + "는 4의 배수");
		else if(num % 2 ==0)
			System.out.println(num + "는 2의 배수");
		
		
		
		if(num % 3 == 0)
			System.out.println(num + "는 3의 배수");
		if(num % 4 == 0)
			System.out.println(num + "는 4의 배수");
		if(num % 2 == 0)
			System.out.println(num + "는 2의 배수");
	}

}

package com.biz.for_if;

public class If_04 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int sum2 = 0;
		for(int i = 1; i <=100; i++) {
			
			if(i % 2 == 0) {
				
				sum += i;
			}else {
				
				sum2 += i;
			}
		}	
		System.out.println("짝수 합:" + sum);
		System.out.println("홀수 합:" + sum2);
}
	}
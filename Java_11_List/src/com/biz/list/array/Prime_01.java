package com.biz.list.array;

import java.util.Random;

public class Prime_01 {
	
	public static void main(String[] args) {
		
		
		
		int[] nums = new int[50];
		
		Random rd = new Random();
		
		int num = rd.nextInt();
		
		int count = 0;
		
		
		for(int i = 0; i < nums.length; i++) {
			
			
			nums[i] = rd.nextInt(100)+1;
			
			
			if(nums[i] < 2) {		// nums[i] 값이 2미만 (0,1)이면 소수 검사X
				continue;						// i++로 이동
			}
			
			for(int j = 2; j <nums[i]; j++) {
				
				if(nums[i] % j == 0) {
					count = 1;
				}
			}
			
			
			if(count == 0) {
				
				System.out.printf("%d\t", nums[i]);
			
			/*	if((i+1) % 5 == 0){
					System.out.println();
				}else {
					System.out.print(", ");
				}
					
				*/
			}
			
			
		
			count = 0;

			
		}
		
		
	}

}

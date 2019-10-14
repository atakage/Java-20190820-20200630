package com.biz.classes.arrays;

import java.util.Random;

public class Array_02 {
	
	
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Random rd = new Random();
		
		
		for(int i = 0; i < nums.length; i++) {
			
			nums[i] = rd.nextInt(10)+1;
			System.out.println(nums[i]);
			
		}
		
		int sNum = 3;
		int  j;
		for(j = 0; j < nums.length; j++) {
			if(nums[j] == sNum)break;
		}
		
		if( j >= nums.length)
			System.out.printf("배열에 %d 값이 없음", sNum);
		else
			System.out.printf("배열의 %d번째에 값이 있음 ", j);
		
		
	}

}
package com.biz.arrays;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[100];
		Random rd = new Random();
		
		
		
		for(int i = 0; i < nums.length; i++) {
			
			
			nums[i] = rd.nextInt(10)+1;
			
		}
		
		
		
		
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0; i <nums.length; i++) {
			if(nums[i] % 2 == 0) {
				
			evenSum += nums[i];				// 반복문 수행하는 과정에서 sum+= ?? 문장 정상적으로 수행되려면 sum 변수 반드시 0으로 생성 초기화 필요
			}else {
				oddSum += nums[i];
			}
		}
		
		System.out.printf("배열의 짝수값들의 합: %d 배열의 홀숫값들의 합: %d\n", evenSum, oddSum);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			
			if((i+1) % 5 == 0) {
				System.out.println();
			}else {
				System.out.print(", ");
			}
		}

	}

}

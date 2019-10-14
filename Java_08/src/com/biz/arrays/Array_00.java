package com.biz.arrays;

import java.util.Random;

public class Array_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[100];
		Random rd = new Random();
		
		
		
		for(int i = 0; i < nums.length; i++) {
			
			
			nums[i] = rd.nextInt(10)+1;
			
		}
		
		
		
		
		int sum = 0;
		for(int i = 0; i <nums.length; i++) {
			if(nums[i] % 2 == 0) {
				
			sum += nums[i];				// 반복문 수행하는 과정에서 sum+= ?? 문장 정상적으로 수행되려면 sum 변수 반드시 0으로 생성 초기화 필요
			}
		}
		
		System.out.println("배열의 짝수값들의 합:" + sum);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
			if((i+1) % 5 == 0) {
				System.out.println();
			}else {
				System.out.print(", ");
			}
		}

	}

}

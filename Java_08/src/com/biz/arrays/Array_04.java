package com.biz.arrays;

import java.util.Random;

public class Array_04 {
	
	public static void main(String[] args) {
		
		
		int[] nums = new int[10];
		Random rd = new Random();
		
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(100)+1;
			
		}
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		
		System.out.println();
		System.out.println("===========================");
		
		
		
		/*
		 * 이 정렬 코드는 bubble, insert, selection 정렬의 기초가 되는 정렬 코드
		 * 
		 */
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j <nums.length; j++) {
				
				if(nums[i] > nums[j] ) {
					int temp = 0;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		
		}
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		
		
		
	}

}
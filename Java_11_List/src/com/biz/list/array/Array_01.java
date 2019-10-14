package com.biz.list.array;

import java.util.ArrayList;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i = 5; i <=22; i++) {
			
			System.out.println(i);
		
		}
		
		
		int[] nums = new int[100];
		nums[0] = 5;
		nums[1] = 6;
		nums[2] = 7;
		
		
		System.out.println(nums[99]);
		System.out.println(nums[0]);
		
		
		
		int sum = nums[1] + nums[2];
		
		System.out.println(sum);
		
		
		for(int i = 0; i <nums.length; i++) {
			
			System.out.println(nums[i]);
			sum = sum + nums[i];
		}
	}

}

package com.biz.classes.exec;

public class ClassEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		int num2 = 40;

		int _temp = num1;
		num1 = num2;
		num2 = _temp;

		swap(num1, num2);
		
		int[] nums = new int[2];
		
		nums[0] = 40;
		nums[1] = 50;
		
		System.out.printf("nums[0]: %d, nums[1] : %d\n", nums[0], nums[1]);
		
		swap(nums);
		
		System.out.printf("nums[0]: %d, nums[1] : %d\n", nums[0], nums[1]);

	}

	private static void swap(int num1, int num2) {

		int _temp = num1;
		num1 = num2;
		num2 = _temp;

	}

	public static void swap(int[] nums) {

		int _temp = nums[0];
		nums[0] = nums[1];
		nums[1] = _temp;

	}

}

package com.biz.classes.exec;

public class ClassEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[2];

		nums[0] = 40;
		nums[1] = 50;

		System.out.printf("nums[0]: %d, nums[1] : %d\n", nums[0], nums[1]);

		swap(nums);

		System.out.printf("nums[0]: %d, nums[1] : %d\n", nums[0], nums[1]);

	}

	public static void swap(int[] nums) {		// method의 매개변수로 배열, 객체(String, Integer 등 제외), 리스트를 받은 후
												// 각 요소들의 값을 변경하면 전달한 쪽 원본 데이터의 값도 변경(일반변수는 X)

		nums = new int[2];
		
		nums[1] = 100;
		nums[0] = 200;

	}

}

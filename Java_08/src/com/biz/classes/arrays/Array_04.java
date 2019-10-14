package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[10];
		Random rnd = new Random();
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10)+1;
		}
		
		System.out.printf("1~10까지 정수 >>");
		String strNum = scanner.nextLine();
		int intNum = Integer.valueOf(strNum);
		
		int index;
		for(index = 0; index < nums.length; index++) {
			if(nums[index] == intNum) break;
		}
		
		if(index >= nums.length)
			System.out.println("찾는 값이 없음");
		else
			System.out.printf("%d번째에서 값 찾음\n", index);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.printf(nums[i] + ",");
		}

	}

}

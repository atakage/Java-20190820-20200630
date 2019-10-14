package com.biz.grade;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {

		int[] arr = new int[50];
		Random rd = new Random();

		System.out.println("===========================");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = rd.nextInt(100) + 1;

			if (arr[i] % 2 == 0) {

				System.out.println(arr[i] + ":" + i + "번째");

			}
		}
		System.out.println("===========================");

		
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("짝수들의 합:" + sum);
	}

}

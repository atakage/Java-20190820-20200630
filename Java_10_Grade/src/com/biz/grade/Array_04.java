package com.biz.grade;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		boolean why = true;
		int[] arr = new int[50];
		Random rd = new Random();

		System.out.println("↓↓↓소수 리스트↓↓↓");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = rd.nextInt(100) + 1;

			for (int j = 2; j < arr[i]; j++) {

				if ((arr[i] % j == 0)) {
					why = false;

				}

			}

			if (why == true) {
				System.out.println(arr[i]);
			}
			why = true;

		}

		System.out.println("============================");
		System.out.println("↓↓↓전체 리스트↓↓↓");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
package com.biz.arrays;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] array = new int[100];
		Random rd = new Random();
		int sum = 0;

		System.out.println("===================");
		for (int i = 0; i < array.length; i++) {

			array[i] = rd.nextInt(10) + 1;

			if (array[i] % 2 == 0) {

				System.out.println(array[i]);
				sum = sum + array[i];
			}

		}

		System.out.println("====================");

		System.out.println("짝수 합계:" + sum);

	}

}

package com.biz.grade;

import java.util.Random;

public class Array_01 {
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[50];
		Random rd = new Random();
		
		int total = 0;
		float avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = rd.nextInt(100) + 1;
			total = total + arr[i];
		}
		
		 avg = total / (float)arr.length;
		 
		 System.out.println(total);
		 System.out.printf("%.2f",avg);
	}

}

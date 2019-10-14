package com.biz.classes.service;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {
	
	private int[] nums;
	
	
	//메서드 중에 void 등이 없고 이름이 클래스 이름과 같은 method는 생성자 메서드
	
	public ArrayScanService(int length) {
		
		Random rd = new Random();
		nums = new int[length];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(10) + 1;
		}
		
	}
	
	public void scanArray() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0~10까지 정수 >>");
		String strNum = scanner.nextLine();
		
		int intNum = Integer.valueOf(strNum);
		
		int index;
		for(index = 0; index < nums.length; index++) {
			if(nums[index] == intNum)break;
		}
		
		if(index >= nums.length)
			System.out.println("찾는 값 없음");
		else
			System.out.printf("%d 번째에서 찾음", index);
		
		
		for(int i = 0; i <nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		
		scanner.close();
	}
	
	public void scanArrayAll() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~10까지의 정수 >>");
		String strNum = scanner.nextLine();
		int intNum = Integer.valueOf(strNum);
		
		int nCount = 0;
		for(int i = 0; i <nums.length; i++) {
			if(nums[i] == intNum) {
				System.out.printf("%d 번째에서 찾음, \n" , i);
				nCount++;
			}
			
			
			}	
		if(nCount < 1) {
			System.out.println("찾지 못함");
		}else {
			
			for(int i = 0; i <nums.length; i++) {
				System.out.print(nums[i] + ",");
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}

}

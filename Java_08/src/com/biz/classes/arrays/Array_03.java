package com.biz.classes.arrays;

import java.util.Scanner;

public class Array_03 {
	
	public static void main(String[] args) {
		
		
		int[] intList = new int[10];
		String[] strList = new String[10];
		
		Scanner scanner = new Scanner(System.in);
		
		String aa;
		int num;
		int index;
		
		int checkNum = 0;
		
		
		for(int i = 0; i < strList.length; i++) {
			
			System.out.print("배열 기록(1~10):");
			strList[i] = scanner.nextLine();
			
			checkNum = Integer.valueOf(strList[i]);
			
			
			intList[i] = Integer.valueOf(strList[i]);
			
			}
			
		
		
		
		for(int i = 0; i <intList.length; i++) {
			System.out.println("입력한 배열:" + intList[i]);
		}
		
		System.out.println("배열에서 찾을 번호 입력:");
		 aa = scanner.nextLine();
		 num = Integer.valueOf(aa);
		
		
		 for(index = 0; index <intList.length; index++) {
			 
			 if(num == intList[index])break;
			 
		 }
		 
		 	if(index >= intList.length) {
		 		System.out.printf("배열에 %d 값이 없음", num);
		 	}else {
		 		System.out.printf("%d 번째에 입력한 %d이 있음", index, num);
		 	}
	}

}

package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {
	
	public static void main(String[] args) {
		
		
		List<Integer> nums = new ArrayList<Integer>();
		Random rd = new Random();
		
		int nSize = nums.size();
		
		
		for(int i = 0; i < 67; i++) {
			nums.add(rd.nextInt(100)+1);
		}
		
		for(int i = 0; i <nSize; i++) {
			System.out.println( nums.get(i));
		}
		
		
		for(int n: nums) { // nums 개수만큼 반복문 실행하며 nums 요소를 getter 해 n에 담아둠(forEach)
									//전체 리스트 읽을 때 사용
			System.out.println(n);
		}
		
		int sum = 0;
		for(int n : nums) {
			sum = sum + n;
		}
		
		System.out.println("합계:" + sum);
		
		for(int n : nums) {
			
			int index;
			for(index = 2; index < n; index++) {
				if(n % index == 0)break;
			}
			if(index >= n) {
				System.out.println(n +"은 소수");
			}
		}
		
	}

}

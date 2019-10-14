package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		Random rd = new Random();
		
		for(int i = 0; i < 5; i++) {
			nums.add(rd.nextInt());
		}
		
		
		int numsSize = nums.size();
		
		for(int i =0; i < nums.size(); i++) {		// 메서드가 size크기 계속 검사 비효율적
			System.out.println(nums.get(i));
		}
	}

}

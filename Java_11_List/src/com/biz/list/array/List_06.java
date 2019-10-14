package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class List_06 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(100);
		nums.add(100);
		nums.add(100);
		
		int total = nums.get(0) + nums.get(1) + nums.get(2);
	}

}

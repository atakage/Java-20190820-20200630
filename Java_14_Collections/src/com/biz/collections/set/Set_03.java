package com.biz.collections.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;public class Set_03 {
	
	public static void main(String[] args) {
		
		Set<Integer> intSet = new TreeSet<Integer>();
		
		Random rd = new Random();
		
		for(int i =0; i <10;i++) {
			intSet.add(rd.nextInt(10));
		}
		
		System.out.println(intSet);
		
		
		Set<String> strSet = new TreeSet<String>();	//문자열을 TreeSet에 저장할 때 문자열 자릿수가 일정하지 않으면
													//정렬 이루어지지 않을 수 있음
		for(int i = 0; i < 10; i ++) {
			strSet.add(String.format("%02d", rd.nextInt(100)));
		}
		
		System.out.println(strSet);
	}

}

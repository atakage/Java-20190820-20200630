package com.biz.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = new ArrayList<Integer>(); // List 인터페이스로 선언한 객체는 
																//ArrayList, LinkedList 로 초기화 생성 가능
		List<String> strList;
		strList = new ArrayList<String>();
		
		intList = new LinkedList<Integer>();	
		strList = new LinkedList<String>();
		
		
		/*
		 * 						추가/삭제			get(index)조회
		 * ArrayList				느림					빠름
		 * LinkedList				빠름					느림
		 */

	}

}

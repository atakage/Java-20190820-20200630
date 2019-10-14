package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {
	
	public static void main(String[] args) {
		
		/*
		 * Collection 프레임워크의 List, Set과는 다른 형식의 데이터 구조
		 * List, Set은 한가지 type만을 리스트로 포함하는 구조인데 Map은 두 가지 type의 자료를 한 묶음의 리스트로 포함,
		 * Key, Value라는 독특한 구조
		 */
		
		Map<String, String> strMap = new HashMap<String, String>();
		
		strMap.put("1", "홍길동");
		strMap.put("3", "성춘향");
		strMap.put("2", "이몽룡");
		strMap.put("5", "장길산");
		strMap.put("9", "임꺽정");
		
		System.out.println(strMap.get("9"));
	}

}

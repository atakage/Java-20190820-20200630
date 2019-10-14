package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> mapAge = new HashMap<String, Integer>();
		
		
		mapAge.put("홍길동", 33);
		mapAge.put("이몽룡", 22);
		mapAge.put("성춘향", 31);
		mapAge.put("장길산", 44);
		mapAge.put("임꺽정", 55);
		
		System.out.println("성춘향의 나이: " + mapAge.get("성춘향"));

	}

}

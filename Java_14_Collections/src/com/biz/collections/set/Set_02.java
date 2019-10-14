package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_02 {
	
	public static void main(String[] args) {
		
		
		Set<String> strSet = new HashSet<String>();
		
		
		strSet.add("홍길동");		//Set은 무작위 저장, 중복된 값은 추가 저장X
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");
		
		
		Set<String> strSet1 = new TreeSet<String>(); // TreeSet은 중복배제 형태로 저장, 정렬(오름차순)
		
		strSet1.add("홍길동");		
		strSet1.add("이몽룡");
		strSet1.add("성춘향");
		strSet1.add("장보고");
		strSet1.add("임꺽정");
		strSet1.add("장길산");
		strSet1.add("임꺽정");
		strSet1.add("장보고");
		
		System.out.println(strSet);
		System.out.println(strSet1);
		
	}

}

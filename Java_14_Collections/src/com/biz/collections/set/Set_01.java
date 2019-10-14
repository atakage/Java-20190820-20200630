package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 {
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		Set<String> strSet = new HashSet<String>();
		
		strList.add("홍길동");		//List는 추가한 순서대로 저장
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("임꺽정");
		strList.add("장보고");
		
		strSet.add("홍길동");		//Set은 무작위 저장, 중복된 값은 추가 저장X
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");
		
		System.out.println(strList);		// strList.toString() 생략
		System.out.println(strSet.toString());
		
		Set<String> strSet1 = new HashSet<String>(strList);	//List형 데이터를 Set형 데이터로 변환
		System.out.println(strSet1);
		
		strList = new ArrayList<String>(strSet1);
		System.out.println(strList);
		
	}

}

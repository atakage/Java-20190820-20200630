package com.biz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("장보고");
		
		
		Collections.sort(strList); //list자체를 정렬해서 저장해줌
		System.out.println(strList);
		
		Collections.shuffle(strList);
		System.out.println(strList);
	}
}

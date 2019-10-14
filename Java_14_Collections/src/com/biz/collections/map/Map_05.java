package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.biz.collections.model.GradeVO;

public class Map_05 {
	
	public static void main(String[] args) {
		
		Map<String, GradeVO> grades = new HashMap<String, GradeVO>();
		
		GradeVO vo = new GradeVO();
		vo.setStrName("홍길동");
		vo.setIntKor(90);
		vo.setIntEng(55);
		vo.setIntMath(44);
		grades.put("홍길동", vo);
		
		
		vo = new GradeVO();
		vo.setStrName("이몽룡");
		vo.setIntKor(94);
		vo.setIntEng(44);
		vo.setIntMath(33);
		grades.put("이몽룡", vo);
		
		vo = new GradeVO();
		vo.setStrName("성춘향");
		vo.setIntKor(30);
		vo.setIntEng(55);
		vo.setIntMath(64);
		grades.put("성춘향", vo);
		
		/*
		 * Map에 저장된 데이터 전체를 조회하고자 할 때 기본적으로 Map은 저장된 리스트 조회하는 데 불편이 있음
		 * Map 데이터ㅏ에 저장된 Key만 따로 떼어서 Set에 담아
		 * Key를 for반복문으로 처리하여 각 항목을 get(key)메서드를 통해 값 읽어냄
		 */
		
		Set<String> gradeKeys = grades.keySet();
		for(String s : gradeKeys) {
			GradeVO gvo = grades.get(s);
			System.out.println(gvo.toString());
		}
	}

}

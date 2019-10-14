package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

import com.biz.collections.model.GradeVO;

public class Map_04 {
	
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
		
		System.out.println("성춘향의 성적:" + grades.get("홍길동").toString());
	}

}

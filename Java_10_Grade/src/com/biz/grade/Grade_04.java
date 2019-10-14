package com.biz.grade;

import com.biz.grade.service.GradeServiceV3;

public class Grade_04 {
	
	public static void main(String[] args) {
	
		
		GradeServiceV3 gs = new GradeServiceV3(3);
		
		gs.input();
		gs.view();
		
		gs.sort();
		gs.view();
	}
	 

}

package com.biz.grade;

import com.biz.grade.service.GradeService;

public class Grade_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GradeService gs = new GradeService(5);
		
		gs.input();
		
		gs.view();
		
		
	}

}

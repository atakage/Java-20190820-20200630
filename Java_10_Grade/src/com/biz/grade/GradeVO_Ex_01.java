package com.biz.grade;

import com.biz.grade.service.GradeVOService;

public class GradeVO_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GradeVOService gs = new GradeVOService(20);
		
		
		int[] test = new int[10];
		float avg;
		int intSum = 0;
		for(int i = 0; i < test.length; i++) {
			intSum = intSum + test[i];
			
			
		}
		
		avg = intSum / test.length;
		
		gs.input();
		gs.total();
		gs.rank();
		gs.sort();
		gs.view();
		gs.allView();
		
		
		

	}

}

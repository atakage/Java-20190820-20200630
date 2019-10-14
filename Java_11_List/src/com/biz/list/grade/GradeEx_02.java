package com.biz.list.grade;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.service.GradeService;
import com.biz.list.service.GradeServiceImp_01;
import com.biz.list.service.GradeServiceImt_02;

public class GradeEx_02 {
	
	public static void main(String[] args) {
		
		
		GradeService gs = new GradeServiceImt_02();
		
		
		List<Integer> nums = new ArrayList<Integer>();  
		
		
		gs.input(10);
		gs.total();
		gs.view();
	}

}

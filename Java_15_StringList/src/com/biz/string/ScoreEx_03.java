package com.biz.string;

import java.util.List;

import com.biz.service.ScoreServiceV2;
import com.biz.service.StringService;
import com.biz.service.StudentServiceV1;
import com.biz.string.domain.StudentVO;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		StringService stdService = new StudentServiceV1();
		
		stdService.input();
		List<StudentVO> stdList = ((StudentServiceV1)stdService).getStudentList();	//형변환?
		
		StringService scService = new ScoreServiceV2();
		((ScoreServiceV2)scService).setStdList(stdList);
		
		
		scService.input();
		scService.list();
	}

}
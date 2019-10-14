package com.biz.classes;

import com.biz.classes.model.ScoreVO;
import com.biz.classes.service.GradeSocreService;

public class GSEx_03 {
	
	public static void main(String[] args) {
		
	//	ScoreVO[] sVO = new ScoreVO[100];
		GradeSocreService gService = new GradeSocreService();
		
		gService.newVO(100);		
		gService.makeScore();
		gService.scoreList();
		
		
	}

}

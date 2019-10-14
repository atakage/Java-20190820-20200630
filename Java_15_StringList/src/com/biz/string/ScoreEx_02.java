package com.biz.string;

import com.biz.service.ScoreServiceV2;
import com.biz.service.StringService;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		StringService scService = new ScoreServiceV2();
		
		scService.input();
		scService.list();
	}

}

package com.biz.string;

import com.biz.service.ScoreServiceV1;
import com.biz.service.StringService;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		StringService scService = new ScoreServiceV1();
		
		scService.input();
		scService.list();
		
	}
}

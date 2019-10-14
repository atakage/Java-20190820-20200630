package com.biz.grade;

import com.biz.grade.service.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreServiceV1 ss = new ScoreServiceV1();
		
		String scoreFileName = "src/com/biz/grade/score.txt";
		
		try {
			ss.read(scoreFileName);
			ss.list();
			ss.total();
			ss.listTotal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

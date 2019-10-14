package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		ScoreVO scoreBVO = new ScoreVO.Builder().s_num("001").s_kor(90).s_eng(80).s_math(70).build();
		
		scoreList.add(scoreBVO);
		
		scoreList.add(new ScoreVO.Builder().s_num("002").s_kor(70).s_eng(40).s_math(20).build());
		
		scoreList.add(new ScoreVO.Builder().s_num("003").s_kor(100).build());			// 빌드패턴 생성자를 이용한 객체 생성 및 list 추가
		scoreList.add(new ScoreVO.Builder().s_num("004").s_kor(100).build());
		scoreList.add(new ScoreVO.Builder().s_num("005").s_kor(100).build());
		scoreList.add(new ScoreVO.Builder().s_num("006").s_kor(100).build());
		
		
	
		
	}

}

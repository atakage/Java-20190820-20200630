package com.biz.arrays.exec.score;

import com.biz.arrays.model.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreVO sVO = new ScoreVO();

		sVO.add();
		sVO.add_ret();
		
		
		System.out.println(sVO.add_ret());
		
		int result = sVO.add_ret();

	}

}

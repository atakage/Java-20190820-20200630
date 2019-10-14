package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.string.domain.ScoreVO;

public class ScoreServiceV1 implements StringService{
	
	
	protected List<ScoreVO> scList = null;
	private Random rd = new Random();
	
	public ScoreServiceV1() {
		scList = new ArrayList<ScoreVO>();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i ++) {
			String strNum = String.format("%05d", i+1);
			int intKor = rd.nextInt(50) + 51;
			int intEng = rd.nextInt(50) + 51;
			int intMath = rd.nextInt(50) + 51;
			
			
			ScoreVO scVO = new ScoreVO();
			scVO.setStrNum(strNum);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			this.total(scVO);
			scList.add(scVO);
		}
		
	}
	
	private void total(ScoreVO sVO) {
		int total = sVO.getIntKor() + sVO.getIntEng() + sVO.getIntMath();
		sVO.setIntTotal(total);
		sVO.setIntAvg(total/3);
	}
	

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
		System.out.println("=============================");
		System.out.println("성적 일람표");
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균");
		System.out.println("===================================");
		for(ScoreVO vo : scList) {
			System.out.printf("%3s\t", vo.getStrNum());
			System.out.printf("%3d\t", vo.getIntKor());
			System.out.printf("%3d\t", vo.getIntMath());
			System.out.printf("%3d\t", vo.getIntEng());
			System.out.printf("%3d\t", vo.getIntTotal());
			System.out.printf("%3d\n", vo.getIntAvg());
		}
		System.out.println("===================================");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	
}

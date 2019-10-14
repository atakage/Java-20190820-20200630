package com.biz.classes.service;

import java.util.Random;

import com.biz.classes.model.ScoreVO;

/*
 * ~Service는 데이터를 활용하여 다양한 연산을 수행하는 클래스를 지칭함
 */

public class GradeSocreService {
	
	
	private ScoreVO[] gradeScoreVO;
	
	public void newVO(int length) {
		
		
		gradeScoreVO = new ScoreVO[length];
	}
	
	
	public void makeScore() {
		Random rnd = new Random();
		
		for(int i  = 0; i <gradeScoreVO.length; i++) {
			
			gradeScoreVO[i] = new ScoreVO();
			
			String strNum = String.format("%03d", i+1);
			int intKorea = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			gradeScoreVO[i].intKorea = intKorea;
			gradeScoreVO[i].intEng = intEng;
			gradeScoreVO[i].intMath = intMath;
			gradeScoreVO[i].total();
			gradeScoreVO[i].average();
			
		}
	}
	
	public void scoreList() {
		
		System.out.println("=========================");
		System.out.println("성적 일람표");
		System.out.println("=========================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		
		for(int i = 0;i <gradeScoreVO.length; i++) {
			System.out.printf(gradeScoreVO[i].strNum+"\t");
			System.out.printf("%3d\t", gradeScoreVO[i].intKorea);
			System.out.printf("%3d\t", gradeScoreVO[i].intEng);
			System.out.printf("%3d\t", gradeScoreVO[i].intMath);
			System.out.printf("%3d\t", gradeScoreVO[i].total);
			System.out.printf("%5.2f\n",gradeScoreVO[i].average);
		}
		
		
	}
	

}

package com.biz.arrays.exec.score;

import java.util.Random;

import com.biz.arrays.model.ScoreVO;



public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		ScoreVO[] sVO = new ScoreVO[20];
		
		Random rd = new Random();
		
		for(int i = 0; i < sVO.length; i++) {
			
			int intKor = rd.nextInt(50)+51;
			int intEng = rd.nextInt(50)+51;
			int intMath = rd.nextInt(50)+51;
			
			String strNum = String.format("%03d", i+1);
			sVO[i] = new ScoreVO();
			sVO[i].strNum = strNum;
			sVO[i].intKor = intKor;
			sVO[i].intEng = intEng;
			sVO[i].intMath = intMath;
			
			
			
			//sVO[i].sum();
			
			
		}
		
		System.out.println("=================");
		System.out.println("락번\t총점");
		System.out.println("=================");
		for(int i = 0; i < sVO.length; i++) {
			System.out.printf("%s\t%d\n", sVO[i].strNum, sVO[i].sum());
		}
		
	}

}

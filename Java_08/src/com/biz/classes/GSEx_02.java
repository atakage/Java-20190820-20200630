package com.biz.classes;

import java.util.Random;

import com.biz.classes.model.ScoreVO;

public class GSEx_02 {
	
	public static void main(String[] args) {
		
		
		
		ScoreVO[] sVO = new ScoreVO[100];
		
		Random rnd = new Random();// 임의 범위에 있는 숫자를 추출해서 다양한 값을 만들 수 있는 클래스
		
		
		for(int i = 0; i < 10;i++) {
			int n = rnd.nextInt(10)+1; // Random.nextInt(10) 0부터 9까지 임의 난수를 발생
										// Random.nextInt(10)+1 0부터 10까지 임의 난수를 발생
			System.out.println(n);
		}
		
		
	
		
		for(int i = 0; i <sVO.length; i++) {
			
			sVO[i] = new ScoreVO();
			
			int intKorea = rnd.nextInt(50+51);
			int intEng = rnd.nextInt(50+51);
			int intMath = rnd.nextInt(50+51);
			
			sVO[i].strNum = String.format("%03d", i+1);

			
			
			sVO[i].intKorea = intKorea;
			sVO[i].intEng = intEng;
			sVO[i].intMath = intMath;
			
			sVO[i].total();
			sVO[i].average();
		}
		
		
		System.out.println("=========================");
		System.out.println("성적 일람표");
		System.out.println("=========================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		
		for(int i = 0;i <sVO.length; i++) {
			System.out.printf(sVO[i].strNum+"\t");
			System.out.printf("%3d\t", sVO[i].intKorea);
			System.out.printf("%3d\t", sVO[i].intEng);
			System.out.printf("%3d\t", sVO[i].intMath);
			System.out.printf("%3d\t", sVO[i].total);
			System.out.printf("%5.2f\n",sVO[i].average);
		}
		
		
	}

}

package com.biz.classes;

import com.biz.classes.model.ScoreVO;

public class GSEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreVO[] sVO = new ScoreVO[10];
		
		for(int i = 0; i <sVO.length; i++) {
			
			sVO[i] = new ScoreVO();
		}
		
		sVO[0].strNum = "001";
		sVO[0].intKorea = 99;
		sVO[0].intEng = 88;
		sVO[0].intMath = 99;
		sVO[0].total(); //total() 메서드 호출하면 과목 총점 계싼 후 total 멤버 변수에 값을 저장
		sVO[0].average();
		
		sVO[1].strNum = "002";
		sVO[1].intKorea = 90;
		sVO[1].intEng = 80;
		sVO[1].intMath = 90;
		sVO[1].total();
		sVO[1].average();
		
		sVO[2].strNum = "003";
		sVO[2].intKorea = 89;
		sVO[2].intEng = 88;
		sVO[2].intMath = 88;
		sVO[2].total();
		sVO[2].average();
		
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

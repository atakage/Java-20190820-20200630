package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVOService {
	
	private GradeVO[] gradeVO;
	Random rd;
	
	public GradeVOService(int length) {
		
		gradeVO = new GradeVO[length];
		
		
		for(int i = 0; i <gradeVO.length; i++) {
			gradeVO[i] = new GradeVO();
		}
	}
	
	public void input() {
		
		for(int i = 0; i < gradeVO.length; i++) {
			
			rd = new Random();
			
			String strNum = String.format("%05d", i+1);
			gradeVO[i].strNum = strNum;
			
			
			gradeVO[i].intKor = rd.nextInt(50)+51;
			
			
			gradeVO[i].intEng = rd.nextInt(50)+51;
			gradeVO[i].intMath = rd.nextInt(50)+51;
		}
		
	}
	
	public void total() {
		
		for(int i = 0; i < gradeVO.length; i++) {
			int total = gradeVO[i].intKor + gradeVO[i].intEng + gradeVO[i].intMath;
			 
			 gradeVO[i].intSum = total;
			 
			 gradeVO[i].intAvg = total / 3;
		}
		
		
	}
	
	public void view() {
		
		System.out.println("==========================");
		System.out.println("성적 일람표");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t랭크");
		System.out.println("---------------------------------");
		for(int i = 0; i <gradeVO.length; i++) {
			System.out.printf("%s\t", gradeVO[i].strNum);
			System.out.printf("%3d\t", gradeVO[i].intKor);
			System.out.printf("%3d\t", gradeVO[i].intEng);
			System.out.printf("%3d\t", gradeVO[i].intMath);
			System.out.printf("%7d\t", gradeVO[i].intSum);
			System.out.printf("%3d\t", gradeVO[i].intAvg);
			System.out.printf("%3d\n", gradeVO[i].intRank);
		}
		
	}
	
	public void allView() {
		
		int allKor = 0;
		int allEng = 0;
		int allMath = 0;
		int allTotal = 0;
		int allAvg = 0;
		
		
		System.out.println("======================================");
		System.out.println("\t\t\t\t전체총점\t전체평균");
		for(int i = 0; i < gradeVO.length; i++) {
			allKor = allKor + gradeVO[i].intKor;
			allEng = allEng + gradeVO[i].intEng;
			allMath = allMath + gradeVO[i].intMath;
			allTotal = allTotal + gradeVO[i].intSum;
			allAvg = allAvg + gradeVO[i].intAvg;
			
			
			
		}
		 
			System.out.printf("\t%3d", allKor);
			System.out.printf("\t%3d", allEng);
			System.out.printf("\t%3d", allMath);
			System.out.printf("\t%7d\t", allTotal);
			System.out.printf("%3d\t", allAvg / gradeVO.length);
		
	}
	
	public void rank() {
		
		for(int i = 0; i < gradeVO.length; i++) {
			for(int j = i +1; j < gradeVO.length; j++) {
				if(gradeVO[i].intSum < gradeVO[j].intSum) {
					GradeVO temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = temp;
				
					
				}
			}
		}
		
		for(int i = 0; i <gradeVO.length; i++) {
			gradeVO[i].intRank = i + 1;
		}
	
	}
	
	public void sort() {
		
		for(int i  = 0; i <gradeVO.length; i++) {
			for(int j = i +1; j < gradeVO.length; j++) {
				if(Integer.valueOf(gradeVO[i].strNum) > Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = temp;
					
				}
			}
		}
	}
	
	

}

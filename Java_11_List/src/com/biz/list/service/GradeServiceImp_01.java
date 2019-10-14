package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.array.model.GradeVO;

public class GradeServiceImp_01 implements GradeService{
	
	private List<GradeVO> gradeList;
	
	Random rd;
	public GradeServiceImp_01() {
		
		gradeList = new ArrayList<GradeVO>();
		rd = new Random();
		
	}
	
	public void input(int size) {
		
		for(int i =0; i < size; i++) {
			
			String strNum = String.format("%05d", i+1);
			int intKor = rd.nextInt(50) + 51;
			int intEng = rd.nextInt(50) + 51;
			int intMath = rd.nextInt(50) + 51;
			
			GradeVO gVO = new GradeVO();
			
			gVO.strNum = strNum;
			gVO.intKor = intKor;
			gVO.intEng = intEng;
			gVO.intMath = intMath;
		
			
			gradeList.add(gVO);
		}
	}
	
	public void total() {
		
		int size = gradeList.size();
		for(int i = 0; i < size; i++) {
			
			int total = gradeList.get(i).intKor + gradeList.get(i).intEng + gradeList.get(i).intMath;
			
			gradeList.get(i).intTotal = total;
			gradeList.get(i).intAvg = total / 3;
		}
		
		
		
	}
	
	public void view() {
		
		System.out.println("=====================");
		System.out.println("성적 일람표");
		System.out.println("=====================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		
		
		int size = gradeList.size();
		for(int i =0; i < size; i++) {
			
			System.out.printf("%5s\t",gradeList.get(i).strNum);
			System.out.printf("%5d\t",gradeList.get(i).intKor);
			System.out.printf("%5d\t",gradeList.get(i).intEng);
			System.out.printf("%5d\t",gradeList.get(i).intMath);
			System.out.printf("%5d\t",gradeList.get(i).intTotal);
			System.out.printf("%5d\t",gradeList.get(i).intAvg);
			System.out.printf("%5d\n",gradeList.get(i).intRank);
		
		}
		
		System.out.println("======================");
	}
	


}

package com.biz.arrays.model;

public class ScoreVO {
	
	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;
	
	//public, private 키워드를 접근 제한자라고 한다
	//private : 현재 클래스(ScroeVO)에서만 접근 가능
	
	private int intSum;
	private int intAvg;
	private int intRank;
	
	
	public int sum() {
		
		intSum = intKor + intEng + intMath;
		
		return intSum; // sum()메서드가 private인 intSum 변수 값을 외부로 대신 return 가능
	}
	
	public void add() {
		int num = 100 + 200 + 300;
	
	}
	
	public int add_ret() {
		int num = 100 + 200 + 300;
		return num;
	}

}

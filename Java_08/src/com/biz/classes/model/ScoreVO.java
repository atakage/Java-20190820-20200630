package com.biz.classes.model;

/*
 * 학생의 성적처리에 사용할 VO 클래스
 * prototype(코드)
 * 
 */

public class ScoreVO {
	
	public String strNum;
	public int intKorea;
	public int intEng;
	public int intMath;

	public int total;
	public float average;

public void total() {
	
	total = intKorea + intEng + intMath;
	
	
	
}

public void average() {
	
	int sum = intKorea + intEng + intMath;
	average = sum / 3;



}

}


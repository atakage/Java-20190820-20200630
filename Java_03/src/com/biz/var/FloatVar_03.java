package com.biz.var;

public class FloatVar_03 {

	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng = 87;
		int intMath = 67;
		
		int intSum = intKor + intEng + intMath;
		float fAvg = intSum / 3.0f;
		
		/*
		 * %d: 정ㅅ형값을 대신하는 ESCAPE 문자열
		 * %f: 실수형값을 대신하는 ESCAPE 문자열
		 * %6.2f: 전체길이를 6자리로 하고 소수점 이하 2자리까지 표시 오른쪽 정렬한 후 왼쪽에 빈칸 남기기
		 */
		
		System.out.println("===============================");
		System.out.println("성적표");
		System.out.println("===============================");
		System.out.printf("국어: %6d\n", intKor);
		System.out.printf("영어: %6d\n", intEng);
		System.out.printf("수학: %6d\n", intMath);
		System.out.println("--------------------------------");
		System.out.printf("총점: %6d\n", intSum);
		//System.out.printf("평균: %f\n", fAvg);
		System.out.printf("평균: %6.2f\n", fAvg);
		System.out.println("===============================");
	}
}

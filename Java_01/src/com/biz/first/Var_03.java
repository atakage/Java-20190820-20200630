package com.biz.first;

public class Var_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intKorGrade = 90;
		int intEngGrade = 70;
		int intMathGrade = 60;
		
		int intSum;
		
		intSum = intKorGrade + intEngGrade + intMathGrade;
		
		/*System.out.println(intKorGrade
				+intEngGrade
				+intMathGrade);
*/
		System.out.println(intSum);
		
		
		
		intSum = intKorGrade +  intMathGrade;
		
		System.out.println(intSum);
		
		
		
		intSum = intKorGrade +  intEngGrade;
		
		System.out.println(intSum);
		
		
		
		intSum = intMathGrade +  intEngGrade;
		
		System.out.println(intSum);
	}

}

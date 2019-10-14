package com.biz.string;

import com.biz.string.domain.StudentVO;

public class NullValue {
	
	
	/*
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
											//변수선언 키워드 첫글자가 소문자이고 이때 선언되는 변수는 primitive(기본형)변수	
		int num = 0;						//기본형 변수를 clear 할 때는 고유의 값으로 clear 
		float fnum = 0.0f;					//기본형 변수를 배열로 선언하면 그 변수들은 참조형으로 바뀜
		boolean b = true;
		
		
		String s = "";					//변수선언 키워드 첫글자가 대문자이고 이때 선언되는 변수는 type(참조형, reference)형 변수
										//type형 변수 clear 할 때는 null 키워드를 사용해 clear
		StudentVO studentVO = null;		//type형 변수는 clear 하지 않고 직접 초기화, 생성 하기도 함
		String sNull = null;
		
		Integer num1 = 0;
		Integer num2 = null;
		
		Float fnum1 = null;
		Double dNum1 = null;
		Boolean boo = null;
		Character cA = null;

	}

}

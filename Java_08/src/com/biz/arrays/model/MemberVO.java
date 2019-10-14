package com.biz.arrays.model;

public class MemberVO {
	
	public String strName;
	public String strTel;
	private int intAge;
	
	
	
	public int getIntAge() {
		return intAge;
	}

	public void setIntAge(int intAge) {
		
		if(intAge < 0) {
			System.out.println("나이는 0세 이상"); // 유효한 범위의 값인지 미리 검사하고 그렇지 않으면 저장 거부
			return;										// 나중에 값을 조회했을 때 다른 값일 때보다 구분이 쉬워 오류 확률을 낮 
		}													//출 수 있다(유효성 검사 코드)
		if(intAge > 120) {
			System.out.println("나이는 120미만 ㅇ어야한다");
			return;
		}
		this.intAge = intAge;
	}
}

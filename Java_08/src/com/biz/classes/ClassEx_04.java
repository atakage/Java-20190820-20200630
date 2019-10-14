package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentVO[] sVO = new StudentVO[10];
		
		sVO[0] = new StudentVO();//객체 요소의 초기화 작업을 해야 멤버 변수 접근(읽기, 쓰기), 메서드 호출 등 가능
		
		
		sVO[0].strNum = "001";
		sVO[0].strName = "홍길동";
		
		System.out.println(sVO[0].strAddr);
		
		
		sVO[1].strNum = "002";

	}

}

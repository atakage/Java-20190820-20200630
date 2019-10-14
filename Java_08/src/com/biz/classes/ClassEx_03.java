package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentVO[] sVO = new StudentVO[10];
		
		
		sVO[0] = new StudentVO();
		
		sVO[0].strNum = "001";
		sVO[1].strName = "홍길동";
		
		System.out.println(sVO[0].strName);//sVO 배열은 10개의 메모리 장소를 사용하겠다라고 선언만 된 상태로
											// 이 상황에서 sVO의 각 멤버 변수에 접근(읽기, 쓰기)를 시도하면 아직
											//sVO 요소들이 초기화 되지 않아 exception 발생
	
		
		String[] str = new String[10];
		int[] intNum = new int[10];
		float[] floatNum = new float[10];
		
		
		
		
		
		for(int i = 0; i < sVO.length; i++) {
			
			sVO[i] = new StudentVO();
			sVO[i].vv();
		}
	
	}

}

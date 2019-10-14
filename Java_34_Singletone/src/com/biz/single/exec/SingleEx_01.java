package com.biz.single.exec;

import com.biz.single.service.SingleClassV1;

public class SingleEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		/*
		SingleClassV1 sc = new Single		// 생성자 메서드가 private이기 때문에  생성 불가
		*/
		
		SingleClassV1 sc1 = SingleClassV1.getInstance();	// 싱글톤 패턴 클래스는 new 생성자로 객체 만들지 않고
														// 별도 메서드로 가져다 사용
		
		SingleClassV1 sc2 = SingleClassV1.getInstance();
		
		SingleClassV1 sc3 = SingleClassV1.getInstance();
		
		
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		
		/*
		 * 싱글톤 객체
		 * 프로젝트 전체에서 공유해야할 어떤 데이터들을 메모리에 저장해 두고 여러 클래스에서 공유하고자 할 때 사용
		 * 
		 * 일반적인 static class와의 차이
		 * multi thread 환경에서 안전하게 사용할 수 있도록 설정이 가능
		 * (multi thread 환경에서는 여러곳의 method에서 한곳의 기억장소 값을 동시에 변경하는 경우가 발생)
		 * 
		 */
	}

}

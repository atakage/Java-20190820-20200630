package com.biz.iolist.service;

import com.biz.iolist.model.IolistVO;

public class IolistServiceImpV2 extends IolistServiceImpV1{

	@Override
	public void list() {					//Override 재정의
		// TODO Auto-generated method stub
		//super.list();
		
		System.out.println("나는 리스트 보기");
		
		
		System.out.println("===================================");
		System.out.println("판매 리스트");
		System.out.println("==================================");
		System.out.println("상품이름\t단가\t수량\t합계\t공급가액\t부가세");
		System.out.println("---------------------------------");
		
		for(IolistVO vo : iolist) {
			
			int amt = (int)(vo.getIntTotal() / 1.1); // 일반 가격을 1.1로 나눈 값(부가세별도 금액)
			int vat = vo.getIntTotal() - amt;	// 일반 금액 - 부가세별도 금액(부가가치세)
			System.out.print(vo.getStrName());
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%5d\t", vo.getIntQtt());
			System.out.printf("%5d\t", vo.getIntTotal());
			System.out.printf("%5d\t", amt);
			System.out.printf("%5d\n", vat);
			
		}
		
	}

	
	
	
}

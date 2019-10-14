package com.biz.iolist.service;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV3 extends IolistServiceImpV2 {

	public void list() {
		
		int intIpTotal = 0;
		int intOpTotal = 0;
		
		this.list_header();
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrPName()+"\t");
			
			int intIO = Integer.valueOf(vo.getStrIO());
			
			int intIPrice = 0;
			int intOPrice = 0;
			String strIotitle = "매출";
			
			if(intIO == 1) {
				intIPrice = vo.getIntPrice();
				
			}else {
				intOPrice = vo.getIntPrice();
				
			}
			System.out.print(strIotitle+"\t");
			System.out.print(vo.getIntPrice()+"\t");
			System.out.print(vo.getIntQtt()+"\t");
			
			System.out.printf("%8d\t", intIPrice * vo.getIntQtt());
			System.out.printf("%8d\n", intOPrice * vo.getIntQtt());
			
			intIpTotal = intIpTotal + intIPrice * vo.getIntQtt();
			intOpTotal = intOpTotal + intOPrice * vo.getIntQtt();
			
			
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		System.out.printf("합계\t\t\t\t\t\t%8d\t%8d\n", intIpTotal, intOpTotal);
		
		System.out.println("-------------------------------------------------------------------------");
		
		
	}
	
	protected void list_header() {
		
		System.out.println("거래일자\t상품명\t구분\t단가\t수량\t매입금액\t매출금액");
		System.out.println("================================================");
		
	}

}

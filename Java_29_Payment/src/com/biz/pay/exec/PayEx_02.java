package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaperMakeServiceV1 makeService = new PaperMakeServiceV1();
		
		makeService.make(3780000);
		List<PaperVO> paperList = makeService.getPaperList();
		
		
		
		
		

	}

}

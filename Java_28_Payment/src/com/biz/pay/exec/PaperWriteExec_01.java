package com.biz.pay.exec;

import com.biz.pay.service.PaperMakeServiceV2;
import com.biz.pay.service.PaperWriterServiceV1;

public class PaperWriteExec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		PaperWriterServiceV1 pws = new PaperWriterServiceV1();
		PaperMakeServiceV2 pms = new PaperMakeServiceV2();
		
		pms.make(3758750);
		
		try {
			pws.print(pms.getPaperList());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

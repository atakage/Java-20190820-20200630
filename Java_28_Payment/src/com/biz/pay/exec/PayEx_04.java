package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PayVO;
import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PaperReadServiceV1;
import com.biz.pay.service.PaperWriterServiceV1;

public class PayEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PaperReadServiceV1 readService = new PaperReadServiceV1();
		PaperPrintServiceV1 printService = new PaperPrintServiceV1();
		
		String filePath = "src/com/biz/pay/급여.txt";
		try {
			List<PayVO> list= readService.readFile(filePath);
			printService.printFile(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

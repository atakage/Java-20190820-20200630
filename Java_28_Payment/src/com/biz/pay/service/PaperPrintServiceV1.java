package com.biz.pay.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperPrintServiceV1 {
	
	
	public void printFile(List<PayVO> list) throws Exception {
		
		FileWriter fw = new FileWriter("src/com/biz/pay/급여명세서.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("====================================\n");
		bw.write("사원번호\t          급여액\t\n");
		bw.write("====================================\n");
		for(PayVO vo : list) {
			
			
			
			bw.write(vo.getSj()+"\t"+vo.getPay()+"\t\n");
			
		}
		
		
		System.out.println("생성 완료");
		bw.close();
		fw.close();
		
	}

}

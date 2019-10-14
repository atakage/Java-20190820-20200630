package com.biz.pay.service;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperWriterServiceV1 {
	
	public void print(List<PaperVO> list) throws Exception {
		
		
		
		
		
		FileWriter fw = new FileWriter("src/com/biz/pay/화폐매수.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		PaperVO vo = new PaperVO();
		
		for(int i = 0; i < list.size(); i++) {
			vo  = list.get(i);

			
			bw.write(vo.getCount()+""+":"+vo.getPaper()+"\n");
			
		
		}
		
		
			

		System.out.println("생성완료");
		
		
		bw.close();
		fw.close();
		
		
		
		
	}

}

package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperReadServiceV1 {

	List<PayVO> payList;

	public PaperReadServiceV1() {

		payList = new ArrayList<PayVO>();

	}

	public List<PayVO> readFile(String filePath) throws Exception {

		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);

		

		while (true) {

			PayVO vo = new PayVO();
			
			String str = br.readLine();

			if (str == null)
				break;

			String[] strArr = str.split(":");

			vo.setSj(strArr[0]);
			vo.setPay(Integer.valueOf(strArr[1]));

			payList.add(vo);

		}
		
		br.close();
		fr.close();
		
		
		return payList;
	}

}

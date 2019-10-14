package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV1 {

	List<PaperVO> paperList;
	
	public List<PaperVO> getPaperList(){
		
		return this.paperList;
		
	}

	public void make(int pay) {

		paperList = new ArrayList<PaperVO>();
		int paper = 50000;
		int sw = 1;

		while (pay > 5) {

			PaperVO vo = new PaperVO();

			int paperCount = (int) (pay / paper);

			vo.setCount(paperCount);
			vo.setPaper(paper + "");

			paperList.add(vo);
			
			pay -= (paper * paperCount);

			if (sw > 0) {
				paper /= 5;

			} else {
				paper /= 2;

			}

			sw *= (-1);
			
		}

	}

}

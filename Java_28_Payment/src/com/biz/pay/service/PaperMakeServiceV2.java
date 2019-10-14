package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV2{
	
	private List<PaperVO> paperList;
	
	
	
	
	public PaperMakeServiceV2() {
		
		paperList = new ArrayList<PaperVO>();
		
	}
	
	public void make(int pay){
		
		PaperVO vo;
		
		int count = 50000;
		int sw = 1;
		
		while(pay > 5) {
			
			vo = new PaperVO();
			
		 int 매수 = (int)(pay/count);
		 //System.out.println(count+":"+매수);
		 pay -= (매수 * count);
		 
		 vo.setCount(count);
		 vo.setPaper(매수+"");
		 paperList.add(vo);
		 
		 if(sw > 0) {
			 count /= 5;
		 }else {
			 count /= 2;
		 }
		 
		 
		
		
		 
		 sw *= -1;
		 
		 
		 
		
	}
		
		for(PaperVO vo2 : paperList) {
			System.out.println(vo2.getCount()+":"+vo2.getPaper());
		}
		
	
		
		
		
	}

	public List<PaperVO> getPaperList() {
		return paperList;
	}

	public void setPaperList(List<PaperVO> paperList) {
		this.paperList = paperList;
	}

}

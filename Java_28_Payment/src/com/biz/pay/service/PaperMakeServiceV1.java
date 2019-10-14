package com.biz.pay.service;

public class PaperMakeServiceV1 {
	
	public void make(int pay) {
		
		
	

		
		int count = 50000;
		int sw = 1;
		
		while(pay > 5) {
			
		 int 매수 = (int)(pay/count);
		 System.out.println(count+":"+매수);
		 pay -= (매수 * count);
		 if(sw > 0) {
			 count /= 5;
		 }else {
			 count /= 2;
		 }
		 
		 sw *= -1;
		
	}
	}

}

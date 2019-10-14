package com.biz.pay.exec;

public class PayEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pay = 3758750;



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

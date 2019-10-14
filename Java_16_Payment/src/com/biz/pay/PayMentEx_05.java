package com.biz.pay;

import com.biz.pay.service.PayServiceV5;

public class PayMentEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PayServiceV5 ps = new PayServiceV5();
		
		int nPay = 10000;
		ps.forPay(nPay);

	}

}

package com.biz.pay;

import com.biz.pay.service.PayServiceV2;

public class PayMent_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PayServiceV2 ps = new PayServiceV2();
		
		int pay = 3849200;
		ps.array(pay);
		ps.whilePay(pay);

	}

}

package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV3 extends PayServiceV2{

	@Override
	public void whilePay(int nPay) {
		
		this.headerView(nPay);
		
		int intSw = 1;
		while (true) {

			if (nPay < 5)
				break;

			int nCount = nCount = nPay / nMoney;
			nPay -= nCount * nMoney;
			DecimalFormat paperForm = new DecimalFormat("###, ###");
			System.out.printf("%8s 원권 %4d매", paperForm.format(nMoney), nCount);
			
			
			if (intSw == 1) {
				nMoney /= 5;
			
			} else {
				nMoney /= 2;
				
			}
			intSw = intSw * (-1);

			System.out.println();

		}
		
	}
	
	

}

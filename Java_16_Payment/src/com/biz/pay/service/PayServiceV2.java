package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV2 extends PayServiceV1 {

	protected int nMoney = 50000;
	protected DecimalFormat paperForm = new DecimalFormat("###, ###");

	public void whilePay(int nPay) {

	
		int intSw = 0;
		this.headerView(nPay);

		while (true) {
			
			
			
			if (nPay < 5)
				break;

			int nCount = nCount = nPay / nMoney;
			nPay -= nCount * nMoney;
			
			System.out.printf("%8s 원권 %4d매", paperForm.format(nMoney), nCount);
			if (intSw == 0) {
				nMoney /= 5;
				intSw = 1;
			} else {
				nMoney /= 2;
				intSw = 0;
			}

			System.out.println();

		}

	}

	protected void headerView(int nPay) {

		DecimalFormat payform = new DecimalFormat("###, ###, ###, ###");
		String strPay = payform.format(nPay);
		System.out.println("====================================");
		System.out.printf("급여수령액:%s\n", strPay);
		System.out.println("====================================");
		DecimalFormat paperForm = new DecimalFormat("###, ###");

	}

}

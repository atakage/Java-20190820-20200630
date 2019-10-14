package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV4 extends PayServiceV2 {

	@Override
	public void whilePay(int nPay) {
		// TODO Auto-generated method stub
		while (nPay > 1) {	//조건문(if, while, for)을 코딩할 때 부등호와 EQ(==)를 같이 사용해야 할 상황에서는
									// 부등호만 사용해서 코딩
			int intSw = 0;

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

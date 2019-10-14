package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV1 {

	private int[] money = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	
	
	public void array(int nPay) {
		
		
		DecimalFormat payform = new DecimalFormat("###, ###, ###, ###");
		String strPay= payform.format(nPay);
		System.out.println("====================================");
		System.out.printf("급여수령액:%s\n", strPay);
		System.out.println("====================================");
		DecimalFormat paperForm = new DecimalFormat("###, ###");
		
		for(int i = 0; i < money.length;i ++) {
			
			
			
			int nCount = nPay / money[i];
			nPay = nPay - money[i] * nCount;
			System.out.printf("%8s 원권 %4d매", paperForm.format(money[i]), nCount);
			System.out.println();
			
		}
		
	}

}

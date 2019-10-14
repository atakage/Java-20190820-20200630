package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

public class MethodEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		MethodService ms = new MethodService();
		
		int retNum = ms.getSum(30, 40);
		
		System.out.println("30 * 40 = " +retNum);

	}

}

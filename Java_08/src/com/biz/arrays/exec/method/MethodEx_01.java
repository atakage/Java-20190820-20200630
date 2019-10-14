package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

public class MethodEx_01 {
	
	public static void main(String[] args) {
		
		MethodService ms = new MethodService();
		
		ms.consoleView();
		int num = ms.numRet();
		System.out.println("numRet가 return한 값:" +num);
		
		
		
		int num1 = ms.numRet() + 200;
		System.out.println(num1);
		
		String strRet = ms.strRet();
		
		String Ret1 = ms.numRet() + "";
		
		
		String strRet2 = ms.numRet() + ms.strRet(); // String형 = int return형 + String return형 
		System.out.println(Ret1);
	}

}

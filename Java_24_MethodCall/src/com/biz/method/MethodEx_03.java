package com.biz.method;

import com.biz.service.CalcService;

public class MethodEx_03 {
	
	public static void main(String[] args) {
		
		
		CalcService cs = new CalcService();
		
		for(int i = 0; i < 10; i++) {
			cs.addNum();
		}
		
		
		for(int i = 0; i < 5; i++) {
			cs.addNum(23);
		}
		
		
		int result = cs.addNum(32, 55);
	}

}
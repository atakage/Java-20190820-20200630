package com.biz.method;

import java.util.List;

import com.biz.service.MakeListService;

public class MethodEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakeListService ms = new MakeListService();
		
		
		
		ms.getListAll();
		List<Integer> list = ms.getListAll();

	}

}

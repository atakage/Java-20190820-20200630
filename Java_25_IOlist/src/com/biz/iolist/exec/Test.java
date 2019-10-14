package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IolistService is = new IolistService();
		
		
		String proFileName = "src/com/biz/iolist/상품정보.txt";
		try {
			is.readProduct(proFileName);
			is.buyMake();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

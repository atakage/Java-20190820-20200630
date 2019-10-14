package com.biz.iolist;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV3;

public class IolistEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IolistService ios = new IolistServiceImpV3();
		String fileName = "src/com/biz/iolist/매입매출정보.txt";
		
		
		
		try {
			ios.read(fileName);
			ios.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

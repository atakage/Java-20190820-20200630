package com.biz.iolist;

import com.biz.iolist.service.IolistServiceImpV1;

public class IolistEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IolistServiceImpV1 ios = new IolistServiceImpV1();
		String fileName = "src/com/biz/iolist/매입매출정보.txt";
		
		
		
		try {
			ios.read(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

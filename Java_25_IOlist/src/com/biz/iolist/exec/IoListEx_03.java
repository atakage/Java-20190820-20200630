package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.service.MakeProductServiceV2;
import com.biz.iolist.service.WriteProductService;

public class IoListEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strproFileName = "src/com/biz/iolist/과자이름.txt";
		String strproWriteFile = "src/com/biz/iolist/상품정보.txt";
		
		MakeProductServiceV2 ms = new MakeProductServiceV2();
		
		
		try {
			List<String> proDuctList = ms.getProductList(strproFileName);
			WriteProductService ws = new WriteProductService(proDuctList);
			
			ws.productWrite(strproWriteFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.biz.iolist.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WriteProductService {
	
	List<String> proDuctList;
	
	public WriteProductService() {
		// TODO Auto-generated constructor stub
	
	}
	
	public WriteProductService(List<String> proDuctList) {
		// TODO Auto-generated constructor stub
		this.proDuctList = proDuctList;
	}
	
	public void setProList(List<String> proDuctList) {
		this.proDuctList = proDuctList;
	}
	
	public void productWrite(String proWriteFile) throws Exception {
		
		
		if(proDuctList == null) {
			System.out.println("상품 이름 리스트가 없음");
			return;
		}
		
		PrintWriter fileOut = new PrintWriter(proWriteFile);
		
		for (String pro : proDuctList) {
			fileOut.println(pro);
		}
		fileOut.close();
	}

}

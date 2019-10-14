package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.biz.iolist.domain.BuyVO;

public class IolistService {

	protected List<String> proList;
	protected List<BuyVO> buyList;
	
	
	public IolistService() {
		// TODO Auto-generated constructor stub
		buyList = new ArrayList<BuyVO>();
		
	}
	
	public void buyMake() {
		
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		
		String strDate = sd.format(date);
		
		
		
		
		int count = 0;
		
		
		for(String s : proList) {
			
			
			if(count > 19)break;
			
			BuyVO vo = new BuyVO();
			
			String[] strArr = s.split(":");
			vo.setProName(strArr[0]);									
			vo.setPrice(Integer.valueOf( strArr[1]));
			vo.setDate(strDate);
			vo.setQty((int)(Math.random() * (100 - 10 + 1) + 10));
			vo.setTotal(vo.getQty() * vo.getPrice());
			vo.setVat(vo.getPrice() / 10);
			
			
			
			buyList.add(vo);
			
			System.out.println(vo.getProName()+":"+vo.getDate()+":"+vo.getPrice()+":"+vo.getVat()+":"+vo.getQty()+":"+vo.getTotal());
			
			count++;
		}
		
	}
	
	

	public void readProduct(String proFileName) throws Exception {

		proList = new ArrayList<String>();
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			if (reader.length() < 1)
				continue;
			proList.add(reader);

		}

		buffer.close();
		fileReader.close();

	}

}

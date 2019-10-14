package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IolistVO;

public class IolistServiceImp {
	
	List<IolistVO> iolist;
	
	public IolistServiceImp() {
		iolist = new ArrayList<IolistVO>();
	}
	
	public void input() {
		
		IolistVO iolistVO; 
		
		iolistVO = new IolistVO("2019-09-05", "14:00:01", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05", "14:00:02", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-05", "14:00:03", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		
		
	}
	
	public void total() {
		
		int size = iolist.size();
		
		for(int i = 0; i <size; i++) { //setter 메서드 사용할 경우 고전  for문
			
			 iolist.get(i).setIntTotal(iolist.get(i).getIntPrice(), iolist.get(i).getIntQuantity());
			
		}
		for(IolistVO vo : iolist) {
			vo.setIntTotal(vo.getIntPrice(), vo.getIntQuantity());
		}
	}
	
	public void input(int count) {
		
		for(int i = 0; i < count; i++) {
		
		String strTime = String.format("14:00:%02d", i);
		IolistVO iolistVO;
		Random rd = new Random();
		
		int intH = rd.nextInt(5)+1;
		String strName = String.format("일반미 %d호", intH);
		
		int intQ = rd.nextInt(30) + 10;
		
		iolistVO = new IolistVO("2019-09-05", strTime , strName, 1000 * intH, intQ);
		iolist.add(iolistVO);
		
		}
	}
	
	
	public void list() {
		
		System.out.println("=======================");
		System.out.println("거래내역");
		System.out.println("=======================");
		System.out.println("일자\t시각\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrTime()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getIntPrice()+"\t");
			System.out.print(vo.getIntQuantity()+"\t");
			System.out.print(vo.getIntTotal()+"\n");
		}
		System.out.println("========================");
	}

}

package com.biz.iolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.model.IolistVO;

public class IolistServiceImpV1 implements IolistService {

	protected List<IolistVO> iolist;			// private 성질을 가지면서 현재 클래스를 상속받은 곳에서는 접근 가능

	public IolistServiceImpV1() {

		iolist = new ArrayList<IolistVO>();

	}

	@Override
	public void input() {
		// TODO Auto-generated method stub

		IolistVO iolistVO = new IolistVO();
		Random rd = new Random();

		int intH = rd.nextInt(5) + 1;
		String strName = String.format("청정미 %d호", intH);

		int intHour = rd.nextInt(24);
		int intMin = rd.nextInt(60);
		int intSec = rd.nextInt(60);
		String strTime = String.format("%02d:%02d:%02d", intHour, intMin, intSec);

		int intQtt = rd.nextInt(30) + 10;

		iolistVO.setStrDate("2019-09-06");
		iolistVO.setStrName(strName);
		iolistVO.setStrTime(strTime);
		iolistVO.setIntPrice(intH * 1000);
		iolistVO.setIntQtt(intQtt);

		iolist.add(iolistVO);
	}

	@Override
	public void input(int count) {
		// TODO Auto-generated method stub

		for (int i = 0; i < count; i++) {
			this.input();
		}

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("=======================");
		System.out.println("판매 리스트");
		System.out.println("=======================");
		System.out.println("거래일자\t거래시각\t상품이름\t단가\t수량\t금액");
		System.out.println("----------------------------------------------");
		
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrTime()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%5d\t", vo.getIntQtt());
			System.out.printf("%5d\n", vo.getIntTotal());
		}
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

	@Override
	public void total() {
		// TODO Auto-generated method stub

		int size = iolist.size();
	/*	for (int i = 0; i < size; i++) {
			
			
			
			IolistVO vo = iolist.get(i);
			int total = vo.getIntPrice() * vo.getIntQtt();
			vo.setIntTotal(total);

		}*/
		
		
		for(IolistVO vo : iolist) {
			int total = vo.getIntPrice() * vo.getIntQtt();
			vo.setIntTotal(total);
		}

	}

}

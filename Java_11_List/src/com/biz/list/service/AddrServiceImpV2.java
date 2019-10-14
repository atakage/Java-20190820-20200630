package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.array.model.AddrVO;

public class AddrServiceImpV2 implements AddrService {

	private List<AddrVO> list;
	@Override
	public void input() {

		list = new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
		
		aVO.setStrName("홍길동");
		aVO.setStrTel("010-1111-1111");
		aVO.setStrAddr("서울특별시");
		aVO.setStrEmail("cc@cc.com");
		aVO.setStrHp("02-222-222");
		
		list.add(aVO);
		
		aVO = new AddrVO();
		
		aVO.setStrName("이몽룡");
		aVO.setStrTel("010-2221-1111");
		aVO.setStrAddr("ㅇㅇ특별시");
		aVO.setStrEmail("ff@fc.com");
		aVO.setStrHp("032-222-222");
		
		list.add(aVO);
		
		aVO.setStrName("성춘향");
		aVO.setStrTel("011-2221-1111");
		aVO.setStrAddr("ㄹㄹ특별시");
		aVO.setStrEmail("ghh@fc.com");
		aVO.setStrHp("031-222-222");
		
		
		list.add(aVO);

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
		int size = list.size();
		
		System.out.println("============================");
		System.out.println("주 소 록");
		System.out.println("============================");
		System.out.println("이름\t전화\t주소\tEmail\t핸드폰");
		
		
		
		System.out.println("-------------------------------");
		
		for(int i =0; i < size; i++) {
			System.out.printf("%10s\t", list.get(i).getStrName());
			System.out.printf("%10s\t", list.get(i).getStrHp());
			System.out.printf("%10s\t", list.get(i).getStrAddr());
			System.out.printf("%10s\t", list.get(i).getStrEmail());
			System.out.printf("%10s\n", list.get(i).getStrTel());
		}

	}

	@Override
	public void view(int num) {
		// TODO Auto-generated method stub
		
		
		if(num > list.size() -1) {
			System.out.println("데이터 없");
			return;
		}
		
		
		AddrVO avo = list.get(num);
		
		System.out.println("이름:" + avo.getStrName());
		System.out.println("전화:" + avo.getStrHp());
		System.out.println("주소:" + avo.getStrAddr());
		System.out.println("이메일:" + avo.getStrEmail());
		System.out.println("핸드폰:" + avo.getStrTel());
		
		

	}

}

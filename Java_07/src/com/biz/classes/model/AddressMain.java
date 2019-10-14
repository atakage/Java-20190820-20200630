package com.biz.classes.model;

import java.util.ArrayList;

public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddressVO avo = new AddressVO();
		AddressVO avo2 = new AddressVO();
		
		avo.address = "서울";
		avo.name = "김";
		avo.number = "010000000";
		avo.rel = "ㅇ";
		
		avo2.address = "부산";
		avo2.name = "박";
		avo2.number ="01000005";
		avo2.rel = "ㅇ";
		
		
		ArrayList<AddressVO> list = new ArrayList<AddressVO>();
		
		list.add(avo);
		list.add(avo2);
		
		System.out.println("이름\t전화번호\t주소\t관계");
		for(int i = 0; i < list.size(); i++) {
			list.get(i).printAdr();
		}
		

	}

}

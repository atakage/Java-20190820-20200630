package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StringServiceImpV1 implements StringService {

	List<String> strList;
	Scanner scan;
	Random rd;

	public StringServiceImpV1() { // 매개변수 없는 생성자: super, 기본 생성자
		// TODO Auto-generated constructor stub

		strList = new ArrayList<String>();
		scan = new Scanner(System.in);
		rd = new Random();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		String[] strStudent = new String[3];
		strStudent[0] = "홍길동:서울특별시:010-111:33";
		strStudent[1] = "성춘향:남원시:010-222:16";
		strStudent[2] = "이몽룡:익산시:010-333:18";

		String[] strNation = new String[] { "대한민국", "미국", "프랑스", "영국", "독일" };

		for (int i = 0; i < strStudent.length; i++) {

			System.out.println(strStudent[i]);

		}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}

package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeListService {

	Random rd = new Random();
	List<Integer> intList;

	public List<Integer> getListAll() {

		intList = new ArrayList<Integer>();

		int num1 = rd.nextInt(100) + 1;
		int num2 = rd.nextInt(100) + 1;
		int num3 = rd.nextInt(100) + 1;
		int num4 = rd.nextInt(100) + 1;

		intList.add(num1);
		intList.add(num2);
		intList.add(num3);
		intList.add(num4);

		return intList;
	}

	public List<Integer> getListAll(int length) {

		intList = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			int num = rd.nextInt(100)+1;
			intList.add(num);
		}

		return intList;
	}

}

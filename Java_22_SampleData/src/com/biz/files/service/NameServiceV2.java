package com.biz.files.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NameServiceV2 extends NameServiceV1 {

	List<String> korNameList;

	public NameServiceV2() {
		// TODO Auto-generated constructor stub

		korNameList = new ArrayList<String>();

		korNameList = new LinkedList<String>(); // Collections.sort(), Collections.shuffle() 등 사용할 때는 LinkedList

	}

	@Override
	public void writeNameFile(String fileName, int length) throws Exception {
		
		Random rnd = new Random();
		
		int nameSize = nameList.size();
		int famSize = nameList2.size();
		
		System.out.println("============================");
		System.out.printf("이름표 작성 시작 : %d\n", System.currentTimeMillis());
		for(int i = 0; i < 100; i++) {
			String strName = nameList.get(rnd.nextInt(nameSize));
			strName = strName + nameList2.get(rnd.nextInt(famSize));
			korNameList.add(strName);
			
		}
		
		System.out.printf("=============list 작성 완료 : %d----------------\n", System.currentTimeMillis());
		
		Collections.sort(korNameList);
		System.out.printf("==================정렬 완료 : %d=================\n", System.currentTimeMillis());
		
		PrintWriter fileOut = new PrintWriter(fileName);
		for(String s : korNameList) {
			fileOut.println(s);
		}
		
		fileOut.close();
	}

}

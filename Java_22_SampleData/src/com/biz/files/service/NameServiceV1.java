package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameServiceV1 implements NameService {

	List<String> nameList;
	List<String> nameList2;

	public NameServiceV1() {
		nameList = new ArrayList<String>();
		nameList2 = new ArrayList<String>();
	}

	public void nameRead(String nameFile, String nameFile2) throws Exception {

		FileReader fr = new FileReader(nameFile);
		BufferedReader br = new BufferedReader(fr);

		while (true) {

			String strName = br.readLine(); // 전부 다 읽어올 필요가?
			if (strName == null)
				break;

			String[] strNameArr = strName.split(":"); // 한글과 한자 분리 필요

			String strSPName = strNameArr[1].substring(0, 1);

			

			nameList.add(strSPName);

		}

		fr = new FileReader(nameFile2);
		br = new BufferedReader(fr);

		while (true) {

			String strName2 = br.readLine();
			if (strName2 == null)
				break;

			nameList2.add(strName2);
		}

		br.close();
		fr.close();

		
		
		Collections.shuffle(nameList);
		Collections.shuffle(nameList2);
		
	

		System.out.println(nameList.get(0));
		System.out.println(nameList2.get(0));

	}

	public void writeNameFile(String fileName, int length) throws Exception { // 100개만 출력생성

		FileWriter fw = new FileWriter(fileName);

		for (int i = 0; i < length; i++) {

			fw.write(nameList.get(i) + nameList2.get(i) + "\n");

		}
		fw.close();
		

	}

}

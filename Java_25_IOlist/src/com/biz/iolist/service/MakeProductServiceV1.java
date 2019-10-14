package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV1 {

	protected List<String> proNameList;
	protected List<String> proDuctList;
	
	
	public MakeProductServiceV1() {
		// TODO Auto-generated constructor stub
		
		proNameList = new ArrayList<String>();
		proDuctList = new ArrayList<String>();
	}

	public void getProductList(String proFileName, String proWriteFile) throws Exception {

		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);

		String reader = new String();

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			if (reader.length() < 1)
				continue; // if가 true면 반복문 시작부분으로 jump

			proNameList.add(reader);

		}
		buffer.close();						//파일을 읽기 위해서 FileReader, BufferedReader로 오픈을 한 후 while()반복문 내에서
		fileReader.close();					//연산 수행 시간이 오래 걸리거나 어떤 Exception이 발생할 확률이 조금이라도 있다면(중간에 읽고 있는 파일 손상 가능)
											// 읽어들인 문자열을 List type의 객체에 넣고 파일을 close() 한 후 생성된 list를 이용해 다른 연산 수행
		for (String pro : proNameList) {
			
			
			int price = (int) (Math.random() * (5000 - 800 + 1) + 800);	//Math 클래스는 수학연산과 관련된 method()를 가지고 있음
																//클래스를 객체로 생성하지 않고도 간단히 난수 발생 가능
			String product = String.format("%s:%d", pro, price);

			proDuctList.add(product);
		}

		PrintWriter fileOut = new PrintWriter(proWriteFile);
		for (String pro : proDuctList) {
			fileOut.println(pro);
		}
		fileOut.close();
	}
}

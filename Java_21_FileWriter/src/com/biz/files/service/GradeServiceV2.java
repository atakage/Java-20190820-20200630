package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeServiceV2 extends GradeServiceV1 {

	protected List<String> nameList = null;

	public GradeServiceV2() {

		nameList = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readNameFile(String nameFile) throws Exception {
		// TODO Auto-generated method stub

		FileReader fr = null;
		fr = new FileReader(nameFile);
		BufferedReader br = null;
		br = new BufferedReader(fr);

		while (true) {

			String str = br.readLine();
			if (str == null)
				break;

			nameList.add(str);

		}

		br.close();
		fr.close();
		
		

	}
	
	private void nameList() {
		for(String s : nameList) {
			System.out.println(s);
		}
		
		
	}

	@Override
	public void makeStudentFile(String StudentFile, int length) throws Exception {
		// TODO Auto-generated method stub
		
		
		Random rd = new Random();
		
		
		PrintWriter fileOut;
		
		fileOut = new PrintWriter(StudentFile);
		
		
		
		for(int i = 0; i < length; i++) {
			
			
			
			String strC = String.format("A%03d", i+1);
			int tel1st = rd.nextInt(10000);
			int tel2nd = rd.nextInt(10000);
			
			String strTel = String.format("010-%04d-%04d", tel1st, tel2nd);
			
			int intYear = rd.nextInt(100) + 1980;
			int intMonth = rd.nextInt(12)+1;
			int intDay = rd.nextInt(28)+1;
			
			String strBirth = String.format("%4d-%02d-%02d", intYear, intMonth, intDay);
			
			System.out.printf("%s\t%s\t%s\t%s\n", strC, nameList.get(i), strTel, strBirth);
			
			fileOut.printf("%s:%s:%s:%s\n", strC, nameList.get(i), strTel, strBirth);
			
			fileOut.flush();
			
		}
		
		
		
		
		}
	
	
	
	public void nameList2() {
		
		for(String s : nameList) {
			System.out.println(s);
		}
	}
	
}

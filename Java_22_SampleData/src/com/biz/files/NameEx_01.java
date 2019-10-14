package com.biz.files;

import com.biz.files.service.NameServiceV1;

public class NameEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		NameServiceV1 ns = new NameServiceV1();
		
		
		String nameFile = "src/com/biz/files/성씨리스트.txt";
		String nameFile2 = "src/com/biz/files/이름리스트.txt";
		
		String fileName = "src/com/biz/files/한글이름리스트.txt";
		
		try {
			ns.nameRead(nameFile, nameFile2);
			ns.writeNameFile(fileName, 100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

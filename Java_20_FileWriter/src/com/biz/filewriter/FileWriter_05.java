package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "src/com/biz/fileWriter/data2.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName, false);	// false : 기존 파일을 삭제하고 새로 생성한 후 기록할 수 있도록 open(기본 옵션)	
			String str = String.format("%s\n", "대한민국");
			fileWriter.write(str);
			
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

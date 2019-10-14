package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "src/com/biz/fileWriter/data2.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName, true);	//true : 파일을 열어 내용을 추가(append mode open)
			String str = String.format("%s\n", "대한민국");
			fileWriter.write(str);
			
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

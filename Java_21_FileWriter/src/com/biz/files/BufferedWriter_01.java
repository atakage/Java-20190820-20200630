package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "src/com/biz/files/data3.txt";
		
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			buffer.write("우리나라만세\n");
			buffer.write("우리나라만세\n");
			
			buffer.flush(); //buffer에 임시 저장된 데이터를 파일에 강제로 기록
			
			buffer.write("Korea\n");
			buffer.write("Republic of Korea\n");
			
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

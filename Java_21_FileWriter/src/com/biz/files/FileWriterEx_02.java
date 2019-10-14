package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/files/data1.txt";
		
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);		//기존에 파일이 있으면  내용 삭제
			fileWriter.write("Korea\n");
			fileWriter.write("대한민국\n");
			fileWriter.write("Korea\n");
			fileWriter.write(String.format("%05d\n", 1));
			fileWriter.write(String.format("합계 : %05d\n", 30+40));
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

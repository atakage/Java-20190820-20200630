package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "src/com/biz/files/data2.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName, true);	//기존 파일에 내용 추가하고 싶을 때는 생성자에 두 번째 매개변수로 true지정(기본 false)
														//파일이 없을 때는 새로 만들고 파일이 있으면 append mode로 파일을 open
			
			fileWriter.write("우리나라\n");
			fileWriter.write("대한민국\n");
			fileWriter.write("Republic of Korea\n");
			
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

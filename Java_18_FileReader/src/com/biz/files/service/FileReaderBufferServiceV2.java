package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderBufferServiceV2 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);	
		
		
		
		//파일에 저장된 문장의 줄 수만큼 buffer.readLine()을 반복해 실행하면
																	//모든 내용을 읽을 수 있을 것
		
		
		while(true) {
			String reader = buffer.readLine();
			
			if(reader == null)break;
			
			System.out.println(reader);
			
			
		}
		
		buffer.close();
		fileReader.close();
	}

}

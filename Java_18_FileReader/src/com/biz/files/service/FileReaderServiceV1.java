package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {
	
	FileReader fileReader;
	
	public void read(String fileName) throws IOException { //read() method가 실행되는 동안
																//Exception이 발생하면 read() method를 호출한 곳으로 Exception을 toss
		fileReader = new FileReader(fileName);
		
		
		while(true) {
			
			int intReadChar = fileReader.read();
			
			if(intReadChar < 0)				//if(intReadChar == -1)로 사용해도 되지만 intReadChar < 0 가 더 안전
				break;
			
			System.out.print((char)intReadChar);
			
			
		}
		
		fileReader.close();
	}

}

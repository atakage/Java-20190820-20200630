package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderServiceV2 {
	
	FileReader fileReader = null;
	
	
	public void read(String fileName) throws IOException {	//read method 실행되는 동안 exception 발생하면
																//read() method를 호출한 곳으로 exception을 toss
		fileReader = new FileReader(fileName);
		
		while(true) {
			
			int al = fileReader.read();
			if(al < 0)break;
			System.out.print((char)al);
			
			
			
			
		}
		
		
	}

}

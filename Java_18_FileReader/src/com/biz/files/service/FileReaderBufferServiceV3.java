package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderBufferServiceV3 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);	
		
		
		
	
		String reader = "";
	/*	
		while(reader != null) {
			reader = buffer.readLine();
			
			if(reader == null)break;
			
			System.out.println(reader);
			
			
		}
		
		*/
		
		do {
			reader = buffer.readLine();
			System.out.println(reader);
		}while(reader != null);
		
		
		buffer.close();
		fileReader.close();
	}

}

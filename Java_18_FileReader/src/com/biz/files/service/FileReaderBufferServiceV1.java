package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader만으로 text파일 읽기를 하면
 * OS와 JVM, App 사이에서 데이터가 이동되면서 프로세스가 집중되어 비효율적
 * 그래서 파일을 직접 읽어 메모리로 데이터를 가져오는 대신에
 * 중간에 완충장치를 두어서 안전하게 파일을 읽게 함(BufferedReader)
 * 
 */
public class FileReaderBufferServiceV1 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);	//fileReader 객체에 담긴 정보를 bufferedReader에 주입하면
												//fileReader와 buffer 사이에서 파일 내용을 읽어 메모리 어딘가에 보관
		
		String reader = buffer.readLine();
	}

}

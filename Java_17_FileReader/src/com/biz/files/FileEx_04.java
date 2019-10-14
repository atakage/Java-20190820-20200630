package com.biz.files;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.files.service.FileReaderServiceV2;

public class FileEx_04 {
	
	
	/*
	 * 
	 * FileReader: text파일 직접 읽어서 문자 단위로 cpu 전송하여 연산 수행
	 * 					파일을 다이렉트로 읽어서 처리하기 때문에 파일이 매우 크면 App 실행 속도 저하
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileReaderServiceV2 fs = new FileReaderServiceV2();
		
		String fileName = "src/com/biz/files/data.txt";
		
		
		fs.read(fileName);
		
		}

	}



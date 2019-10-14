package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_03 {
	
	public static void main(String[] args) {
		
		
		String fileName = "src/com/biz/fileWriter/data2.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			/*
			 * 만약 파일을 writer하기 위해 open 상태에서 무한 반복 상태에 빠지게 되면 그 파일은 아무도 사용 불가
			 * 운영체제 상태에서 삭제도 불가
			 * 
			 * 읽기 위해 open한 경우는 close()하지 않아도 큰 문제 없으나 기록을 위해 open한 경우는 반드시 close()
			 */
			while(true) {
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

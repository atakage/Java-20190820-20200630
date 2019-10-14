package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/filewriter/data.txt";
		
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("대한민국만세");
			fileWriter.write(97);
			
			for(int i = 97; i < 124; i++) {
				fileWriter.write(i);
			}
			
			fileWriter.write(13); // \n
			
			for(int i = 'A'; i <= 'Z'; i++) {
				fileWriter.write(i);
			}
			fileWriter.close();		//파일을 기록할 때 write() 메서드는 직접 파일을 기록하지만 JVM이 임시로 기억장치 어딘가에
													//모아둠 만약 close()하지 않고 프로젝트가 끝나면 JVM이 모아둔 데이터 소멸
																//close()실행 시 JVM이 OS에 해당 데이터 전달하고 파일 기록 요청
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

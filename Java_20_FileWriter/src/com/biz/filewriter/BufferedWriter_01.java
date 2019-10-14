package com.biz.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/biz/fileWriter/data2.txt";
		FileWriter fileWriter;
		BufferedWriter buffer;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			String str = String.format("%20s\n" , "Republic of Korea");
			
			buffer.write(str);												//buffer.write() method로 데이터를 기록하면 메모리의 buffer 영역을 만들고 데이터를 기록한다
																		//buffer 메모리 영역이 가득차면 JVM과 OS는 자동으로 해당 내용을 파일에 기록
			buffer.flush();									//현재 buffer에 저장되어 있는 내용을 파일에 강제 기록
															//close()는 실행하면 더이상 write()를 실행할 수 없지만 flush()는 실행한 ㅎ 다시 write() 실행해 기록 가능
			
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

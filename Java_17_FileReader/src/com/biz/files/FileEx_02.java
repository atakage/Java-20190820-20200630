package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_02 {
	
	public static void main(String[] args) {
		
		String file = "src/com/biz/files/data.txt";
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			int al = 0;
			
			while(al != -1) {
				al = fileReader.read();
				System.out.println(al +":"+(char)al);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없음");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 읽는 동안 문제 발생");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("어떤 exception이라도 처리 가능");
		}
		
		
	}

}

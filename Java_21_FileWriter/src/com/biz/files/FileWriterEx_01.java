package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "scr/com/biz/files/data1.txt";
		
		FileWriter fileWriter;
		
		try {
			fileWriter  = new FileWriter(fileName); // fileWriter는 FileWriter 클래스의 instance가 됨
																
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

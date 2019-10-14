package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/files/data.txt";
		
		FileReader fileReader;
		
		try {
			fileReader = new FileReader(fileName);
			
			int intChar = fileReader.read();
			
			System.out.print(intChar);
			System.out.print(":");
			System.out.println((char)intChar);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

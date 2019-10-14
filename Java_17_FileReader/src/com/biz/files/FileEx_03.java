package com.biz.files;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.files.service.FileReaderServiceV1;

public class FileEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReaderServiceV1 fs = new FileReaderServiceV1();
		
		
		
		try {
			fs.read("src/com/biz/files/data.txt");
			
		}catch (FileNotFoundException e){
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

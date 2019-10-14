package com.biz.stream.exec;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imgFile = "src/com/biz/stream/2019(2).png";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(imgFile);		//FileInputStream으로 open된 파일을 읽어 buffer 메모리에 임시 저장
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = new byte[32];
			bis.read(bytes);						//  read()메서드를 통해 buffer로부터 값을 읽어들임
			
			for(int i = 0; i <bytes.length; i++) {
				System.out.printf("%02x", bytes[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

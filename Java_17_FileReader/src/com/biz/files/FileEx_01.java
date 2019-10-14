package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {
	
	
	public static void main(String[] args) {
		
		String file = "src/com/biz/files/data.txt";
		FileReader fileReader = null;	// 파일을 읽을 테니 운영체제에 허락해달라는 요청과, 후에 파일에 대한 정보를 java코드에서
		try {											//사용할 수 있도록 준비해 주는 클래스
			fileReader = new FileReader(file);		//FileReader의 선언문과 생선문을 분리하는데 그 이유는	
			int alpha = fileReader.read();					//fileReader 객체에 접근할 수 없는 scope문제 해결 위한 것
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	
	
	}

}

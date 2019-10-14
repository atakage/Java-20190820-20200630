package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx_01 {

	public static void main(String[] args) {

		String imgFile = "src/com/biz/stream/2019(1).png";

		FileInputStream fis = null; // 파일을 byte 단위로 읽을 수 있는 class로 text file, 그림, 영상, 음악 모두 가능

		try {
			fis = new FileInputStream(imgFile);
			int input = 0;

			while (true) {

				input = fis.read();
				if (input == -1)
					break;

				System.out.printf("%x\n", input);	// input 변수에 담긴 값을 16진수로 표현
			}

			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Hello Korea");

	}
}

package com.biz.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/files/data4.txt";
		
		PrintWriter fileOut = null;	//PrintWriter는 무조건 모든 파일을 새로 생성하므로 append mode로 파일 open 불가
									//두 번째 method를 지정하면 flush() method를 자동으로 실행
		try {
			fileOut = new PrintWriter(fileName);
			fileOut.println("우리나라 만세");
			fileOut.println(30*40);
			fileOut.println(200 % 2);
			
			fileOut.printf("%5d", 30+40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

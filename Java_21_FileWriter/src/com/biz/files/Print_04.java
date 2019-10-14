package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/files/data4.txt";
		
		FileWriter fileWriter = null;
		PrintWriter fileOut = null;	//PrintWriter는 무조건 모든 파일을 새로 생성하므로 append mode로 파일 open 불가
									//두 번째 method를 지정하면 flush() method를 자동으로 실행
		
							//자동 flush는 print()를 실행할 때 마다 기록이 되는 것이 아니고 내부에서 buffer를 별도로 관리하면서 내용을 기록(안전성 떨어짐)		
		try {
			
			fileWriter = new FileWriter(fileName, true);
			fileOut = new PrintWriter(fileWriter);			//file을 append mode로 열고자 할 때는 FileWriter를 사용해 append mode로 open 후 PrintWriter에(buffer 생략) 직접 주입 
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

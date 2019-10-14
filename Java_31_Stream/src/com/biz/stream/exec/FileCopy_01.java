package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class FileCopy_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String imgSrcFile = "src/com/biz/stream/2019(3).png";
		String imgCopyPath = "src/com/biz/stream/";
		
		Random rd = new Random();
		
		InputStream is = null;		//인터페이스와 기능이 비슷한 추상클래스
		OutputStream os = null;
		
		try {
			is = new FileInputStream(imgSrcFile);
			
			imgCopyPath += Math.abs(rd.nextInt()) + ".png";		// Math.abs(): 정ㅅ의 절댓값을 계산하는 method
			os = new FileOutputStream(imgCopyPath);
			
			byte[] bytes = new byte[1024]; // 1kb 크기, 한번에 파일ㅇ르 읽어서 복사할 용량
			
			while(true) {
				int length = is.read(bytes);		//FileInputStream의 read() method에 byte배열을 매개변수로 전달하면
													// 파일에서 읽은 내용(data)을 byte배열에 담아 전달하고 byte 배열에 담은 데이터 개수를 return
				if(length < 1)break;
				
				os.write(bytes);
			}
			
			is.close();
			os.close();
			System.out.println("File Copy Ok");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

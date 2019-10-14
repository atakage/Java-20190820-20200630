package com.biz.stream.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String objSaveFile = "src/com/biz/stream/obj.dat";
		
		String strName = "홍길동";
		String strNation = "Republic of Korea";
		Integer intYear = 2019;
		
		
		
		OutputStream os = null;
		ObjectOutputStream oos = null;
		
		
		try {
			os = new FileOutputStream(objSaveFile);
			oos = new ObjectOutputStream(os);
			
			oos.writeObject(strName);
			oos.writeObject(strNation);
			oos.writeObject(intYear);
			
			oos.flush();
			oos.close();
			
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

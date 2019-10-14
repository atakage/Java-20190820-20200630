package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String objSaveFile = "src/com/biz/stream/obj.dat";
		
		InputStream  is = null;
		ObjectInputStream ois = null;
		
		try {
			is = new FileInputStream(objSaveFile);
			ois = new ObjectInputStream(is);
			String strName = (String)ois.readObject();
			String strNation = (String)ois.readObject();
			Integer intYear = (Integer)ois.readObject();
			
			System.out.println("strName" + strName);
			System.out.println("strNation" + strNation);
			System.out.println("intYear" + intYear);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class IolistServiceImpV1 implements IolistService{

	

	
	
	@Override
	public void read(String fileName) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr;
		BufferedReader br;
		
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		
		String str = new String();
		while(true) {
			
		str = br.readLine();
		if(str == null)break;
		System.out.println(str);
		}
		br.close();
		fr.close();
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		
	}

	
}

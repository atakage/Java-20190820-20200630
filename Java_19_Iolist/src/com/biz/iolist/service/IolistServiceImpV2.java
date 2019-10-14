package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV2 implements IolistService{

	protected List<IolistVO> iolist;
	
	
	public IolistServiceImpV2() {
		iolist = new ArrayList<IolistVO>();
	}
	
	
	@Override
	public void read(String fileName) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader =  new String();
		while(true) {
			
			reader = buffer.readLine();
			if(reader == null)break;
			
			
			String[] ios = reader.split(":");
			
			String strDate = ios[0];
			String strpName = ios[1];
			String strIO = ios[2];
			int intPrice = Integer.valueOf(ios[3]);
			int intQtt = Integer.valueOf(ios[4]);
			
			IolistVO vo = new IolistVO();
			
			vo.setStrDate(strDate);
			vo.setStrPName(strpName);
			vo.setStrIO(strIO);
			vo.setIntPrice(intPrice);
			vo.setIntQtt(intQtt);
			
			iolist.add(vo);
			
			
		}
		buffer.close();
		fileReader.close();
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
		this.list_header();
		
		for(IolistVO vo : iolist) {
			
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrPName()+"\t");
			
			
			
			
			System.out.print(vo.getStrIO()+"\t");
			
			
			
			int ioval = Integer.valueOf(vo.getStrIO());
			
			
			
			if(ioval==1) {
				
				System.out.print(vo.getIntPrice()+"\t");
				System.out.print("0"+"\t");
				
			}else {
				
				System.out.print("0"+"\t");
				System.out.print(vo.getIntPrice()+"\t");
			}
			
			
			System.out.print(vo.getIntQtt()+"\n");
			
		}
		
	}
	
	protected void list_header() {
		
		System.out.println("거래일자\t상품명\t\t구분\t매입단가\t매출단가\t수량");
		System.out.println("================================================");
		
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		
	}

}

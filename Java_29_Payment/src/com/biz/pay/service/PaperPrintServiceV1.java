package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

// PayReadServiceV1 -> PaperMakeServiceV1 - > PaperPrintServiceV1(콘솔 출력)

public class PaperPrintServiceV1 {

	PayReadServiceV1 pReadService;
	PaperMakeServiceV1 pMakeService;
	List<List<PaperVO>> paperAllList;

	String payFile; // EX 클래스에서 파일 이름 주입 받음

	public PaperPrintServiceV1() {
		// TODO Auto-generated constructor stub
		pReadService = new PayReadServiceV1();
		pMakeService = new PaperMakeServiceV1();

	}

	public PaperPrintServiceV1(String payFile) {
		// TODO Auto-generated constructor stub
		this(); // 기본 생성자 호출
		this.payFile = payFile;

	}

	public void setPayFile(String payFile) {
		this.payFile = payFile;
	}

	public void printPaper() throws Exception {
		
		String payPath = "src/com/biz/pay/";
		

		for (List<PaperVO> paperList : this.paperAllList) {
			
			PrintWriter fileOut = new PrintWriter(payPath + paperList.get(0).getMember());

			  fileOut.println("=====================================================");
			  fileOut.print("사원번호:" +paperList.get(0).getMember()); 
			  fileOut.print("급여액:" +paperList.get(1).getMember()+"\n");
			  fileOut.println("=====================================================");
			
			
			


			for (PaperVO vo : paperList) {
				fileOut.printf("%s\t%d\n", vo.getPaper(), vo.getCount());
			}
			fileOut.close();

		}
	}

	public void viewPaper() throws Exception {

		for (List<PaperVO> paperList : this.paperAllList) {

			
			  System.out.println("=====================================================");
			  System.out.print("사원번호:" +paperList.get(0).getMember()); 
			  System.out.print("급여액:" +paperList.get(1).getMember()+"\n");
			  System.out.println("=====================================================");
			

			for (PaperVO vo : paperList) {
				System.out.printf("%s\t%d\n", vo.getPaper(), vo.getCount());
			}

		}

	}

	public void makePaperList() throws Exception {
		pReadService.readPay(this.payFile);
		List<String> payStrList = pReadService.getPayStrList();
		paperAllList = new ArrayList<List<PaperVO>>();

		for (String pay : payStrList) {

			String[] pays = pay.split(":");

			int intPay = Integer.valueOf(pays[1]);

			pMakeService.make(intPay);
			List<PaperVO> paperList = pMakeService.getPaperList();
			paperList.get(0).setMember(pays[0]);
			paperList.get(1).setMember(pays[1]);

			paperAllList.add(paperList);

		}
	}

}

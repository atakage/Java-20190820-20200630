package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankBookVO;
import com.biz.bank.util.BankInfo;

public class BankServiceImpV1 implements BankService {

	Map<String, BankBookVO> bankBookList;
	Scanner scanner;
	BankBookVO bookVO;
	
	String bookFile;

	public BankServiceImpV1() {
		// TODO Auto-generated constructor stub

		bankBookList = new TreeMap<String, BankBookVO>(); // TODO: TreeMap: Key값을 중심으로 오름차순 정렬
		scanner = new Scanner(System.in);
		
	}

	@Override
	public void readBook(String bookFile) throws Exception { // 잔고원장 파일을 읽어 리스트로 생성
		
		this.bookFile = bookFile;
		
		FileReader fileReader;
		BufferedReader buffer;
		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {

			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] books = reader.split(":");

			String strNum = books[BankInfo.BOOK.NUM];
			String strBalance = books[BankInfo.BOOK.BALANCE];
			String strLastDate = books[BankInfo.BOOK.LASTDATE];
			String strRemark = books[BankInfo.BOOK.REMARK];
			int intBalance = Integer.valueOf(strBalance);

			BankBookVO bookVO = new BankBookVO();

			bookVO.setNum(strNum);
			bookVO.setBalance(intBalance);
			bookVO.setLastDate(strLastDate);
			bookVO.setRemark(strRemark);

			bankBookList.put(strNum, bookVO);

			System.out.println(bookVO.toString());
		}

		buffer.close();
		fileReader.close();

	}

	@Override
	public void viewAcc() { // 키보드로 계좌번호 입력받아 계좌번호가 list에 있으면 계좌정보(vo) 추출하여 임시 보관
		// TODO Auto-generated method stub

		System.out.print("계좌번호>> ");
		String strNum = scanner.nextLine();

		bookVO = bankBookList.get(strNum);

		if (bookVO == null) {
			System.out.println("계좌정보 없음");
		}

	}

	@Override
	public void input() throws Exception {
		// TODO Auto-generated method stub
		
		
		this.viewAcc();
		
		if (bookVO == null)
			return;

		System.out.print("입금액>> ");
		String strInput = scanner.nextLine();
		int intInput = Integer.valueOf(strInput);

		if (intInput < 0) {
			System.out.println("입금액은 0원 이상");
			return;
		}

		int intBalance = bookVO.getBalance();
		intBalance += intInput;
		bookVO.setBalance(intBalance);
		bookVO.setRemark("입금");
		
		
		
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String lastDate = sd.format(date);
		bookVO.setLastDate(lastDate);
		
		bankBookList.put(bookVO.getNum(), bookVO);
		
		
		this.accListWriter(BankInfo.REMARK.INPUT, intInput);
		
		this.bookWrite(bookFile);			//저장할 파일 경로가 담긴 변수 넘겨 줄 방법을 모색
								//input(String bookFile)로 변경할 수도 있지만  그렇게 할 시
							//interface, 그리고 interface를 implement한 클래스 모두를 변경해야 하는 대공사 상황 발생
								//그러니 멤버 변수를 생성해서 그곳에서 값 주고 받기

	}

	@Override
	public void output() throws Exception {
		// TODO Auto-generated method stub
		
		this.viewAcc();
		int intOutput = 0;

		if (bookVO != null) {
			System.out.print("출금액>> ");
			String strOutput = scanner.nextLine();
			intOutput = Integer.valueOf(strOutput);
			if (intOutput > 0) {
				int intBalance = bookVO.getBalance();
				if (intBalance >= intOutput) {
					intBalance -= intOutput;
					bookVO.setBalance(intBalance);
					
				} else {
					System.out.println("잔액 부족");
				}
			} else {
				System.out.println("출금액은 0이상이어야 함");
			}
		}

		bookVO.setRemark("출금");
		
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String lastDate = sd.format(date);
		bookVO.setLastDate(lastDate);
		
		bankBookList.put(bookVO.getNum(), bookVO);
		
		
		
		this.accListWriter(BankInfo.REMARK.OUTPUT, intOutput);
		
		this.bookWrite(bookFile);

	}

	@Override
	public void bookWrite(String bookFile) throws Exception { // 입출금이 완료되느 ㄴ순간 bookFile에 변동 내역 저장
		// TODO Auto-generated method stub

		//this.bookFile = bookFile;
		
		FileWriter fw = new FileWriter(bookFile);
		BufferedWriter bw = new BufferedWriter(fw);
		Set<String> setkey = bankBookList.keySet();
		for (String strKey : setkey) {
			bw.write(bankBookList.get(strKey).getNum() + ":" + bankBookList.get(strKey).getBalance() + ":"
					+ bankBookList.get(strKey).getLastDate() + ":" + bankBookList.get(strKey).getRemark() + "\n");

		}
		bw.close();
		fw.close();
		System.out.println("파일 작성 완료");
		
	}

	@Override
	public void accListWriter(String remark, int money) throws Exception {	//어떤 계좌에서 입금이나 출금 발생하면 내역을 계좌번호 파일에 저장
		// TODO Auto-generated method stub
		
		String strAccPath = "src/com/biz/bank/books/";
		
		FileWriter fileWriter;
		PrintWriter accBook;
		
		String accBookFile = String.format("BOOK-%s.txt", bookVO.getNum());
		
		fileWriter = new FileWriter(strAccPath + accBookFile, true); // FileWriter(, true) 파일이 이미 있으면 apped(확장) mode
		accBook = new PrintWriter(fileWriter);
		
		int intBalance = bookVO.getBalance();
		String lastDate = bookVO.getLastDate();
		
		int intInput = 0;
		int intOutput = 0;
		
		intInput = money;
		if(remark.equals(BankInfo.REMARK.OUTPUT)) {
			intInput = 0;
			intOutput = money;
		}
		
		String strWriter = String.format("%s:%s:%d:%d:%d", lastDate, remark, intInput, intOutput, intBalance);
		accBook.println(strWriter);
		accBook.flush();
		accBook.close();
		fileWriter.close();
	}
	


}

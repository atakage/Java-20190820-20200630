package com.biz.bank.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankServiceImpV2 extends BankServiceImpV1{

	public void output() {
		// TODO Auto-generated method stub

		if (bookVO == null)
			return;

		System.out.print("출금액>> ");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		int intBalance = bookVO.getBalance();

		if (intOutput < 0) {
			System.out.println("출금액 입력 오류");
			return;
		}

		if (intOutput > intBalance) {
			System.out.println("잔액 부족");
			return;
		}

		intBalance = intBalance - intOutput;

		bookVO.setBalance(intBalance);
		
		LocalDate localDate = LocalDate.now();	//java 1.8에서 새롭게 등장한 날짜 클래스로 Date 클래스에서 발생한 이슈가 상당부분 해소
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String lastDate = localDate.format(df);
		
		bookVO.setRemark("출금");
		bookVO.setLastDate(lastDate);
		
		System.out.println("출금 완료");

	}

}

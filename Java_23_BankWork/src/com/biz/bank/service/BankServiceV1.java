package com.biz.bank.service;

import java.util.Scanner;

public class BankServiceV1 {

	int intBalance = 0;
	String strAccNum;

	Scanner scanner;
	boolean tf;

	public BankServiceV1() {
		scanner = new Scanner(System.in);
	}

	public BankServiceV1(String strAccNum, int intBalance) {
		this.strAccNum = strAccNum;
		this.intBalance = intBalance;
		scanner = new Scanner(System.in);
	}

	public boolean viewAcc() {

		tf = true;

		System.out.println("계좌 조회");
		System.out.print("계좌번호>>");
		String strAccKeyIn = scanner.nextLine();
		if (strAccKeyIn.equals(strAccNum)) {
			System.out.println("===========================");
			System.out.printf("계좌번호: %s\n", strAccNum);
			System.out.printf("잔고: %d\n", intBalance);
			System.out.println("===========================");
		} else {
			System.out.println("계좌번호 없음");
			tf = false;

		}
		
		

		return tf;

	}

	public void input() throws NumberFormatException {

		System.out.println("입금 처리");
		System.out.println("========================");
		System.out.print("입금액>>");
		String strInput = scanner.nextLine();
		int intInput = Integer.valueOf(strInput);
		intBalance += intInput;

	}

	public void output() throws NumberFormatException {
		System.out.println("출금 처리");
		System.out.println("==========================");
		System.out.print("출금액>>");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		if (intBalance >= intOutput) {
			intBalance -= intOutput;
		} else {
			System.out.println("잔액부족 출금거부");
		}
	}

}

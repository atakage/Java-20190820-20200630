package com.biz.bank.service;

import java.util.Scanner;

import com.biz.bank.exec.BankAccVO;

public class BankAccServiceV1 implements BankAccService{

	BankAccVO bankAccVO;
	Scanner scanner;

	public BankAccServiceV1(String strNum, int intBalance) {
		bankAccVO = new BankAccVO();
		scanner = new Scanner(System.in);
		
		bankAccVO.setNum(strNum);
		bankAccVO.setBalance(intBalance);
	}
	
	@Override
	public boolean viewAcc() {
		
		System.out.println("계좌번호>>");
		String strAccNum = scanner.nextLine();
		if(!strAccNum.equals(bankAccVO.getNum())) {
			System.out.println("계좌번호 오류");
			return false;
		}
		
		System.out.println("=====================");
		System.out.println("계좌번호:"+bankAccVO.getNum());
		System.out.println("최종잔액:"+bankAccVO.getBalance());
		System.out.println("최종거래:"+bankAccVO.getLastDate());
		System.out.println("비고:"+bankAccVO.getRemark());
		System.out.println("===================");
		
		return true;
	}
	
	@Override
	public void input() {
		
		if(this.viewAcc()) {
			System.out.print("입금액:");
			String strInput = scanner.nextLine();
			int intInput = Integer.valueOf(strInput);
			
			
			bankAccVO.setBalance(bankAccVO.getBalance() + intInput);
		}
		
		
	}
	
	@Override
	public void output() {
		
		if(this.viewAcc()) {
		System.out.println("출금액");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		
		int intBalance = bankAccVO.getBalance();
		if(intBalance >= intOutput) {
			intBalance -= intOutput;
			bankAccVO.setBalance(intBalance);
		}
		}
		
	}

}

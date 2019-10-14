package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV1;

public class BankEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankServiceV1 bs = null;

		Scanner scanner = new Scanner(System.in);

		String strAccNum = "0001";
		int intBalance = 100000;

		bs = new BankServiceV1(strAccNum, intBalance);

		while (true) {
			System.out.println("=======================광한루 은행=========================");
			System.out.println("1.조회 2.입금 3.출금 0.종료");
			System.out.println("==========================================================");
			System.out.print("선택>>");
			String strMenu = scanner.nextLine();
			int intMenu = Integer.valueOf(strMenu);

			if (intMenu == 0) {
				break;
			}

			switch (intMenu) {			//switch(문자열, 숫자, 문자... 가능) , 문자열일 경우 문제 가능성 있음
			case 1:
				System.out.println("계좌조회");
				 break;
			case 2:
				System.out.println("입금처리");
				 break;
			case 3:
				System.out.println("출금처리");
				 break;

			}

		}

	}

}

package com.biz.bank.service;

import java.util.Scanner;

public class BankEx_02 {

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
			if (intMenu == 0)
				break;
			else if (intMenu == 1) {

				bs.viewAcc();
			} else if (intMenu == 2) {

				boolean tf = bs.viewAcc();
				System.out.println(bs.tf);
				if (tf == false) {
					continue;
				}
				bs.input();

			} else if (intMenu == 3) {

				boolean tf = bs.viewAcc();
				System.out.println(bs.tf);
				if (tf == false) {
					continue;
				}
				bs.output();
			}

		}
		System.out.println("업무 종료");

	}

}

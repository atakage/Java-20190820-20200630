package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV1;

public class BankEx_03 {

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
				
				
				if (bs.viewAcc()) {
					bs.input();
				}else {
					System.out.println("입금처리 불가");
				}
				

			} else if (intMenu == 3) {
			
				if(bs.viewAcc()) {
					bs.output();
				}else {
					System.out.println("출금처리 불가");
				}
			}

		}
		System.out.println("업무 종료");

	}

}

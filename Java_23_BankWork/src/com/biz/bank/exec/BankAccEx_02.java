package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccService;
import com.biz.bank.service.BankAccServiceV2;

public class BankAccEx_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BankAccService bs = new BankAccServiceV2();
		Scanner scanner = new Scanner(System.in);
		String strBookFile = "src/com/biz/bank/계좌원장.txt";
		
		
		while (true) {

			System.out.println("============한국 은행 차세대 시스템 v2========");
			System.out.println("1.조회 2.입금 3.출금 4.전체조회 0.종료");
			System.out.println("===============================================");
			System.out.print("업무 선택>>");
			String strMenu = scanner.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			if (intMenu == 0) {
				BankAccServiceV2 bs2 = (BankAccServiceV2)bs;
				bs2.writeAccBook(strBookFile);
				System.out.println("종료");
				break;
			}
				

			try {
				if (intMenu == 1)
					bs.viewAcc();

				else if (intMenu == 2)
					bs.input();
				else if (intMenu == 3)
					bs.output();
				else if(intMenu == 4) {
					((BankAccServiceV2)bs).bankBookList();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		scanner.close();

	}

}

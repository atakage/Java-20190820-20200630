package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV1;

public class BankEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankService bs = new BankServiceImpV1();
		Scanner scanner = new Scanner(System.in);

		String bookFile = "src/com/biz/bank/활빈당은행잔고원장.txt";
		
		

		try {

			while (true) {

				bs.readBook(bookFile);		// 파일에서 원장을 읽은 후 업무를 진행하는 과정에서 만약 어떤 원인으로 app이 중단되면
											//그동안 수행한 입출금 내역이 메모리에만 있기 때문에 모두 사라져 버리고 app을 새로 시작하면 처음으로
										// 데이터 초기화, 그래서 입출금이 완료되는 순간 원장 정보를 저장하여 언제든지 app을 새로 시작하면 이전 업무 수행 다음부터 진행할 수 있도록 함
											//반복문 내에서 업무 선택전에 원장을 읽어 리스트를 생성하는 일 먼저 수행

				System.out.println("=========================");
				System.out.println("활빈당 종합 은행 v1");
				System.out.println("=========================");
				System.out.println("1.원장리스트 2.계좌조회 3.입금 4.출금 5.종료");
				System.out.println("---------------------------------------------");
				String strMenu = scanner.nextLine();
				int intMenu = Integer.valueOf(strMenu);

				if (intMenu == 0)
					break;
				else if (intMenu == 1) {
					// bs.bookList();
				} else if (intMenu == 2) {
					bs.viewAcc();
				} else if (intMenu == 3) {
					bs.input();
				} else if (intMenu == 4) {
					bs.output();
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

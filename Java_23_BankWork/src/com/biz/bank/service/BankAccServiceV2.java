package com.biz.bank.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.exec.BankAccVO;

public class BankAccServiceV2 implements BankAccService {

	Map<String, BankAccVO> bankList; // 이 인스턴스가 가지고 잇는 멤버 변수들을 변경하면 그 정보는 bankList에도 반영
	BankAccVO bankAccVO; // bankAccVO의 balance, lastDate, remark 정보를 update하면 bankList에 다시 담지 않아도 자동으로
							// bankList에 반영
	Scanner scanner;

	public BankAccServiceV2() {
		bankList = new TreeMap<String, BankAccVO>();
		scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			String strNum = String.format("%04d", i + 1);

			BankAccVO bVO = new BankAccVO();
			bVO.setNum(strNum);
			bVO.setBalance(100000);
			bVO.setLastDate("2019-09-23");
			bVO.setRemark("신규");

			bankList.put(strNum, bVO);

		}
	}

	@Override
	public boolean viewAcc() throws Exception {

		System.out.print("계좌번호>>");
		String strNum = scanner.nextLine();
		bankAccVO = bankList.get(strNum); // 만약 strNum 계좌가 bankList에 있으면 해당 계좌정보가 bankAccVO에 담길 것이고
											// 그렇지 않으면 bankAccVO에는 null
		if (bankAccVO != null) {
			System.out.println("================");
			System.out.println("계좌번호:" + bankAccVO.getNum());
			System.out.println("최종잔액:" + bankAccVO.getBalance());
			System.out.println("거래일자:" + bankAccVO.getLastDate());
			System.out.println("거래구분:" + bankAccVO.getRemark());

		} else {
			System.out.println("계좌정보 없음");
		}

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void input() throws Exception {
		// TODO Auto-generated method stub

		this.viewAcc();
		if (bankAccVO != null) {

			System.out.print("입금액>>");
			String strInput = scanner.nextLine();
			int intInput = Integer.valueOf(strInput);

			int intBalance = bankAccVO.getBalance();
			intBalance += intInput;
			bankAccVO.setBalance(intBalance);
			bankAccVO.setRemark("입금");
			// DecimalFormat 숫자값 3000을 3,000으로 바꿀 때 사용하는 클래스
			Date date = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			String strLastDate = sd.format(date);
			bankAccVO.setLastDate(strLastDate);

		} else {
			System.out.println("계좌 정보 없음");
		}
	}

	@Override
	public void output() throws Exception {
		// TODO Auto-generated method stub

		this.viewAcc();
		if (bankAccVO != null) {
			System.out.print("출금액>>");
			String strOutput = scanner.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getBalance();

			if (intBalance >= intOutput) {
				intBalance -= intOutput;
				bankAccVO.setBalance(intBalance);
				bankAccVO.setRemark("출금");

				Date date = new Date();
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				String strLastDate = sd.format(date);
				bankAccVO.setLastDate(strLastDate);

			} else {
				System.out.println("잔액부족 출금불가");
			}
		}

	}

	public void writeAccBook(String strBookFile) throws Exception {

		FileWriter fw = new FileWriter(strBookFile);
		BufferedWriter bw = new BufferedWriter(fw);

		for (String key : bankList.keySet()) {	//key값 계속 뽑으므로 비효율적, 키값 저장할 변수 만들어서 저장해 놓고 돌리는 게

			BankAccVO vo = bankList.get(key);		//vo 변수도 하나 더 있고 뭔가..ㄴ bankBookList와 비교

			String str = vo.getNum() + ":" + vo.getBalance() + ":" + vo.getLastDate() + ":" + vo.getRemark() + "\n";
			bw.write(str);

		}

		bw.close();
		fw.close();
	}
	
	public void bankBookList() {
		
		System.out.println("===============================");
		System.out.println("계좌번호\t잔액\t거래일자\t거래구분");
		System.out.println("================================");
		
		
		
		Set<String> key = bankList.keySet();
		
		
		for(String strKey: key) {
			
			
			
			System.out.print(bankList.get(strKey).getNum()+"\t");
			System.out.print(bankList.get(strKey).getBalance()+"\t");
			System.out.print(bankList.get(strKey).getLastDate()+"\t");
			System.out.print(bankList.get(strKey).getRemark()+"\n");
		}
		
	}

}

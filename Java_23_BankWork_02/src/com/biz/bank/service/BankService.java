package com.biz.bank.service;

public interface BankService {
	
	public void readBook(String bookFile) throws Exception;	//method prototype 정의, obj.readBook("거래원장.txt")
	
	public void viewAcc();
	
	public void input() throws Exception;
	
	public void output() throws Exception;
	
	public void bookWrite(String bookFile) throws Exception;	//입출금이 완료되었을 때 원장 정보를 업데이트
	
	public void accListWriter(String remark, int money) throws Exception; //각 계좌별 입출금 내역을 파일로 저ㅏㅇ

}
package com.biz.bank.service;

import java.util.Scanner;

import com.biz.bank.exec.BankAccVO;

public interface BankAccService {

	public boolean viewAcc() throws Exception;

	public void input() throws Exception;

	public void output() throws Exception;

}

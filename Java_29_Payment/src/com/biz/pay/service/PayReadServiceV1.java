package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PayReadServiceV1 {

	private List<String> payStrList;

	public List<String> getPayStrList() {

		return payStrList;

	}

	public void readPay(String payFile) throws Exception {

		payStrList = new ArrayList<String>();

		FileReader fr = new FileReader(payFile);
		BufferedReader br = new BufferedReader(fr);

		String str = new String();

		while (true) {

			str = br.readLine();

			if (str == null)
				break;

			payStrList.add(str);

		}

		br.close();
		fr.close();
	}

}

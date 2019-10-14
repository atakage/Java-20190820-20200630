package com.biz.date.exec;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {
	
	public static void main(String[] args) {
		
		
		Date date = new Date();		// old java에서 사용하는 날짜와 관련된 class, 날짜와 관련된 연산(날짜 수동 계산)에서
										// 정확하지 않은 값이 추출되는 등 이슈가 있음
											// 실무에서는 날짜와 관련된 데이터를 순수한 문자열로 변환하거나 다양한 방법으로 연산을 수행해옴

		
		
		
		Date date2 = new Date(System.currentTimeMillis());	// Date() 생성자에 매개변수를 사용하지 않으면 JDK 8 이상 버전에서 문제를 일으킴
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		// 형식지정 객체  생성
		
		String curDate = sdf.format(date2);	// format() method를 사용해서 문자열로 변환
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
		
		String curTime = sdf2.format(date2);
		
		System.out.println("오늘:" + curDate);
		System.out.println("현재시각:" + curTime);
		
	}

}

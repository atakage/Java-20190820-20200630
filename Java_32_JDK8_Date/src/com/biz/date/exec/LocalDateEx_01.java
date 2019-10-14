package com.biz.date.exec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();			// Date, Calendar 클래스의 다양한 이슈를 해결하고 locale(로케일, 국가별) 여러가지 사항을 해결
															// JDK 8 이상에서만 사용 가능
		
		
		DateTimeFormatter dDate = DateTimeFormatter.ofPattern("yyy-MM-dd");
		
		String curDate = dDate.format(localDate);

		
		System.out.println("오늘 날짜:" + curDate);
	}

}

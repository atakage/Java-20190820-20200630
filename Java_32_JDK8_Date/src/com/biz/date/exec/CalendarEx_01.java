package com.biz.date.exec;

import java.util.Calendar;

public class CalendarEx_01 {
	
	public static void main(String[] args) {
		
		Calendar calendar;		// java Date 클래스를 사용할 때 날짜 관련한 연산에 많은 이슈가 있어서 개선을 위해 만듦
									// Date에서 날짜 관련된 연산을 제거하면서 Calendar 사용
							// Calendar는 생성으로 객체 만들 수 없음
		
		
		calendar = Calendar.getInstance();		// Calendar는 싱글톤, 1개의 프로젝트에서 공유하는 객체
												// 객체를 만드는 게 아닌 이미 생성된 객체를 getInstance() method로 가져다 씀
		
		
		System.out.println("올해연도:" + calendar.get(Calendar.YEAR));
		System.out.println("월:" + calendar.get(Calendar.MONTH));
		System.out.println("오늘:" + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("현재시:" + calendar.get(Calendar.HOUR));
		System.out.println("현재분:" + calendar.get(Calendar.MINUTE));
		System.out.println("현재초:" + calendar.get(Calendar.SECOND));
		
		
		System.out.printf("%02d:%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
		
	}


}

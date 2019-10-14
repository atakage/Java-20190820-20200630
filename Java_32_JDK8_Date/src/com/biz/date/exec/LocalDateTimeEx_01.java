package com.biz.date.exec;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx_01 {
	
	public static void main(String[] args) {
		
		
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println("올해:" + local.getYear());
		System.out.println("이달:" + local.getMonth());
		System.out.println("오늘:" + local.getDayOfYear());
		
		System.out.printf("%02d:%02d:%02d\n", local.getHour(), local.getMinute(), local.getDayOfYear());
		
		
			
			
			System.out.println(local.plusDays(3).toString());
			System.out.println(local.minusDays(3).toString());
			
			System.out.println(local.plusHours(3).toString());
			System.out.println(local.minusHours(3).toString());
			
			System.out.println(local.with(TemporalAdjusters.firstDayOfYear()));
			
			System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));		// 이달의 첫째 주 월요일 날짜
			System.out.println(local.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY)));	// 이달의 마지막 주 월요일 날짜
			
			
			LocalDateTime makeDateTime = LocalDateTime.now();
			
			makeDateTime = makeDateTime.withYear(2000);
			makeDateTime = makeDateTime.withMonth(9);
			makeDateTime = makeDateTime.withDayOfMonth(29);
			
			makeDateTime = makeDateTime.withHour(10);
			makeDateTime = makeDateTime.withMinute(12);
			makeDateTime = makeDateTime.withSecond(22);
			System.out.println("시간 생성" + makeDateTime.toString());
			
			int curMonth = LocalDateTime.now().getYear();
			int p3Month = LocalDateTime.now().plusYears(2).getYear();
			
			System.out.printf("%d - %d = %d", p3Month, curMonth, p3Month - curMonth );
			
	}

}

package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	
	public static void main(String[] args) {
		
		String name;
		
		Scanner scanner = new Scanner(System.in); // 키보드와 JVM 사이에서 키보드의 전기 신호를 
												//컴퓨터의 이진수 정보로 변환시키는 역할을 수행하는 클래스
												//new Scanner(): 생성자 메서드라고 읽는다
												//					객체를 사용할 수 있도록 생성 초기화를 수행한다
		
		
		
		
		String strNation = new String("대한민국");
		String strKorea = "대한민국";
		
		
		String strKeyIn = new String();
		
		System.out.print("문자 입력: ");
		strKeyIn = scanner.nextLine();
		System.out.println("입력된 문자: "+ strKeyIn);
		
		
	}

}

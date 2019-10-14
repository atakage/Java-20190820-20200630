package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {

	/*
	 * 
	 * 현재 클래스에 main()메서드가 있으면 모든 멤버 변수에 static을 붙여야 main에서 그 변수에 접근 가능(메서드 동일)
	 */

	private static int[] intKor; // 배열의 개수가 정해지지 않은 상태(아직 사용X)
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intKor = new int[5];

		scanner = new Scanner(System.in);

		for (int i = 0; i < intKor.length; i++) {
				input(i);
			System.out.print(intKor[i] + ", ");
		}

	}

	public static void input(int index) {

		String val;

		System.out.print("번째 점수 입력: ");
		val = scanner.nextLine();
		intKor[index] = Integer.valueOf(val);

	}

}

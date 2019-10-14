package com.biz.arrays.service;

import java.util.Random;
import java.util.Scanner;

public class MethodService {
	
	private int intSum; 
	
	
	
	public void consoleView() { //void method는 return문 선택사항
		
		System.out.println("나는 콘솔에 표시하는 메서드");
		return ;
	}

	public int numRet() {
		int num = 100 + 200 + 300;
		return num;
		
	}
	
	public String strRet() {
		return "우리나라 만세";
	}
	
	public int getIntSum() {
		return intSum;
	}
	
	public int getSum(int num, int num2) {
		
		
		return num * num2;
		
	}
	
	public void add() {
		System.out.println("매개변수가 없는 메서드");
	}
	
	public void add(int num) {
		System.out.printf("매개변수 1개: %d\n", num);
	}
	
	public void add(int num, int num2) {
		int sum = num + num2;
		System.out.println("두 개의 매개변수 합: " + sum);
	}
	
	public void add(float f, float f2) {
		float sum = f + f2;
		System.out.printf("두 실수의 합: %f", sum);
	}
	
	
	public void ex() {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
	}
	
}

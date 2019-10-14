package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV2 {
	
	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	private int[] sum;
	
	private Scanner scan;
	
	public GradeServiceV2(int length) {
		
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];
		sum = new int[length];
		
		scan = new Scanner(System.in);
	}
	
	
	public void input() {
		
		for(int i = 0; i < intKor.length; i++) {
			this.inputKor(i);
			this.inputEng(i);
			this.inputMath(i);
			total(i);
		}
		
	}
	
	
	public void view() {
		System.out.println("=========================");
		System.out.println("성적 일람표");
		System.out.println("-------------------------");
		System.out.println("국어\t영어\t수학\t총점");
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i], sum[i]);
		}
		
	}
	
	private void inputKor(int index) {								//GradeServiceV2 클래스에 같이 있는 method에서만 호출 가능
		
			System.out.print(index+1 + "번 국어 >>");
			intKor[index] = Integer.valueOf(scan.nextLine());
		
	}
	
	private void inputEng(int index) {
		
		System.out.print(index+1 + "번 영어 >>");
		intEng[index] = Integer.valueOf(scan.nextLine());
		
	}
	
	private void inputMath(int index) {
		
		System.out.print(index+1 + "번 수학 >>");
		intMath[index] = Integer.valueOf(scan.nextLine());
	}
	
	private void total(int index) {
		sum[index] =  this.intKor[index] + this.intEng[index] + this.intMath[index];
		 
		
	}
	
	public void sort() {
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = i +1; j < sum.length; j++) {
				if(sum[i] < sum[j]) {
					int temp = sum[i];
					sum[i] = sum[j];
					sum[j] = temp;
					
					
				}
			}
		}
	}

}

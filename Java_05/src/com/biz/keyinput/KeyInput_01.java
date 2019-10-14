package com.biz.keyinput;

import java.io.IOException;
import java.util.Scanner;

public class KeyInput_01 {
	
	public static void main(String[] args) throws IOException{
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 입력:");
		name = scanner.next();
		
		System.out.println("입력된 문자: " + name);
		
		
		/*
		 * 기본형 변수, Primitive(type) 변수
		 * 첫 글자가 소문자인 키워드로 선언한 변수
		 * 
		 * int num;
		 * long lNum
		 * double dNum;
		 * boolean byes;
		 * char cA;
		 * 
		 * 참조형 변수
		 * 클래스 키워드를 이용해서 선언한 변수
		 * (클래스 키워드는 첫 글자가 대문자인 형태)
		 * 객체(Object)라고 부른다
		 * 객체의 특징 중 하나는 객체.method() 형태의 다양한 기능들을 클래스로부터 물려받아 사용할 수 있다
		 * 
		 * String st;
		 * Scanner sc;
		 *
		 */
	}

}

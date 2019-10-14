package com.biz.string;

import com.biz.service.StringService;
import com.biz.service.StringServiceImpV1;

public class String_01 {
	
	/*
	 * main method는 원칙적으로 프로젝트에 1개
	 * 이클립스 같은 개발 도구는 여러 클래스에 main() method 허용
	 * 만약 포커스가 있는 클래스에 main() method가 없으면 가장 마지막에 실행했던 클래스의 main() method 실행
	 * 	 
	 */
	
	public static void main(String[] args) {
		
		StringService strService = new StringServiceImpV1();
		strService.input();
		strService.list();
		strService.view();
		
		
		
	}

}

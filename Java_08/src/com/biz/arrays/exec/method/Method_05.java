package com.biz.arrays.exec.method;

/*
 * method의 다형성 
 * 객체지향 특징 중 한 가지로
 * method의 매개변수의 type, 개수가 다를 경우
 * method 이름 중복 가능한 특징
 * 
 * 
 * 추상화, 캡슐화, 정보 은닉과 더불어 객체지향의 중요한 특징
 * 
 */
import com.biz.arrays.service.MethodService;

public class Method_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodService ms = new MethodService();
		
		ms.add();
		ms.add(100);
		ms.add(30, 40);
		ms.add(30.f, 40.f);

	}

}

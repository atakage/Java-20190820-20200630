package com.biz.single.service;

public class SafeLazySingleV2 { // thread에 안전한, 초기화 과정을 빠르게 개선한 싱글톤 코드

	
	// volatile 잘 관리하지 않으면 날아감(휘발성)
	// java에서는 이 변수를 JVM영역에 저장하지 않고 컴퓨터 하드웨어적인 Main memory 영역에 저장해 운영체제가 관리하도록 
	private volatile static SafeLazySingleV2 instance;

	private SafeLazySingleV2() {

	}

	public static SafeLazySingleV2 getInstance() {

		if (instance == null) {

			synchronized (SafeLazySingleV2.class) {
				instance = new SafeLazySingleV2();

			}

		}

		return instance;

	}

}
